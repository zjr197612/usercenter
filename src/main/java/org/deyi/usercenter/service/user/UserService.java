package org.deyi.usercenter.service.user;

import lombok.RequiredArgsConstructor;
import org.deyi.usercenter.dao.user.UserMapper;
import org.deyi.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final UserMapper userMapper;
    public User findById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
