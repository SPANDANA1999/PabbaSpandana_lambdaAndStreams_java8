package com.epam.LamdaAndStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Stringstartswithb {
	public static void main(String args[]) 
	{
		List<String> a=new ArrayList<String>();
		a.add("ball");
		a.add("banana");
		a.add("bag");
		a.add("bin");
		a.add("bat");
		
		System.out.println("List : "+filter(a));
	}
	static List<String> filter(List<String> a)
	{
		return a.stream().filter(str -> str.startsWith("b") && str.length()==3).collect(Collectors.toList());
	}
}
