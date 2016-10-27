package lee.zac.model;

import javax.persistence.*;

/*** Created by zaclee on 10/26/16. ***/

@Entity
@Table(name="timecard")
public class TimeCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long employeeID;
    private String timeIn;
    private String timeOut;

    public TimeCard() {}

    public TimeCard(long employeeID, String timeIn, String timeOut){
        this.employeeID = employeeID;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
}
