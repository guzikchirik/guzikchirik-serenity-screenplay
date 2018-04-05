package ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Created by Anton_Chyrko on 4/4/2018.
 */
public class Logo implements Question<String>{

  public static Target Logo = Target.the("logo").located(By.id("logo"));

  @Override
  public String answeredBy(Actor actor) {
    return Logo.resolveFor(actor).getAttribute("src");
  }
}
