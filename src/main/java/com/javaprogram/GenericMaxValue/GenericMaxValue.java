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
	
	public Float getMaxFloatValue(Float firstValue, Float secondValue, Float thirdValue)
	{
		Float maxFloatValue = firstValue;
		if(secondValue.compareTo(maxFloatValue) > 0)
		{
			maxFloatValue=secondValue;
		}
		if(thirdValue.compareTo(maxFloatValue) > 0 )
		{
			maxFloatValue=thirdValue;
		}
		return maxFloatValue;
	}

}
