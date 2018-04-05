package tests;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.CoreMatchers.containsString;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tasks.OpenTheHomePage;
import tasks.PressOnLogo;
import tasks.Search;
import ui.GuzikchirikGithubioPage;

/**
 * Created by Anton_Chyrko on 4/3/2018.
 */
@RunWith(SerenityRunner.class)
public class FirstTestExample {

  Actor anton = Actor.named("Anton");

  @Managed(uniqueSession = true)
  public WebDriver hisBrowser;

  @Steps
  OpenTheHomePage openTheHomePage;

  @Before
  public void antonCanBrowseTheWeb() {
    anton.can(BrowseTheWeb.with(hisBrowser));
  }

  @Test
  public void clickOnMozillaManifestoLink() {
    givenThat(anton).wasAbleTo(openTheHomePage);
    when(anton).attemptsTo(Click.on(GuzikchirikGithubioPage.mozillaManifestoLink()));
    then(anton)
        .should(eventually(seeThat(TheWebPage.title(), containsString("The Mozilla Manifesto"))));
  }

  @Test
  public void typeAnyTextToSearchBox() {
    givenThat(anton).wasAbleTo(openTheHomePage);
    when(anton).attemptsTo(Search.forTheTerms("This search is not working now!","And this search isn't working too"));
  }

  @Test
  public void changeImageLogo() {
    givenThat(anton).attemptsTo(openTheHomePage);
    when(anton).attemptsTo(PressOnLogo
        .press()); //TODO or when(anton).attemptsTo(Click.on(GuzikchirikGithubioPage.logo())); ---???
    then(anton).should(eventually(seeThat(GuzikchirikGithubioPage.logoAttribute(),
        containsString("https://guzikchirik.github.io/images/google-icon.png"))));
  }
}

