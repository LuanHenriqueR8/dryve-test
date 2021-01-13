package com.luanhenriquer8.dryve.models.request

data class CreateVehicleRequest(
        var licensePlate: String? = null,
        var advertisingPrice: Long? = null,
        var year: Long? = null,
        var fipePrice: Long? = null,
        var brandId: Long? = null,
        var vehicleModelId: Long? = null
)