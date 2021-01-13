package com.luanhenriquer8.dryve.repositories

import com.luanhenriquer8.dryve.models.Brand
import com.luanhenriquer8.dryve.models.Vehicle
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VehiclesRepository : JpaRepository<Vehicle, Long> {

    fun year(year: Long?): MutableList<Vehicle>
    fun licensePlate(licensePlate: String?): MutableList<Vehicle>
    fun brand(brand: Brand?): MutableList<Vehicle>
}