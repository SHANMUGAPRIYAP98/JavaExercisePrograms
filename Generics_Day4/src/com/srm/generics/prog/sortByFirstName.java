package com.srm.generics.prog;
import java.util.Comparator;

public class sortByFirstName implements Comparator<CustomerData>{
@Override
public int compare(CustomerData c1, CustomerData c2) {
int res=c1.getName().compareTo(c2.FirstName);
return res;
}

}