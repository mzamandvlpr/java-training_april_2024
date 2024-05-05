package com.bappy.training;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner input= new Scanner((System.in));

        System.out.println("Please enter a number");
        int numberA = input.nextInt();

        System.out.println("Please enter a number");
        int numberB= input.nextInt();

        int finalResult=numberA+numberB;
        System.out.println("Number A & Number b total sum = " + finalResult);
    }
}
