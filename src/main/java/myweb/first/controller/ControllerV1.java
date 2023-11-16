package myweb.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerV1 {
    @RequestMapping("/index")
    String newForm(){
        System.out.println("ControllerV1.newForm");
        return "index";
    }
}
