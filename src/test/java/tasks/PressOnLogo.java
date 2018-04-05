package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.GuzikchirikGithubioPage;

/**
 * Created by Anton_Chyrko on 4/4/2018.
 */
public class PressOnLogo implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(GuzikchirikGithubioPage.logo()));
  }

  public static PressOnLogo press() {
    return instrumented(PressOnLogo.class);
  }
}
