package jbehave.steps.hotels;

import com.structure.core.pages.hotels.SearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class FilterPanelSteps extends ScenarioSteps {

    private SearchResultPage searchResultPage;

    public FilterPanelSteps(final Pages pages) {
        super(pages);
        this.searchResultPage = getPages().getPage(SearchResultPage.class);
    }

    @Step
    public void checkAmasingFiltr() {
        searchResultPage.getFilterPanel()
                .checkFirstFiltr();
    }

    @Step
    public void checkCancellationFiltr() {
        searchResultPage.getFilterPanel()
                .checkSecondFiltr();
    }

    @Step
    public boolean isSearchResultListContainsFirstFilterParameter(final String firstFilter) {

        return searchResultPage.getResultsPanel()
                .getResultItemsByFirstFilter().stream().allMatch(s -> s.contains(firstFilter));
    }

    @Step
    public boolean isSearchResultListContainsSecondFilterParameter(final String secondFilter) {
        return searchResultPage.getResultsPanel().getResultBySecondFilter().stream().allMatch(s -> s.contains(secondFilter));
    }
}
