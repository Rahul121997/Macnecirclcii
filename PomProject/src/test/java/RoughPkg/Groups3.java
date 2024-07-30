package RoughPkg;

import org.testng.annotations.Test;

public class Groups3 {
	@Test
	public void Hello3()
	{
		System.out.println("Hello");
	}
	
	@Test(groups= {"reg"})
	public void Hello13()
	{
		System.out.println("reg");
	}
	
	@Test(groups= {"reg"})
	public void Hello23()
	{
		System.out.println("reg");
	}
	@Test(groups= {"reg"})
	public void Hello33()
	{
		System.out.println("reg");
		
	}
	@Test
	public void Hello43()
	{
		System.out.println("reg");
	}

}
