package testpackage;

import org.testng.annotations.Test;

import packagedemo.Day1;

public class test1 {
	
	Day1 day1;
	public test1()
	{
		day1=new Day1();
	}
	
	@Test
	public void ttest2()
	{
		day1.getusername("naresh");	
	}

}
