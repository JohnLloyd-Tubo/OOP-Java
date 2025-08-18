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
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String Name = sc.nextLine();
        
        System.out.print("Enter Date of Birth: ");
        String DoB = sc.nextLine();
        
        System.out.print("Address: ");
        String Address = sc.nextLine();
        
        System.out.print("Age: ");
        String Age = sc.nextLine();
        
        System.out.print("Course: ");
        String Course = sc.nextLine();
        
        System.out.print("Year Level: ");
        String YL = sc.nextLine();
        
        System.out.print("Secondary School Graduated: ");
        String SSG = sc.nextLine();
        
        System.out.print("Year: ");
        String Year = sc.nextLine();
        
        System.out.println("\n========= PERSONAL INFO ========");
        System.out.println("NAME:  " + Name);
        System.out.println("DATE OF BIRTH: " + DoB);
        System.out.println("ADDRESS: " + Address);
        System.out.println("AGE: " + Age);
        System.out.println("COURSE: " + Course);
        System.out.println("YEAR LEVEL: " + YL);
        
        System.out.println("\n========= EDUCATIONAL INFO =========");
        System.out.println("SECONDARY LEVEL: ");
        System.out.println("NAME OF SCHOOL: " + SSG);
        System.out.println("YEAR: " + YL);
        
    }
    
}
