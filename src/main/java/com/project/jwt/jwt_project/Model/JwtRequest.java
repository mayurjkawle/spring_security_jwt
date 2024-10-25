package com.project.jwt.jwt_project.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {

    private String username;
    private String password;

}
