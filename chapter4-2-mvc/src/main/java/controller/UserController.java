package controller;

import annotation.CheckToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import service.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ResponseEntity<?> checkAndSave(@RequestBody @Valid User user, Errors errors){
        System.out.println(user);
        if(errors.hasErrors()){
            errors.getAllErrors().forEach(obj-> System.out.println(obj));
        }
        return new ResponseEntity<User>(userService.save(user), HttpStatus.OK);
    }

    @RequestMapping("/test2")
    @CheckToken
    public ResponseEntity<?> checkAndSave2(@RequestBody User user, Errors errors){
        System.out.println(user);
        if(errors.hasErrors()){
            errors.getAllErrors().forEach(obj-> System.out.println(obj));
        }
        return new ResponseEntity<User>(userService.save(user), HttpStatus.OK);
    }

    @RequestMapping("/test3")
    public ResponseEntity<?> checkAndSave3(@Valid  User user){
        System.out.println(user);
        return new ResponseEntity<User>(userService.save(user), HttpStatus.OK);
    }


}
