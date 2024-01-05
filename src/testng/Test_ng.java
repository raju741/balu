package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_ng {
  @Test
  public void f() {
	  System.out.println("hi");
	  
	  
  }
  
  @BeforeTest
  public void f1() {
	  System.out.println("hi to");
  }
  @AfterTest
  public void f2() {
	  System.out.println("hi to everey");
}
  @BeforeMethod 
  public void f3() {
	  System.out.println("charani");
}
  @AfterMethod
  public void f4() {
	  System.out.println("infotech");
  }
  @BeforeClass
  public void f5() {
	  System.out.println("BBBB");
  }
  @AfterClass
  public void f6() {
	  System.out.println("sssss");
  }
}