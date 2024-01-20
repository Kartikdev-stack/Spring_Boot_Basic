package io.aiven.spring.mysql.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController


//the below line means the url starts with demo
@RequestMapping(path = "/demo")
public class MainController {

//  here spring automatically creates a variable/object of the userRepo inteface and this variable basically handles our data
    @Autowired
    private UserRepository userRepository;

    //below line is exclusively for Post requests when we want to create a user

    @PostMapping(path = "/add")
    //response body basically means that we are trying to return a user as a response
    public @ResponseBody User addNewUser(@RequestParam String name, @RequestParam String email){
        System.out.println("Entrypoint: "+ name+email);
        User springUser=new User();
        springUser.setName(name);
        springUser.setEmail(email);
        userRepository.save(springUser);
        return springUser;
    }


    //get request to list all the users
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

}
