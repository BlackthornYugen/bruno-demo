package dev.jskw.brunodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        return User.builder().name("Bruno").age(30).build();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
//        if (user.getAge() < 18) {
//            throw new IllegalArgumentException("User must be at least 18 years old");
//        }
        return user;
    }
}
