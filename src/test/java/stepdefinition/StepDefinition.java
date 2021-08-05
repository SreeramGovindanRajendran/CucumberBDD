package stepdefinition;

import io.cucumber.java.en.Given;
import utils.Driver;

public class StepDefinition extends Driver{

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("write a condition");
	   init();
	   tearDown();
	}
	
}
