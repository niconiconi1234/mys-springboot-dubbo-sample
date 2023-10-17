package org.huajuan.dubbointerface.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;
}
