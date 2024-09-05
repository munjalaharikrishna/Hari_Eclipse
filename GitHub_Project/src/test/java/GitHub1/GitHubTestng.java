package GitHub1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GitHubTestng {
	@Test
	  public void ind() {
		  String name = "India";
		  Assert.assertEquals(name, "India");
		  System.out.println("The Given Country is correct as: " +name);
	  }
	  
	  @Test
	  public void aus() {
		  String name = "Australia";
		  Assert.assertEquals(name, "Australia");
		  System.out.println("The Given Country is correct as: " +name);
	  }
	  
	  @Test
	  public void scot() {
		  String name = "Scotland";
		  Assert.assertEquals(name, "Scotland");
		  System.out.println("The Given Country is correct as: " +name);
	  }
	  
	  @Test
	  public void ire() {
		  String name = "Ireland";
		  Assert.assertEquals(name, "Ireland");
		  System.out.println("The Given Country is correct as: " +name);
	 	  
	 
  }
}
