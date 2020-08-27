import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation {

	@Given("^that I created the file correctly$")
	public void that_I_created_the_file_correctly() throws Throwable {
		System.out.println("Check one");
	}

	@When("^I execute$")
	public void i_execute() throws Throwable {
		System.out.println("Check two");
	}

	@Then("^the specification should finalize with success$")
	public void the_specification_should_finalize_with_success() throws Throwable {
		System.out.println("Check three");
	}

	Date delivery = new Date();

	@Given("^that the deadline is (\\d+)/(\\d+)/(\\d+)$")
	public void that_the_deadline_is(int day, int month, int year) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.YEAR, year);
		delivery = cal.getTime();
	}

	@When("^the delivery is delayed in (\\d+) (day|days|month|months)$")
	public void the_delivery_is_delayed_in_days(int arg1, String time) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(delivery);
		if (time.equals("days")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if (time.equals("months")) {
			cal.add(Calendar.MONTH, arg1);
		}
		delivery = cal.getTime();
	}

	@Then("^the delivery will be in (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void the_delivery_will_be_in(String date) throws Throwable {
		
			DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String dateFormated = format.format(delivery);
			Assert.assertEquals(date, dateFormated);
	}
	
	@Given("^that the ticket it is (A.\\d{3})$")
	public void thatTheTicketItIsAF(String arg1) throws Throwable {

	}

	@Given("^that the value of the ticket it is R\\$ (\\d+)\\.(\\d+)$")
	public void thatTheValueOfTheTicketItIsR$(int arg1, int arg2) throws Throwable {

	}

	@Given("^that the name of the passenger is \"(.{5,20})\"$")
	public void thatTheNameOfThePassengerIs(String arg1) throws Throwable {
			
	}

	@Given("^that the phone number is 9(\\d{3}-\\d{4})$")
	public void thatThePhoneNumberIs(int arg1) throws Throwable {

	}
	
	@Given("^that the special ticket it is (A.\\d{3})$")
	public void thatTheSpecialTicketItIsAB(String arg1) throws Throwable {

	}

	@When("^create the steps$")
	public void createTheSteps() throws Throwable {

	}

	@Then("^the test will pass$")
	public void theTestWillPass() throws Throwable {

	}


}
