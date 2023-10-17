package org.huajuan.dubbointerface.service;

import org.huajuan.dubbointerface.dto.UserDTO;

import java.util.List;

public interface UserService {

    public List<UserDTO> listUser();
}
