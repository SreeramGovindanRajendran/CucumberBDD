package stepdefinition;

import actions.BrowserActions;
import io.cucumber.java.en.Given;
import utils.Browser;

public class StepDefinition extends Browser {

	BrowserActions browserActions = new BrowserActions();

	@Given("I launch the browser")
	public void i_launch_the_browser() {
		init();
	}

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		browserActions.launchURL();
	}
	
}
