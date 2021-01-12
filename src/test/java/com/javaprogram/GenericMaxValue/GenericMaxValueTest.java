package com.javaprogram.GenericMaxValue;

import static org.junit.Assert.*;
import java.lang.*;
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
	
	
	@Test
	public void givenFloatFirstNumberGreater()
	{
		Float expected=100.25f;
		GenericMaxValue genericMaxValue=new GenericMaxValue();
		Float actualResult=genericMaxValue.getMaxFloatValue(100.25f, 98.50f, 90.50f);
		assertEquals(expected,actualResult);
	}
	
	@Test
	public void givenFloatSecondNumberGreater()
	{
		Float expected=100.25f;
		GenericMaxValue genericMaxValue=new GenericMaxValue();
		Float actualResult=genericMaxValue.getMaxFloatValue(98.50f,100.25f, 90.50f);
		assertEquals(expected,actualResult);
	}
	
	@Test
	public void givenFloatThirdNumberGreater()
	{
		Float expected=100.25f;
		GenericMaxValue genericMaxValue=new GenericMaxValue();
		Float actualResult=genericMaxValue.getMaxFloatValue( 25.75f, 50.75f,100.25f);
		assertEquals(expected,actualResult);
	}
}
