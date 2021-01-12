package com.javaprogram.GenericMaxValue;

public class GenericMaxValue {
	
	public Integer getMaxValue(Integer firstValue, Integer secondValue, Integer thirdValue)
	{
		Integer max = firstValue;
		if(secondValue.compareTo(max) > 0)
		{
			max=secondValue;
		}
		if(thirdValue.compareTo(max) > 0 )
		{
			max=thirdValue;
		}
		return max;
	}
}
