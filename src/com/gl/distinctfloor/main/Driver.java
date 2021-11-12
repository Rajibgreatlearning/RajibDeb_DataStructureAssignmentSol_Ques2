package com.gl.distinctfloor.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.gl.distinctfloor.services.ListFunction;

public class Driver {

	public static void main(String[] args) {
		
		List myList = new ArrayList<>();
		List myListDuplicate = new ArrayList<>();
		ListFunction lf=new ListFunction();

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the total no of floors in the building: ");
		int[] myInt = new int[sc.nextInt()];
		sc.nextLine();
		
		for (int i = 0; i < myInt.length; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			int temp = sc.nextInt();
			myList.add(temp);
			myListDuplicate.add(temp);
		}
		
		System.out.println();
		System.out.println("The order of construction is as follows");
		System.out.println();
		lf.calculateCons(myList, myListDuplicate);

	}

	

}
