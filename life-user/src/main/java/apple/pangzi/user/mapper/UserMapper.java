package apple.pangzi.user.mapper;

import apple.pangzi.common.data.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getByMobile(String mobile);
}
