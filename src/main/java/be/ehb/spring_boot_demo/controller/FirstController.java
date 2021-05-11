package be.ehb.spring_boot_demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class FirstController {

    @RequestMapping(value = "/lucky" , method = RequestMethod.GET)
    @ResponseBody
    public int luckyNumber(){
        Random mRandom = new Random();
        return mRandom.nextInt(10) + 1;
    }

}
