package com.deloitte.app.test;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.deloitte.app.ArrayMultiplicationUtil;

class AppTest {

	@Test
	void assertFirstCaseExpectedIsEqualToActualResult() {
		//Given: {5, 6, 10}
		//Expected result: 60, 50, 30
		int[] given = {5,6,10}; //60, 50, 30
		Integer[] expectedArray = {60,50,30}; //60, 50, 30
		List<Integer> expected = Arrays.asList(expectedArray);	
		List<Integer> actual = ArrayMultiplicationUtil.multiplyElements(given);
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void assertSecondCaseExpectedIsEqualToActualResult() {
		//Given: {2, 5, 6, 10}
		//Expected result: 60, 50, 20, 30, 12, 10
		int[] given = {2,5,6,10}; //60, 50, 30
		Integer[] expectedArray = {60,50,20,30,12,10}; //60, 50, 30
		List<Integer> expected = Arrays.asList(expectedArray);	
		List<Integer> actual = ArrayMultiplicationUtil.multiplyElements(given);
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void assertThirdCaseExpectedIsNotEqualToActualResult() {
		//Given: {2, 5, 6, 10}
		//Expected result: 60, 50, 30
		int[] given = {2,5,6,10}; //60, 50, 30
		Integer[] expectedArray = {60,50,30}; //60, 50, 30
		List<Integer> expected = Arrays.asList(expectedArray);	
		List<Integer> actual = ArrayMultiplicationUtil.multiplyElements(given);
		assertFalse(expected.equals(actual));
	}

}
