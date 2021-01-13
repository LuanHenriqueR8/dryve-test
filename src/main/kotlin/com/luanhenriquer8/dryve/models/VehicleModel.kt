package com.luanhenriquer8.dryve.models

import com.fasterxml.jackson.annotation.JsonIgnore
import lombok.Data
import javax.persistence.*

@Data
@Entity(name = "VehicleModel")
@Table(name = "vehicle_model")
class VehicleModel {

    @Id
    @Column(name = "vehicle_model_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: String? = null

    @Column(name = "vehicle_model_name")
    val name: String? = null

    @Column(name = "vehicle_model_fipe_id")
    val fipeId: Float? = null

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_fk")
    val brand: Brand? = null
}