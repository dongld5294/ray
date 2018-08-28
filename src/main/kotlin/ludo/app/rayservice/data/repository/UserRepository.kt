package ludo.app.rayservice.data.repository

import ludo.app.rayservice.data.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long> {

}