/*
Prompt user for 3 numbers
set number to variable

 */


import java.util.Scanner;

public class FullDate {
    public static void main(String[]args){
       Scanner keybd = new Scanner(System.in);
       int month, day, year;
       System.out.print("Enter the month in a 'MM' format: ");
       month = keybd.nextInt();
       System.out.print("Enter the day in a 'DD' format: ");
       day = keybd.nextInt();
       System.out.print("Enter the year in a 'YY' format: ");
       year = keybd.nextInt();


       if ((month >= 1) && (month <= 12)) {
           if (month == 01) {
               System.out.print("January");

           } else if (month == 02) {
               System.out.print("February");
           } else if (month == 03) {
               System.out.print("March");
           } else if (month == 04) {
               System.out.print("April");
           } else if (month == 05) {
               System.out.print("May");
           } else if (month == 06) {
               System.out.print("June");
           } else if (month == 07) {
               System.out.print("July");
           } else if (month == 8) {
               System.out.print("August");
           } else if (month == 9) {
               System.out.print("September");
           } else if (month == 10) {
               System.out.print("October");
           } else if (month == 11) {
               System.out.print("November");
           } else {
               System.out.print("December");
           }
        System.out.print(" " + day + ", 20" + year);


        }

    }
}
