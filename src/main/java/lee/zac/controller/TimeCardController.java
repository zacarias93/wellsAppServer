package lee.zac.controller;

import lee.zac.model.TimeCard;
import lee.zac.repository.TimeCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    @RequestMapping(value = "/timecard/{employeeid}", method = RequestMethod.GET)
    public List<TimeCard> getEmployeeTimeCards(@PathVariable Long employeeid){
        Iterable<TimeCard> allTimeCards = timeCardDAO.findAll();
        List<TimeCard> employeeTimeCards = new ArrayList<>();
        for(TimeCard tc : allTimeCards) {
            if(tc.getEmployeeID() == employeeid) {
                employeeTimeCards.add(tc);
            }
        }
        return employeeTimeCards;
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.POST)
    public TimeCard addTimeCard(@RequestBody TimeCard timeCard){
        timeCardDAO.save(timeCard);
        return timeCard;
    }

    @RequestMapping(value = "/remove/{id}" , method = RequestMethod.GET)
    public String remove(@PathVariable Long id) {
        timeCardDAO.delete(id);
        return "{\"message\":\"Timecard removed!\"}";
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.OPTIONS)
    public ResponseEntity handle(){
        return new ResponseEntity(HttpStatus.OK);
    }
}
