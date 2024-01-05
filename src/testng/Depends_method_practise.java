package testng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_method_practise {
  @Test
  public void f() {
	  
	  System.out.println("this is f");
	  Assert.fail();
  }
  
  @Test(dependsOnMethods = "f")
  public void f2() {
	  System.out.println("this is f2");
	  
  }
  @Test
  public void test_prac(){
	  System.out.println("this is test method");
  }
}
