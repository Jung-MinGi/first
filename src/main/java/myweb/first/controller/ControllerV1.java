package myweb.first.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class ControllerV1 {
    @RequestMapping("/index")
    String newForm(@RequestParam(defaultValue = "1") String n){
        if(n.equals("1")){
            log.info("정상 입니다 ={}",n);
        }else if(n.equals("2")){
            log.error("에러 입니다 ={}",n);
        }else{
            log.warn("경고 입니다 ={}",n);
        }
        return "index";
    }
}
