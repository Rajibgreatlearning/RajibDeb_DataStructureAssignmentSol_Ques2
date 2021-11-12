package com.gl.distinctfloor.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFunction {

	public int getHighestElement(List myList) {
		if (myList == null || myList.size() == 0) {
			return Integer.MIN_VALUE;
		}
		List<Integer> sortedlist = new ArrayList<>(myList);
		Collections.sort(sortedlist);
		return sortedlist.get(sortedlist.size() - 1);
	}

	public void calculateCons(List myList, List myListDuplicate) {
		int size = myList.size();
		List myNonHighestList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			System.out.println("Day: " + (int) (i + 1) + " ");
			int tempInt = (int) myList.get(i);
			int highestElement = getHighestElement(myListDuplicate);
			int index = myListDuplicate.indexOf(highestElement);
			if (tempInt == highestElement && myNonHighestList.size() == 0) {
				System.out.print(" " + tempInt + " ");
				myListDuplicate.remove(index);

			} else if (tempInt == highestElement && myNonHighestList.size() > 0) {
				System.out.print(" " + tempInt + " ");
				myListDuplicate.remove(index);
				myNonHighestList.forEach(System.out::print);
				for (int j = 0; j < myNonHighestList.size(); j++) {
					int tempListInt = (int) myNonHighestList.get(j);
					int tempIndex = myListDuplicate.indexOf(tempListInt);
					myListDuplicate.remove(tempIndex);
				}
				myNonHighestList.clear();
			} else {
				myNonHighestList.add(tempInt);
			}
			System.out.println(" ");

		}
	}

}
