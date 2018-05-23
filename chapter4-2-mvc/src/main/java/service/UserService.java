package service;

import org.springframework.stereotype.Service;
import pojo.User;

@Service
public class UserService {

    public User save(User user){
        System.out.println("已保存"+user);
        return user;
    }
}
