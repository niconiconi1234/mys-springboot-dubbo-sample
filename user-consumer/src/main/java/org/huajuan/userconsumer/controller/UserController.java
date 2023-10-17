package org.huajuan.userconsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.huajuan.dubbointerface.dto.UserDTO;
import org.huajuan.dubbointerface.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/list")
    public List<UserDTO> list(){
        return userService.listUser();
    }

}
