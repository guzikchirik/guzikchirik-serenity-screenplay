package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import ui.GuzikchirikGithubioPage;

/**
 * Created by Anton_Chyrko on 4/3/2018.
 */

public class OpenTheHomePage implements Task {

  GuzikchirikGithubioPage guzikchirikGithubioPage;

  @Step("Open the home page")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn().the(guzikchirikGithubioPage));
  }
}
