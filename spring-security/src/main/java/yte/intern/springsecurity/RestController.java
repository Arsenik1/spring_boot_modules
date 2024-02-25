package yte.intern.springsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
//    @GetMapping("/gel")
//    public String dondur(){ return "test.html"; }
    @GetMapping("/admin")
//    @PreAuthorize("hasAuthority('ADMIN')") // @PreAuthorize annotation is used to decide whether a method can actually be invoked or not based on user’s role and permission.
    public String admin(){ return "admin.html"; }
    @GetMapping("/user")
    public String user(){ return "user.html"; }
}
