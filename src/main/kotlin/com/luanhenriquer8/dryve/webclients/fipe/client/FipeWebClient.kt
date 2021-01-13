package com.luanhenriquer8.dryve.webclients.fipe.client

import org.springframework.web.reactive.function.client.WebClient
import com.luanhenriquer8.dryve.config.FipeClientConfiguration
import com.luanhenriquer8.dryve.webclients.fipe.models.BrandsResponse
import com.luanhenriquer8.dryve.webclients.fipe.models.VehiclesByBrandAndModelResponse
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClientResponseException

@Component
class FipeWebClient internal constructor(private val webClient: WebClient, fipeClientConfiguration: FipeClientConfiguration) {

    private val allVehiclesResource: String = fipeClientConfiguration.allVehiclesResource!!
    private val vehicleResource: String = fipeClientConfiguration.vehicleResource!!
    private val vehicleByBrandAndModelResource: String = fipeClientConfiguration.vehicleByBrandAndModelResource!!

    fun getAllVehicles(): MutableList<BrandsResponse> {
        return webClient
                .method(HttpMethod.GET)
                .uri(allVehiclesResource)
                .retrieve()
                .bodyToFlux(BrandsResponse::class.java)
                .doOnError { error -> handleError(error)}
                .collectList()
                .block()!!
    }

    fun getVehiclesByBrandAndModel(brandId: Long, modelId: Long): MutableList<VehiclesByBrandAndModelResponse> {
        return webClient
                .get()
                .uri(vehicleByBrandAndModelResource, brandId, modelId)
                .retrieve()
                .bodyToFlux(VehiclesByBrandAndModelResponse::class.java)
                .doOnError { error -> handleError(error)}
                .collectList()
                .block()!!
    }

    private fun handleError(error: Throwable): ResponseEntity<Any> {
        return when (error) {
            is WebClientResponseException.NotFound -> ResponseEntity.notFound().build()
            is WebClientResponseException.BadRequest -> ResponseEntity.badRequest().build()
            is WebClientResponseException.InternalServerError -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
            else -> ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build()
        }
    }

}