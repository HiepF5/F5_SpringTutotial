package com.example.springusertutorial.restcontroller;

import com.example.springusertutorial.entity.User;
import com.example.springusertutorial.exception.UserNotFoundException;
import com.example.springusertutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class UserRestController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public User newUser (@RequestBody User newUser){
        return userRepository.save(newUser);
    }
    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    public User getViewUsers(@PathVariable int id){
        return userRepository.findById(id)
        .orElseThrow(()->new UserNotFoundException(id));
    }
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable int id)
    {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));

    }
    @DeleteMapping("user/{id}")
    String deleteUser(@PathVariable int id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id " + id +" has been deleted success.";
    }

}
