package yte.intern.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParseController {
    @RequestMapping("/courses/{courseNumber}")
    public void courses(@PathVariable("courseNumber") Long courseNumber, @RequestParam("name") String name, @RequestParam("instructor") String instructor)
    {
        System.out.println("Output: " + courseNumber + " " + name + " " + instructor);
    }
}
