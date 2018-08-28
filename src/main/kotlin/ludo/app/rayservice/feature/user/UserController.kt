package ludo.app.rayservice.feature.user

import ludo.app.rayservice.data.dto.UserDto
import ludo.app.rayservice.feature.BaseController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController : BaseController() {

    @Autowired
    private lateinit var mUserService: UserService

    @GetMapping("/hello")
    fun hello() = ResponseEntity.ok(UserDto())
}