package org.deyi.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("org.deyi")//扫描mapper接口
//@EnableDiscoveryClient//老版本要加
public class UsercenterApplication {

    public static void main(String[] args) {

        SpringApplication.run(UsercenterApplication.class, args);
    }

}
