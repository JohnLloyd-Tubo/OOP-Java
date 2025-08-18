/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Data: ");
        System.out.print("Input an integer: ");
        int Integer = sc.nextInt();
        int sum = 0;
        
        while (Integer !=0){
            int digit = Integer % 10;
                    sum += digit;
                    Integer /=10;
                    
                    System.out.println("The sum of the digits is: " + sum);
        }
    }
    
}
