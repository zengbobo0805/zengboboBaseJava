package com.zengboboBaseJava;

import java.lang.System;

public class TestFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		 AtomicBoolean isCancelled = new AtomicBoolean();
//		System.out.println("TestFirst isCancelled:"+isCancelled.get());

		int i=5,j=5,p,q;
		p = (i++)+(i++)+(i++);
		q = (++j)+(++j)+(++j);
		System.out.println("TestFirst p:"+p+",q:"+q+",i:"+i+",j:"+j);
	}

}
