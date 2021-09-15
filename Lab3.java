/**-------------------------------------------------------------
// AUTHOR: Gregory Feng
// FILENAME: Lab3.java
// SPECIFICATION: Code that takes the input of 3 grades (with input validation), your homework grade, your midterm grade and your final grade
 * and puts it through a formula, giving you your final weighted grade for the class and tells you if you failed the class or not.
// FOR: CSE 110- Lab #3
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
    	//Variable DEfinitions
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        double HW=0;
        double midterm=0;
        double finalExam=0;
        double finalScore=0;
        // Declare a loop control variable i
        int i=0;
        //Continue while i is not 100, if i is set to 100 the code ends
        while (i!=100) {
        	//If i is 0, run this part of the code and only this part of the code
            if (i == 0) {
                // Ask the user for homework grade
            	System.out.print("Enter your homework grade: ");
                HW = scanner.nextDouble();
                // Do input validation
                // -->
                if (!(HW<=100&&HW>=0)) {
                    // Show the error message
                    System.out.println("Error please input a socre between [0-100].");
                } else {
                    // Update the loop variable
                    i=1;
                }
            }

            // If i is 1, run this part of the code and only this part of the code
            if (i == 1) {
                // Ask the user for midterm grade
            	System.out.print("Enter your midterm grade: ");
                midterm = scanner.nextDouble();
                // Do input validation
                // -->
                if (!(midterm<=100&&midterm>=0)) { 
                    // Show the error message
                    System.out.println("Error please input a score between [0-100].");
                } else {
                    // Update the loop variable
                    i=2;
                }
            }
            // If i is 2, run this part of the code and only this part of the code
            if (i == 2) {
                // Ask the user for homework grade
            	System.out.print("Enter your final exam grade: ");
                finalExam = scanner.nextDouble();

                // Do input validation
                // -->
                //Maximum inputted grade increased to 200 for the final exam
                if (!(finalExam<=200&&finalExam>=0)) {
                    // Show the error message
                    System.out.println("Error please input a score between [0-200].");
                } else {
                    // Update the loop variable
                    i=100;
                }
            }
        }

        // Calculate the weighted total by the formula showed in the PDF
        finalScore = ((float)(finalExam/2)*0.5)+midterm*0.25+HW*0.25;
        // Show the weighted total and tell the user s/he passed or not
        System.out.println("The student's final score is "+finalScore);
        //If the finalScore is greater than the passing threshold, display a pass
        if (finalScore >=50) {
            // Print "the student PASSED the class."
        	System.out.println("Student has passed the class!");
        } else {
        	//If it is not, the student has failed and the failed message should print.
            // Print "the student FAILED the class."
        	System.out.println("Student has failed the class!");
        }

        scanner.close();

    }  // End of main
}  // End of class
