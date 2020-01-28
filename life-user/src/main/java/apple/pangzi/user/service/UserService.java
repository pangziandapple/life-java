package apple.pangzi.user.service;

import apple.pangzi.common.data.model.User;
import apple.pangzi.common.view.model.ApiResult;

public interface UserService {

    ApiResult login(User user);
}
