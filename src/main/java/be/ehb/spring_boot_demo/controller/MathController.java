package be.ehb.spring_boot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(value = "/power", method = RequestMethod.POST)
    @ResponseBody
    public double power(@RequestParam(name = "x", defaultValue = "5") double x){
        return x * x;
    }
}
