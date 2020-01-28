package apple.pangzi.user.controller;

import apple.pangzi.common.data.model.User;
import apple.pangzi.common.view.model.ApiResult;
import apple.pangzi.user.mapper.UserMapper;
import apple.pangzi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ApiResult login(@RequestBody User user) {
        return userService.login(user);
    }
}
