package com.luanhenriquer8.dryve.api.controllers

import com.luanhenriquer8.dryve.models.request.CreateVehicleRequest
import com.luanhenriquer8.dryve.services.VehiclesService
import com.luanhenriquer8.dryve.webclients.fipe.models.BrandsResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/vehicles")
class VehiclesController(private val vehiclesService: VehiclesService) {

    @GetMapping
    fun getAllVehicles(): ResponseEntity<MutableList<BrandsResponse>?> {
        return ResponseEntity.ok(vehiclesService.getAllVehicles())
    }

    @PostMapping
    fun createVehicle(@Valid @RequestBody createVehicleRequest: CreateVehicleRequest) {
        vehiclesService.createVehicle(createVehicleRequest)
    }

}