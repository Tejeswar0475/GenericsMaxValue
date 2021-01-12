package com.javaprogram.GenericMaxValue;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;
public class GenericMaxValueTest {

	@Test
	public void givenIntegerFirstNumberGreater()
	{
		Integer expected=100;
		GenericMaxValue genericMaxValue=new GenericMaxValue();
		Integer actualResult=genericMaxValue.getMaxValue(100, 25, 50);
		assertEquals(expected,actualResult);
	}
	
	@Test
	public void givenIntegerSecondNumberGreater()
	{
		Integer expected=250;
		GenericMaxValue genericMaxValue=new GenericMaxValue();
		Integer actualResult=genericMaxValue.getMaxValue(100, 250, 50);
		assertEquals(expected,actualResult);
	}
	
	@Test
	public void givenIntegerThirdNumberGreater()
	{
		Integer expected=500;
		GenericMaxValue genericMaxValue=new GenericMaxValue();
		Integer actualResult=genericMaxValue.getMaxValue(100, 250, 500);
		assertEquals(expected,actualResult);
	}

}
