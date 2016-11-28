package lee.zac.controller;

import lee.zac.model.TimeCard;
import lee.zac.repository.TimeCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Iterator;

/*** Created by zaclee on 10/26/16. ***/
@RestController
@CrossOrigin
public class TimeCardController {

    @Autowired
    TimeCardDAO timeCardDAO;

    @RequestMapping(value = "/timecard", method = RequestMethod.GET)
    public Iterable<TimeCard> getAllTimeCard(){
        return timeCardDAO.findAll();
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.POST)
    public TimeCard submitTimeCard(@RequestBody TimeCard timeCard){
        timeCardDAO.save(timeCard);
        return timeCard;
    }

    @RequestMapping(value = "/remove/{id}" , method = RequestMethod.GET)
    public Iterable<TimeCard> remove(@PathVariable long id) {
        timeCardDAO.delete(id);
        return timeCardDAO.findAll();
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.OPTIONS)
    public ResponseEntity handle(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
