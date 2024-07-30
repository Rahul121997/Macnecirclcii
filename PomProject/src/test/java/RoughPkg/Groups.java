package RoughPkg;

import org.testng.annotations.Test;

public class Groups {
	
	
	@Test
	public void Hello()
	{
		System.out.println("Hello");
	}
	
	@Test(groups= {"sanity"})
	public void Hello1()
	{
		System.out.println("sanity1");
	}
	
	@Test(groups= {"sanity"})
	public void Hello2()
	{
		System.out.println("sanity2");
	}
	@Test(groups= {"sanity"})
	public void Hello3()
	{
		System.out.println("sanity3");
		
	}
	@Test
	public void Hello4()
	{
		System.out.println("Hello4");
	}

}
