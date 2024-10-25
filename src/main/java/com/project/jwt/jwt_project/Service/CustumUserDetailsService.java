package com.project.jwt.jwt_project.Service;

import com.project.jwt.jwt_project.Model.UserModel;
import com.project.jwt.jwt_project.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustumUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepositories userRepositories;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userRepositories.findByUsername(username).orElseThrow(() -> new RuntimeException("User is not found "));
        return userModel;
    }
}
