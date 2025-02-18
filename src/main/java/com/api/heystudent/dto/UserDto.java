package com.api.heystudent.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
