package com.thahir.stream1;

import java.util.Arrays;
import java.util.List;

public class evenNumInStream {
public static void main(String[] args) {
	

	List<Integer> myList=Arrays.asList(10,15,80,67,46,22,90,11,23,25,75);
myList.stream()
.filter(n-> n%2==0)
.forEach(System.out::println);
	
	
	
	
}
}