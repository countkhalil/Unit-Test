package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

@SuppressWarnings("unused")
@ExtendWith(MockitoExtension.class)
class TestDemoJUnitTest {

	private TestDemo testDemo;
	

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {

		if (!expectException) {

			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
				assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);

		}
	}
	
	static Stream<Arguments> argumentsForAddPositive(){
		
		 // @formatter:off
	    return Stream.of(
	        arguments(2, 4, 6, false),
	        arguments(3, 2, 5, false),
	        arguments(-1, -5, -7, true ),
	        arguments(-1, 5, 4, true),
	        arguments(0, 5, 5, true)
	      
	    );
	    // @formatter:on
	}
	
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly () {

		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		assertThat(testDemo.addPositive(22,4)).isEqualTo(26);
		assertThat(testDemo.addPositive(7,42)).isEqualTo(49);


	}
	
	@Test
	void assertThatMovieIsInDataBase () {
		//Given: List of Movies
		
	ArrayList<String> movies = new ArrayList<String>(List.of("misery", "Planet of the Apes", "Cars", "Billy Madison"));
		
		
		
		
		assertThat(testDemo.checksIfMovieIsInDataBase(movies)).isEqualTo(true); 
		
			}

	
@Test
private  TestDemo assertThatNumberSquaredIsCorrect (TestDemo getRandomInt) {
	TestDemo mockDemo = spy(new TestDemo());
	
	doReturn(5).when(mockDemo).getRandomInt();
	
	int squared = mockDemo.randomNumberSquared();
	
	assertThat(squared).isEqualTo(25);
	
	
	return mockDemo;
}
	
	
	
	
	
	

}
