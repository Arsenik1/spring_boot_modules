package yte.intern.springweb;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/indexing")
    public User[] index(@RequestBody @Valid User[] user)
    {
        System.out.println( user[0]);
        return user;
    }
}
