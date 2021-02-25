package com.srm.generics.prog;

import java.util.Comparator;

public class sortByRollNo implements Comparator<Course> {
	public int compare(Course o1, Course o2) {
		int res=o1.getRollno().compareTo(o2.getRollno());
		return res;
	}
 
}
