package com.nt.main;

import com.nt.service.Arithemeticoperations;

public class AppTest extends Arithemeticoperations{
	public static void main(String[] args) {
		Arithemeticoperations ar = new Arithemeticoperations();
		System.out.println("sum:"+ar.sum(100,200));
		System.out.println("sub:" +ar.sub(100,200));
		System.out.println("=====");
		System.out.println("===");
		//System.out.println("mul:"+ar.mul(100,200));
	}

}
