package swarnamaven;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 {

@Test
public void tc1() {
Reporter.log("swarna",true);

	
}
@Test
public void tc2()
{
	Reporter.log("testng execution" );
	//Assert.fail();
}
}