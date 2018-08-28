package ludo.app.rayservice.data.entity

import javax.persistence.*

@Entity
@Table(name = "user")
data class User(@Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                val id: Long = 0,
                val email: String = "")