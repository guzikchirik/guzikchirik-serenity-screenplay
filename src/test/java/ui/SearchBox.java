package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Created by Anton_Chyrko on 4/3/2018.
 */
public class SearchBox {
  public static Target SEARCH_FIELD = Target.the("search field").located(By.id("mysearch"));
}
