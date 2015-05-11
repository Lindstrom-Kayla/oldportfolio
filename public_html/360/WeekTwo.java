/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360;

/**
 *
 * @author SexyMama
 */
import java.util.ArrayList;
import java.util.List;

public class WeekTwo{
    private static Object number;
	
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("\nIteration #1: ");
		//Indexed for loop iteration
		for(int i=0; i < number.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		//Removing items (careful)
		numbers.remove(numbers.size() - 1);
		
		//This is VERY slow
		numbers.remove(0);
		
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers){
			System.out.println(value);
		}
		
		//List interface...
		List<String> values = new ArrayList<String>();
	}
}