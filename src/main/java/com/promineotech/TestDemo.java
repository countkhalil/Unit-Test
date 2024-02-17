//Code By Khalil M.
package com.promineotech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.common.annotations.VisibleForTesting;

import java.util.*;

@SuppressWarnings("unused")
public class TestDemo {
public int addPositive (int a, int b) {
	if ( a > 0 &&  b > 0) {
		return a + b;
	} else {
		throw new IllegalArgumentException("Both parameters must be positive!");
	}
	
}


//Method for checking if a movie is in database
public  boolean checksIfMovieIsInDataBase (ArrayList<String> movies  ) {
	
	movies.replaceAll(movie -> movie.toUpperCase());
	boolean result= false ;
	
	//Scanner sc = new Scanner(System.in);
	//System.out.print("Movie Name: ");
	//String movieName = sc.nextLine().toUpperCase();
	//sc.close();
	
	
	//COULD USE MOCK TEST HERE >>
	String entry = "Misery";
	
	
	
	if (movies.contains(entry.toUpperCase())) {
			result = true;
		}
	
	return result;
	}



public int randomNumberSquared () {

 int num = getRandomInt();
  
 return num*num;
 


}



@VisibleForTesting
 int getRandomInt() {

    Random random = new Random();

    return random.nextInt(10) + 1;

}

	
	
	

	

		
		
	
}


