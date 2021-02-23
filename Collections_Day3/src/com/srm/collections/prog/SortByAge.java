package com.srm.collections.prog;

import java.util.Comparator;

public class SortByAge implements Comparator<CustomerModel> {
	@Override
	public int compare(CustomerModel o1, CustomerModel o2) {
		String a1=String.valueOf(o1.Age);
		String a2=String.valueOf(o2.Age);
		return a1.compareTo(a2);
		
	}


}
