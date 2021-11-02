package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotation {
  @Test
  public void f() {
	  System.out.println("First Test NG Method");
  }
  @Test
  public void s() {
	  System.out.println("Second Test NG Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before Method launched before every test annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after Method launched after every test annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class launched before method  annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class launched after method annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test launched before class  annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test launched after class  annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before Suite launched before test  annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite launched after test  annotation");
  }

}
