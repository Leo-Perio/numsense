/* This is the main file in the program, it works
 * by getting the user's input, and doing a 
 * function that corresponds with that option
 * The user can choose the kind of math they
 * would like to practice, and its difficulty.
 * [STILL A WORK IN PROGRESS]
 */

import java.util.*;

public class Numsense
{
    public static void main(String[] args)
    {
	int choice;

	Scanner kb = new Scanner(System.in);
	Random rnd = new Random();
	
	System.out.println("Choose what you would like to practice\n");
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");

	System.out.print("Choose the number of what you would like to do, (1,2,3 or 4)");
	
	
