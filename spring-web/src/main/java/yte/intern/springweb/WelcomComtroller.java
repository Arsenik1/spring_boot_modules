package yte.intern.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomComtroller {
    @RequestMapping("/welcome")
    public String noluyo()
    {
        return "welcome.html";
    }
}
