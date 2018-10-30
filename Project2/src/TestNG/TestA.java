package TestNG;

import org.testng.annotations.Test;

public class TestA {
	
	@Test
	public void TestMethod() throws InterruptedException {
		System.out.println("start test A");
		Thread.sleep(2000);
		System.out.println("End Test A");

	}

}
