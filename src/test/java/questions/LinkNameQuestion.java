package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

/**
 * Created by Anton_Chyrko on 4/4/2018.
 */
public class LinkNameQuestion implements Question<String>{

  public LinkNameQuestion() {
  }

  @Override
  public String answeredBy(Actor actor) {
    return null;
  }
}
