package lee.zac;

import lee.zac.model.TimeCard;
import lee.zac.repository.TimeCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrAppApplication implements CommandLineRunner {



	@Autowired
	TimeCardDAO timeCardDAO;

	public static void main(String[] args) {
		SpringApplication.run(HrAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TimeCard timeCard1 = new TimeCard(1, "9:00am", "9:00pm");
		TimeCard timeCard2 = new TimeCard(2, "10:00am", "8:00pm");
		TimeCard timeCard3 = new TimeCard(3, "11:00am", "6:00pm");
		TimeCard timeCard4 = new TimeCard(1, "11:00am", "6:00pm");
		timeCardDAO.save(timeCard1);
		timeCardDAO.save(timeCard2);
		timeCardDAO.save(timeCard3);
		timeCardDAO.save(timeCard4);
	}
}
