package com.project.jwt.jwt_project.repositories;

import com.project.jwt.jwt_project.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositories extends JpaRepository<UserModel,String> {

    public Optional<UserModel> findByUsername(String username);
}
