package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.questions.page.PageTitleQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Created by Anton_Chyrko on 4/3/2018.
 */
@DefaultUrl("https://guzikchirik.github.io/")
public class GuzikchirikGithubioPage extends PageObject {

  private final static By MOZILLA_MANIFESTO_LINK = By.id("mozilla_manifesto");
  private final static By TECHNOLOGISTS_LINK = By.id("technologists");
  private final static By THINKERS_LINK = By.id("thinkers");
  private final static By BUILDERS_LINK = By.id("builders");
  private final static By LOGO = By.id("logo");


  public static Target mozillaManifestoLink() {
    return Target.the("mozillaManifestoLink").located(MOZILLA_MANIFESTO_LINK);
  }

  public static Target technologistsLink() {
    return Target.the("technologistsLink").located(TECHNOLOGISTS_LINK);
  }

  public static Target thinkersLink() {
    return Target.the("thinkersLink").located(THINKERS_LINK);
  }

  public static Target buildersLink() {
    return Target.the("buildersLink").located(BUILDERS_LINK);
  }

  public static Target logo() {
    return Target.the("logo").located(LOGO);
  }

  public static Logo logoAttribute() {
    return new Logo();
  }
}
