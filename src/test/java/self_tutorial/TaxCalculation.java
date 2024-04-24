package self_tutorial;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class TaxCalculation {

    public static void main(String[] args) {

        /*
        Requirement: Worker gets gross income and there is certain tax rate according to
        level of the gross income. Under 12000(included) monthly there is no tax payment, between 12000-33000(included) tax rate is 20%
        between 33000-60000(included) tax rate is 28%, between 60000-100000(included) tax rate is 35%, for over income tax rate will be 41%
        Program should display the net income for the user
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gross income to see tax deduction and net income");

        double grossIncome = scan.nextDouble();
        double taxRate, taxDeduction;

        if(grossIncome<0){
            throw new IllegalArgumentException("There should be a valid income to make calculation");
        } else {
            if (grossIncome<=12000){
                taxRate=0;
            } else if (grossIncome>12000 && grossIncome<=33000) {
                taxRate=0.2;
            } else if (grossIncome>33000 && grossIncome<=60000) {
                taxRate=0.28;
            } else if (grossIncome>60000 && grossIncome<100000) {
                taxRate=0.35;
            } else {
                taxRate=0.41;
            }
        }

        taxDeduction = grossIncome*taxRate;
        System.out.println("Your tax rate is = " + (taxRate * 100) + "%.");
        System.out.println("From your gross income " + grossIncome + "£ will be cut " + taxDeduction + "£ as tax payment.");
        System.out.println("Your net income is = " + grossIncome + " - " + taxDeduction + " = " + (grossIncome-taxDeduction) + "£.");

    }
}
