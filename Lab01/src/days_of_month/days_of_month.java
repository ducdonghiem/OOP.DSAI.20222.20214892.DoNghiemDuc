package days_of_month;

import java.util.Scanner;

public class days_of_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initialize the days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInMonthLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Get input from user
        String month;
        int monthNumber = -1;
        do {
	        System.out.print("Enter a month: ");
	        month = input.nextLine().toLowerCase();
	        switch (month) {
	            case "january":
	            case "jan":
	            case "1":
	                monthNumber = 0;
	                break;
	            case "february":
	            case "feb":
	            case "2":
	                monthNumber = 1;
	                break;
	            case "march":
	            case "mar":
	            case "3":
	                monthNumber = 2;
	                break;
	            case "april":
	            case "apr":
	            case "4":
	                monthNumber = 3;
	                break;
	            case "may":
	            case "5":
	                monthNumber = 4;
	                break;
	            case "june":
	            case "jun":
	            case "6":
	                monthNumber = 5;
	                break;
	            case "july":
	            case "jul":
	            case "7":
	                monthNumber = 6;
	                break;
	            case "august":
	            case "aug":
	            case "8":
	                monthNumber = 7;
	                break;
	            case "september":
	            case "sep":
	            case "9":
	                monthNumber = 8;
	                break;
	            case "october":
	            case "oct":
	            case "10":
	                monthNumber = 9;
	                break;
	            case "november":
	            case "nov":
	            case "11":
	                monthNumber = 10;
	                break;
	            case "december":
	            case "dec":
	            case "12":
	                monthNumber = 11;
	                break;
	            default:
	                System.out.println("Invalid month input. Please try again.");
	                break;
	        } }while (monthNumber == -1);
        boolean isLeapYear = false;
        System.out.print("Enter a year:");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear == true) {
        	System.out.print(daysInMonthLeap[monthNumber]);
        } else {
        	System.out.print(daysInMonth[monthNumber]);
        }
    } 
}
        
 

        
        
        
