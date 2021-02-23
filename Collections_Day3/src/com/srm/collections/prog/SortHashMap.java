package com.srm.collections.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortHashMap {
	static void hashSort(Map map) {
		HashMap hm=new HashMap();
		hm.putAll(map);
		System.out.println("Map Values after Sorting : ");
		System.out.println(hm);
	}
	public static void main(String[] args) {
		System.out.println("Enter the No.of.Values : ");
		Scanner sc=new Scanner(System.in);
	    int Num=sc.nextInt();
	    LinkedHashMap map=new LinkedHashMap();
	    for(int i=0;i<Num;i++)
	    {
	    	System.out.println("StateId Number "+" "+"StateName");
	    	map.put(sc.nextInt(),sc.next());
	    }
	    System.out.println("Map Values before Sorting : ");
	    System.out.println(map);
		hashSort(map);
	}

}
