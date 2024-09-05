package GitHub1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GitHubTestng1 {
	@Test
	  public void pak() {
		  String name = "Pakistan";
		  Assert.assertEquals(name, "Pakistan");
		  System.out.println("The Given Country is correct as: " +name);
	  }
	  
	  @Test
	  public void uk() {
		  String name = "UK";
		  Assert.assertEquals(name, "UK");
		  System.out.println("The Given Country is correct as: " +name);
	  }
	  
	  @Test
	  public void usa() {
		  String name = "USA";
		  Assert.assertEquals(name, "USA");
		  System.out.println("The Given Country is correct as: " +name);
	  }
	  
	  @Test
	  public void ja() {
		  String name = "Japan";
		  Assert.assertEquals(name, "Japan");
		  System.out.println("The Given Country is correct as: " +name);
	  }
	  
	  @Test
	  public void chi() {
		  String name = "China";
		  Assert.assertEquals(name, "China");
		  System.out.println("The Given Country is correct as: " +name);
  }
}
