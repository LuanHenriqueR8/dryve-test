package com.luanhenriquer8.dryve.models

import com.fasterxml.jackson.annotation.JsonIgnore
import lombok.Data
import javax.persistence.*

@Data
@Entity(name = "Brand")
@Table(name = "brand")
class Brand {

    @Id
    @Column(name = "brand_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: String? = null

    @Column(name = "brand_name")
    val name: String? = null

    @Column(name = "brand_fipe_id")
    val fipeId: Float? = null

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_fk")
    val vehicle: Vehicle? = null

    @OneToOne(mappedBy = "brand", cascade = [CascadeType.ALL], fetch = FetchType.EAGER, optional = true)
    val vehicleModel: VehicleModel? = null

}