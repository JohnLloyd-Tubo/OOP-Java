/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package johnlloydprojectexercises2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.print("Input bumber: ");
        System.out.println(num);
        System.out.println("Expected Output: ");
        
        if (num > 0)      
        System.out.println(num + " is positive ");
        
        else if (num < 0) 
            System.out.println(num + " is negative ");
        
    }
    }
    

