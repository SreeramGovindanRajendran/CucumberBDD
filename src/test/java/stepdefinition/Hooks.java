package stepdefinition;

import io.cucumber.java.After;
import utils.Browser;

public class Hooks {

    Browser browser = new Browser();

    @After
    public void closeBrowser(){
        browser.tearDown();
    }
}
