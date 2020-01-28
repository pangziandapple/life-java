package apple.pangzi.user.controller;

import apple.pangzi.common.view.model.ApiResult;
import apple.pangzi.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/login")
    public ApiResult login() {
        userMapper.getByMobile("");
        return ApiResult.success();
    }
}
