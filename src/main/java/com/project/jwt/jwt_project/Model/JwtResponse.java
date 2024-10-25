package com.project.jwt.jwt_project.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private String token;
    private String username;
}
