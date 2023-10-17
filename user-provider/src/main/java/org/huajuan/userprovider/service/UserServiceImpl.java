package org.huajuan.userprovider.service;

import com.github.javafaker.Faker;
import org.apache.dubbo.config.annotation.DubboService;
import org.huajuan.dubbointerface.dto.UserDTO;
import org.huajuan.dubbointerface.service.UserService;
import org.huajuan.dubbointerface.exception.ListUserException;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDTO> listUser() {
        int n = new SecureRandom().nextInt(20);
        int throwError = new SecureRandom().nextInt(2);
        if (throwError == 1) {
            throw new ListUserException("萨卡班甲鱼");
        }
        List<UserDTO> users = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < n; i++) {
            UserDTO user = new UserDTO();
            user.setFirstName(faker.name().firstName());
            user.setLastName(faker.name().lastName());
            user.setEmail(faker.internet().emailAddress());
            user.setAge(faker.number().numberBetween(1, 100));
            users.add(user);
        }
        return users;
    }
}
