package com.thahir.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class stream {
public static void main(String[] args) {	
	
	List<Integer> element=Arrays.asList(10,10,20,30,30,20,40,88,44,33,2333,222,5643,33);
	List<Integer> res=element.stream()
			.sorted()
			.collect(Collectors.toList());
	System.out.println("List without duplicate "+res);
	
	

	
}
	
	
	
}
