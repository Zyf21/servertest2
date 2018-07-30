package com.qobiko.server.controler;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/remind")
public class ReminderControler {

    @RequestMapping(value ="/get",method = RequestMethod.GET)
    @ResponseBody
    public String getRemainder(ModelMap model)
    {
        return "my remainder";


       //add line
    }
}
