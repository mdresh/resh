package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    WebDriver driver = new ChromeDriver();

    @Given("the user is on the Amazon homepage")
    public void userIsOnAmazonHomepage() {
        driver.get("https://www.amazon.in/");
    }

    @When("the user searches for {string}")
    public void userSearchesForProduct(String product) {
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(product);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Then("the search results page should display relevant products")
    public void searchResultsDisplayed() {
        // Add assertion logic to validate search results if necessary
    }

    @Then("the user selects the specific product")
    public void userSelectsProduct() {
        driver.findElement(By.partialLinkText("Apple iPhone 14 (128 GB) - Midnight")).click();
    }

    @Then("the product details page should be displayed")
    public void productDetailsPageDisplayed() {
        // Add assertion logic to validate product details page if necessary
        //driver.quit();
    }
}
