package com.srm.collections.prog;

import java.util.Comparator;

public class SortByFirstName implements Comparator<CustomerModel> {
	@Override
	public int compare(CustomerModel o1, CustomerModel o2) {
     return o1.FirstName.compareTo(o2.FirstName);
	}

}
