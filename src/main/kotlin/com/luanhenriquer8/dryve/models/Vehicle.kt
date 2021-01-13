package com.luanhenriquer8.dryve.models

import lombok.Data
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotNull

@Data
@Entity(name = "Vehicle")
@Table(name = "vehicle")
class Vehicle(

    @Id
    @Column(name = "vehicle_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,

    @NotNull(message = "License plate cannot be empty")
    @Column(name = "vehicle_license_plate", nullable = false)
    val licensePlate: String? = null,

    @NotNull
    @Column(name = "vehicle_advertising_price", nullable = false)
    val advertisingPrice: Float? = null,

    @NotNull
    @Column(name = "vehicle_year", nullable = false)
    val year: Long? = null,

    @Column(name = "vehicle_fipe_price")
    val fipePrice: Float? = null,

    @Column(name = "vehicle_register_date")
    var registerDate: LocalDateTime? = null,

    @OneToOne(mappedBy = "vehicle", cascade = [CascadeType.ALL], fetch = FetchType.EAGER, optional = true)
    val brand: Brand? = null)

