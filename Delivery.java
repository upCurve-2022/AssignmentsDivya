package com.company;

import java.util.Scanner;

public class Delivery {
    public Delivery(){

    }
    public static void validZip(int Zip)
    {
        if(Zip!=123 && Zip!=456 && Zip!=789)
        {
            System.out.println("Delivery is available in your area");
        }
        else
        {
            try {
                throw new newException();
            } catch (Exception var2) {
                System.out.println(var2.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zipCode = sc.nextInt();
        validZip(zipCode);
    }
}
