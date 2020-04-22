package org.deyi.usercenter.web;

import lombok.RequiredArgsConstructor;
import org.deyi.usercenter.dao.user.UserMapper;
import org.deyi.usercenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {
    private final UserMapper userMapper;
    @GetMapping("/test")
    public User addUser(){
        User user = new User().builder()
                .userAvatarUrl("http://head.jpg")
                .userBonus(300)
                .userRoles("用户")
                .userCreateTime(new Date())
                .userUpdateTime(new Date())
                .wxId("wei006")
                .wxNickname("树木")
                .build();
        userMapper.insertSelective(user);
        return user;
    }
}
