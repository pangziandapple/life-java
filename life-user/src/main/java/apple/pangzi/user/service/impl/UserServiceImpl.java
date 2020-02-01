package apple.pangzi.user.service.impl;

import apple.pangzi.common.data.model.User;
import apple.pangzi.common.view.model.ApiResult;
import apple.pangzi.user.mapper.UserMapper;
import apple.pangzi.user.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ApiResult login(User user) {
        if (user == null) {
            return ApiResult.error("请求体不能为空！");
        }

        if(StringUtils.isEmpty(user.getMobile())){
            return ApiResult.error("用户名不能为空！");
        }

        if(StringUtils.isEmpty(user.getPassword())){
            return ApiResult.error("用户密码不能为空！");
        }

        User resultUser = userMapper.getByMobile(user.getMobile());
        if(resultUser == null || !resultUser.getPassword().equals(user.getPassword())){
            return ApiResult.error("用户名密码不正确！");
        }
        return ApiResult.success();
    }
}
