package org.deyi.usercenter.web.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.deyi.usercenter.domain.entity.user.User;
import org.deyi.usercenter.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {
    private final UserService userService;
    @GetMapping("/{id}")
    public User findByid(@PathVariable Integer id){
        log.info("被请求了...");
        return userService.findById(id);
    }
}
