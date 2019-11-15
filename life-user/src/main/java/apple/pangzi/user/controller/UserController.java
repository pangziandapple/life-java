package apple.pangzi.user.controller;

import apple.pangzi.common.view.model.ApiResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/login")
    public ApiResult login() {
        return ApiResult.success();
    }
}
