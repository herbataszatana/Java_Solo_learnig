/*Question 
You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan ammount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount
after 3 months.
Author: Anna Swiatkowska-Duncan 24/03/22*/


import java.util.Scanner; 

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.next.Int();
        // your code goes here 
        int x;
        int percentageof;
        for (x=0; x<3; x++){
            percentageof = (amount * 0.10)/100; //as it's always 10%
            amount = amount - percentageof;
        }
        System.out.println(amount);
    }
}