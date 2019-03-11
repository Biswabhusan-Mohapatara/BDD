package com.crm.stepdeifination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.products.genericlib.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateProducts {
      WebDriver driver;
      BaseClass  base=new BaseClass();
      
      @Given("^Launch the application$")
      public void launch_the_application() throws Throwable {
          base.configBC();
          System.out.println("Launch the Application");
      }

      @When("^login to application with valid usernme and password$")
      public void login_to_application_with_valid_usernme_and_password() throws Throwable {
          base.configBM();
          System.out.println("login to application with valid usernme and password");
      }

      @Then("^Homepage should be dispalay$")
      public void homepage_should_be_dispalay() throws Throwable {
          System.out.println("Homepage should be dispalay");
      }

      @When("^click on products link$")
      public void click_on_products_link() throws Throwable {
         driver.findElement(By.linkText("Products")).click();
         System.out.println("click on products link");
      }

      @Then("^product page should be display$")
      public void product_page_should_be_display() throws Throwable {
         System.out.println("product page should be display");
      }

      @When("^click on create new product page$")
      public void click_on_create_new_product_page() throws Throwable {
          System.out.println("click on create new product page");
      }

      @Then("^create product page should be dispaly$")
      public void create_product_page_should_be_dispaly() throws Throwable {
         System.out.println("create product page should be dispaly");
      }

      @When("^create a product$")
      public void create_a_product() throws Throwable {
         System.out.println("create a product");
      }

      @Then("^product should be created$")
      public void product_should_be_created() throws Throwable {
         System.out.println("product should be created");
      }

      @Then("^verify the product details$")
      public void verify_the_product_details() throws Throwable {
         
      }

      @Then("^verify the successful message$")
      public void verify_the_successful_message() throws Throwable {
         
      }

      @Then("^logout$")
      public void logout() throws Throwable {
         
      }

      @Then("^close the browser$")
      public void close_the_browser() throws Throwable {
         
      }


}
