package lee.zac.controller;

import lee.zac.model.TimeSheet;
import lee.zac.repository.TimeCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*** Created by zaclee on 10/26/16. ***/
@CrossOrigin
@RestController
public class TimeCardController {

    @Autowired
    TimeCardDAO timeCardDAO;

    @RequestMapping(value = "/timecard", method = RequestMethod.GET)
    public Iterable<TimeSheet> getAllTimeCard(){
        return timeCardDAO.findAll();
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.POST)
    public TimeSheet addTimeCard(@RequestBody TimeSheet timeSheet){
        timeCardDAO.save(timeSheet);
        return timeSheet;
    }






//    @RequestMapping(value = "/remove/{id}" , method = RequestMethod.GET)
//    public String remove(@PathVariable Long id) {
//        timeCardDAO.delete(id);
//        return "{\"message\":\"Timecard removed!\"}";
//    }

//    @RequestMapping(value = "/timecard" , method = RequestMethod.OPTIONS)
//    public ResponseEntity handle(){
//        return new ResponseEntity(HttpStatus.OK);
//    }

    //    @RequestMapping(value = "/timecard/{employeeid}", method = RequestMethod.GET)
//    public List<TimeSheet> getEmployeeTimeCards(@PathVariable Long employeeid){
//        Iterable<TimeSheet> allTimeCards = timeCardDAO.findAll();
//        List<TimeSheet> employeeTimeCards = new ArrayList<>();
//        for(TimeSheet tc : allTimeCards) {
//            if(tc.getEmployeeID() == employeeid) {
//                employeeTimeCards.add(tc);
//            }
//        }
//        return employeeTimeCards;
//    }
}
