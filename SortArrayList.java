package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
/*
 * @author:Rohit
 * write a java program to sort a given array list
 */

public class SortArrayList {
	public static void main(String[] args) {
	//creating an object of ArrayList class  
	ArrayList<Integer> list = new ArrayList<Integer>();  
	list.add(55);  
	list.add(34);  
	list.add(98);  
	list.add(67);  
	list.add(39);  
	list.add(76);  
	list.add(81);  
	System.out.println("ArrayList Before Sorting:");  
	
	for(int marks: list)  
	{  
	System.out.println(marks);  
	}  
	Collections.sort(list);  
	System.out.println("ArrayList After Sorting:"); 
	
	for(int marks: list)  
	{  
	System.out.println(marks);  
		}  
	}  
}
