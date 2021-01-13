package com.luanhenriquer8.dryve.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@PropertySource("classpath:application.properties")
open class FipeClientConfiguration {

    @Value("\${fipe.client.base-url}")
    var baseUrl: String? = null

    @Value("\${fipe.client.vehicles}")
    var allVehiclesResource: String? = null

    @Value("\${fipe.client.vehicle}")
    var vehicleResource: String? = null

    @Value("\${fipe.client.vehicle-by-brand-and-model}")
    var vehicleByBrandAndModelResource: String? = null
}