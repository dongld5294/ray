package ludo.app.rayservice.feature.user

import ludo.app.rayservice.data.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired
    private lateinit var mUserRepository: UserRepository
}