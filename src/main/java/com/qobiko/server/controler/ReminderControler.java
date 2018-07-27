package com.qobiko.server.controler;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/remind")
public class ReminderControler {

    @RequestMapping(value ="/get",method = RequestMethod.GET)
    public String getRemainder()
    {
        return "my remainder";
    }
}
