package com.epam.LamdaAndStreams;

import java.util.ArrayList;
import java.util.List;

public class integersAverage {
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(11); list.add(12);
		list.add(13); list.add(14);
		list.add(15); 
		System.out.println("Average of Integer List : "+average(list));
	}
	public static Double average(List<Integer> list)
	{
		return list.stream().mapToDouble(l->l).average().orElse(Double.NaN);
	}
} 
