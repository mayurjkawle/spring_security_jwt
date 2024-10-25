package com.project.jwt.jwt_project.Service;

import com.project.jwt.jwt_project.Model.UserModel;
import com.project.jwt.jwt_project.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {


//    List<UserModel> users = new ArrayList<>();

//    UserService(){
//        users.add(new UserModel(1, "mayurkawle", "mayur", "Mayur Kawle"));
//        users.add(new UserModel(2, "cjkawle", "chetan", "Chetan Kawle"));
//        users.add(new UserModel(3, "vikas", "vikas", "Vikas Sawle"));
//        users.add(new UserModel(4, "swapnali", "swapnali", "Swapnali Sawle"));
//        users.add(new UserModel(5, "diksha", "diksha", "Diksha Sonowane"));
//        users.add(new UserModel(6, "nikhil", "nikhil", "Nikhil Sonowane"));
//    }

    @Autowired
    UserRepositories userRepositories;
    @Autowired
    PasswordEncoder passwordEncoder;
    public List<UserModel> getUser(){
        return userRepositories.findAll();
    }

//    public UserModel getUsersById(long id){
//        for (UserModel user : users){
//            if (user.getId() == id){
//                return user;
//            }
//        }
//        return null;
//    }

    public UserModel addUser(UserModel user){
        Random random = new Random();

//        user.setId(Long.parseLong(UUID.randomUUID().toString()));
        user.setId(random.nextLong());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepositories.save(user);
    }
}
