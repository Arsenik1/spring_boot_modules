package yte.intern.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @RequestMapping("/index")
    public Person[] index(@RequestBody Person[] person)
    {
        System.out.println(" " + person[0] + " " +  person[1] + " " +  person[2]);
        person[0].age += 1;
        person[1].age += 1;
        person[2].age += 1;
        return person;
    }
}
