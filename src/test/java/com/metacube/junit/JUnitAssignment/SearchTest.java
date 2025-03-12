package com.metacube.junit.JUnitAssignment;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SearchTest {
	public static final Search search=new Search();
	@Test
	public void BinarySearchTest() {
		int [] arr= {5};
		int [] arr2= {6,2,4,21,1,16,17,19};
		int [] arr3= {1, 2, 2, 2, 3};
		int [] arr4= {4,2,1,16,17,18,90,72};
		int [] arr5= {4,2,1,16,17,18,90};
		assertEquals(0,search.BinarySearch(arr, 0, arr.length-1, 5));
		assertEquals(2, search.BinarySearch(arr2, 0, arr2.length-1, 4));
		assertEquals(2, search.BinarySearch(arr3, 0, arr3.length-1, 2));
		assertEquals(arr5.length-1, search.BinarySearch(arr5, 0, arr5.length-1, 90));
	}
	@Test
	public  void BinarySearchTestNull() {
		assertThrows(AssertionError.class, () -> search.BinarySearch(new int[] {},0,0,0));
	}
	@Test
	public void LinearSearchTest() {
		int [] arr= {5};
		int [] arr2= {6,2,4,21,1,16,17,19};
		int [] arr3= {1, 2, 2, 2, 3};
		int [] arr4= {4,2,1,16,17,18,90,72};
		int [] arr5= {4,2,1,16,17,18,90};
		assertEquals(0,search.LinearSearch(arr, 5, 0));
		assertEquals(6, search.LinearSearch(arr2, 17,0));
		assertEquals(1, search.LinearSearch(arr3, 2,0));
		assertEquals(arr4.length-1, search.LinearSearch(arr4, 72, 0));
		assertEquals(0,search.LinearSearch(arr5, 4, 0) );
	}
	@Test
	public void LinearSearchTestNull() {
		assertThrows(AssertionError.class, () -> search.LinearSearch(new int[] {}, 0, 0));
	}

}
