package lee.zac.controller;

import lee.zac.model.TimeCard;
import lee.zac.repository.TimeCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*** Created by zaclee on 10/26/16. ***/
@RestController
@CrossOrigin(origins = "http://localhost:9000")
public class TimeCardController {

    @Autowired
    TimeCardDAO timeCardDAO;

    @RequestMapping(value = "/timecard", method = RequestMethod.GET)
    public Iterable<TimeCard> getAllTimeCard(){
        return timeCardDAO.findAll();
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.POST) //Post marshalls data into an object
    public TimeCard submitTimeCard(@RequestBody TimeCard timeCard){
        timeCardDAO.save(timeCard);
        return timeCard;
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.OPTIONS)
    public ResponseEntity handle(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Hello World";
    }
}
