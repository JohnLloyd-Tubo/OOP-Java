
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Input the 2nd nnumber: ");
        int num2 = sc.nextInt();
        
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();
        
        int greatest = num1;
        
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
            
        }
        System.out.println("The greatest: " + greatest);
    }
    
}
