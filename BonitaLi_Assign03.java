//package com.codebind;
/* 
BonitaLi_Assign03.java is written by B. Li on Nov 7, 2021
It is a simple code that asks user for a positive integer and asks user to select and option. Program loops until user ends. 
 */

import java.util.Scanner;
public class BonitaLi_Assign03 {
	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num=1, choice=1;
		boolean isPrime=true, firstRun=true;

			while (choice != 0) {
				if(firstRun == true) {
					firstRun = false;
					System.out.println("Enter a positive integer"); //user integer input
					num = inData.nextInt();
					
					while(num <= 0) {
						System.out.println("Invalid integer. Please enter a positive integer"); //checking invalid integer
						num = inData.nextInt();
					}//while block ends
				} else {
					System.out.println("\nEnter a new number"); //invalid integer reenter
					num = inData.nextInt();
				}//else block ends
				
				System.out.printf("\n"); //choice selection
				System.out.println("Select one of the following options:");
				System.out.println("Enter 1 to print all prime numbers less than " + num);
				System.out.println("Enter 2 to print all factors of " + num);
				System.out.println("Enter 3 to print prime factors of " + num);
				System.out.println("Enter 4 to determine if " + num + " is a perfect square");
				System.out.println("\nEnter 0 to exit");
				choice = inData.nextInt();
			
				if (choice < 0 || choice > 4) { //checking invalid choice selection
					System.out.println("Invalid selection.");
					continue;
				}//if block ends

				switch (choice) {
				case 0: //terminate program
					System.out.println("Thank you.");
					break;
					
				case 1: //option 1 prime numbers of integer
					System.out.println("All the prime numbers less than " + num + " are:");
					for (int ctr1=2; ctr1 < num; ctr1++){
						for (int ctr2=2; ctr2 < ctr1; ctr2++) {
							if (ctr1 % ctr2 == 0) {
								isPrime = false;
							}//if block ends
						}//inner for loop ends
						if (isPrime == true) {
							//System.out.print(ctr1);
							System.out.printf(ctr1 + " ");
						}//if block ends
						isPrime = true;
					}//outer for loop ends
					break;
				
				case 2: //option 2 factors of integer
					System.out.println("Factors of " + num + " are:");
					for (int ctr3=1; ctr3 <= num; ctr3++) {
						for (int ctr4=1; ctr4 <=num; ctr4++) {
						if (ctr3 * ctr4 == num){
							System.out.printf(ctr3 + " ");
						}//if block ends
					}//inner for loop ends
				}//outer for block ends
				break;
					
				case 3: //option 3 prime factors of integer
					System.out.println("Prime factors of " + num + " are:");
					for(int ctr5=2; ctr5 < num; ctr5++) {
						 if (num % ctr5 == 0){
				                for (int ctr6 = 2; ctr6 < ctr5; ctr6++) { 
				                    if (ctr5 % ctr6 == 0) { 
				                        isPrime = false;
				                    }//if block ends            
				                }//for loop ends
				                if (isPrime == true) { 
				                    System.out.printf(ctr5 + " "); 
				                }//if block ends
				                isPrime = true;
				            }//if block ends
					}//for loop ends
					break;

				case 4: //option 4 whether number is perfect square
					double sqrt = Math.sqrt(num);
					if ((sqrt - Math.floor(sqrt)) == 0) {
						System.out.println(num + " is a perfect square");
					}//if block ends
					else {
						System.out.println(num + " is not a perfect square");
					}//else block ends
					break;
				default:
					break;
				}//switch ends
			}//while block ends
	}//ends main method
}//class ends
