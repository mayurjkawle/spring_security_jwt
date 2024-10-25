package com.project.jwt.jwt_project.Controller;

import com.project.jwt.jwt_project.Model.UserModel;
import com.project.jwt.jwt_project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String testAPI(){
        return "This is a test api response";
    }

    @GetMapping("/users")
    public List<UserModel> getUsers(){
        return userService.getUser();
    }

//    @GetMapping("/user/{id}")
//    public UserModel getUserById(@PathVariable long id){
//        return userService.getUsersById(id);
//    }
}
