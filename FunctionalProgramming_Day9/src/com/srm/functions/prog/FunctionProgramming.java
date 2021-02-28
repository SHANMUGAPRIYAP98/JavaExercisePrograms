package com.srm.functions.prog;

import java.util.function.Function;

public class FunctionProgramming {

	public void multiply()
	{
		Function<Integer,Integer> multi1= a->Math.multiplyExact(a,2);
		Function<Integer,Integer> multi2= b->Math.multiplyExact(b,5);
		Function<Integer,Integer> res=multi1.andThen(multi2);
		Integer result=res.apply(50);
		System.out.println("The Final Value : "+result);
	}
	public void composeMultiply()
	{
		Function<Integer,Integer> multi1= a->a+10;
		Function<Integer,Integer> multi2= b->Math.multiplyExact(b,5);
		Function<Integer,Integer> res=multi1.compose(multi2);
		Integer result=res.apply(50);
		System.out.println("The Composed Final Value : "+result);
	}
	public void nameAge()
	{
		Function<Integer,String> f1= age->
		{
			return "Age : "+age.toString()+"\n"+"Name : "+"DiyaShri Nagaraj";
		};
		System.out.println(f1.apply(06));
		
	}
	public static void main(String[] args) {
		
		new FunctionProgramming().multiply();
		new FunctionProgramming().nameAge();
		new FunctionProgramming().composeMultiply();
	}

}
