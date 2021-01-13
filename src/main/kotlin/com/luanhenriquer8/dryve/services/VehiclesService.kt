package com.luanhenriquer8.dryve.services

import com.luanhenriquer8.dryve.models.Vehicle
import com.luanhenriquer8.dryve.models.request.CreateVehicleRequest
import com.luanhenriquer8.dryve.repositories.VehiclesRepository
import com.luanhenriquer8.dryve.webclients.fipe.client.FipeWebClient
import com.luanhenriquer8.dryve.webclients.fipe.models.BrandsResponse
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class VehiclesService(private val vehiclesRepository: VehiclesRepository, private val fipeWebClient: FipeWebClient) {

    fun getAllVehicles(): MutableList<BrandsResponse> {
        return fipeWebClient.getAllVehicles()
    }

    fun createVehicle(requestData: CreateVehicleRequest) {
        val allBrands = fipeWebClient
                .getVehiclesByBrandAndModel(requestData.brandId!!, requestData.vehicleModelId!!)

        if (allBrands.isEmpty()) throw Exception()

        allBrands.let { responseList ->
            val foundVehicleByYear = responseList
                    .find { item -> item.key.contains(requestData.year.toString(), true) }

            if (!isVehicleExistingOnDataBase(requestData.year, requestData.licensePlate)) {

                // todo more validations and persist data
                foundVehicleByYear

            } else throw Exception("That car already exist on data base")
        }


        allBrands.map { Vehicle() }


//        vehicle.registerDate = LocalDateTime.now()

    }

    private fun isVehicleExistingOnDataBase(year: Long?, licensePlate: String?): Boolean {

        return false

//        vehiclesRepository.licensePlate(licensePlate).isNotEmpty()
//                || vehiclesRepository.year(year).isNotEmpty()
    }

    private fun isBrandNotExistOnDataBase() {

    }
}