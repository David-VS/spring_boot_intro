package be.ehb.spring_boot_demo.controller;

import be.ehb.spring_boot_demo.model.DataSource;
import be.ehb.spring_boot_demo.model.Evenement;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@Controller()
public class EvenementenController {

    private DataSource dataSource = new DataSource();

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @ResponseBody
    public HashSet<Evenement> getAll(){
        return dataSource.getEvenementHashSet();
    }

    @RequestMapping(value = "/events/new", method = RequestMethod.POST)
    @ResponseBody
    public HttpStatus addEvent(@RequestParam(name = "id") int id,
                               @RequestParam(name = "naam")String naam,
                               @RequestParam(name = "soort")String soort){
        Evenement newEvenement = new Evenement(id, naam, soort);
        dataSource.addEvenement(newEvenement);

        return HttpStatus.OK;
    }
}
