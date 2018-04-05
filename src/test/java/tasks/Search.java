package tasks;

import static java.util.Arrays.asList;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import ui.SearchBox;

/**
 * Created by Anton_Chyrko on 4/3/2018.
 */
public class Search implements Task {

  private final List<String> searchTerms;

  public Search(List<String> searchTerms) {
    this.searchTerms = ImmutableList.copyOf(searchTerms);
  }

  @Step("Search for KeyWord")
  public <T extends Actor> void performAs(T actor) {

    searchTerms.forEach(
        searchTerm -> Enter.theValue(searchTerm).into(SearchBox.SEARCH_FIELD)
            .thenHit(Keys.ENTER));

//    actor.attemptsTo(Enter.theValue(searchTerm).into(SearchBox.SEARCH_FIELD).thenHit(Keys.ENTER));
  }

  public static Search forTheTerms(String... searchTerms) {
    return Instrumented.instanceOf(Search.class).withProperties(asList(searchTerms));
  }
}
