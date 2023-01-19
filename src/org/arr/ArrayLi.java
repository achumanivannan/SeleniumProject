package org.arr;

import java.util.HashSet;
import java.util.Set;

public class ArrayLi {
public static void main(String[] args) {
		
	Set<Integer> s=new HashSet<Integer>();//10,20,30,90,10,10,40,50
    // 30,40,50,60,80
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(90);
	s.add(10);
	s.add(10);
	s.add(40);
	s.add(50);
	
	Set<Integer> a=new HashSet<Integer>();
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(60);
	a.add(80);
	
	System.out.println(s);
	System.out.println(a);
	s.removeAll(a);
	System.out.println(s);
	System.out.println("add code to branch c");


}
	}
