/**
* <h1>RemoveDuplicates</h1>
* This program shows the functionality how we can build any collection containing duplicates
* and can create its copy with all duplicates removed.
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/
package assignment9.session2;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//creating ArrayList which will hold duplicate elements
		ArrayList<Integer> listWithDuplicates = new ArrayList<Integer>();
		//adding elements into the ArrayList
		listWithDuplicates.add(2);
		listWithDuplicates.add(5);
		listWithDuplicates.add(3);
		listWithDuplicates.add(2);
		listWithDuplicates.add(4);
		listWithDuplicates.add(3);
        listWithDuplicates.add(2);
        System.out.println("List with duplicates is: "+listWithDuplicates);
        //creating ArrayList which will hold unique elements
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<Integer>();
        //iterating through the original list
        Iterator<Integer> itr = listWithDuplicates.iterator();
        while(itr.hasNext()){
        //getting next element of original list into the variable
        int duplicateInt = itr.next();
        //if ArrayList having unique elements has this element already, remove it from the iterator
        if(listWithoutDuplicates.contains(duplicateInt)){
        	itr.remove();
        }else{//else add the element into the ArrayList which will hold the unique elements
        	listWithoutDuplicates.add(duplicateInt);
        }
        }
        //printing the ArrayList with unique elements
        System.out.println("List without duplicates is: "+listWithoutDuplicates);
	}

}
