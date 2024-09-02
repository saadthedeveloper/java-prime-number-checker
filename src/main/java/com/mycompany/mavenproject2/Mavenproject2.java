/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author MKAY
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int number;
        boolean status;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        number = keyboard.nextInt();
        
        status = isPrime(number);
        
        if (status)
        {
            System.out.println(number + " is a prime number");
        }
        else
        {
            System.out.println(number + " is not a prime number");
        }
        
        keyboard.close();
    }
    
    public static boolean isPrime(int number)
    {
        boolean status = true;
        int index = 2;
        
        if (number < 2) {
            return false;
        }
        
        while(index <= Math.sqrt(number))
        {
            if(number%index == 0)
            {
                status = false;
                break;
            }
            index++;
        }
        
        return status; 
    }
}
