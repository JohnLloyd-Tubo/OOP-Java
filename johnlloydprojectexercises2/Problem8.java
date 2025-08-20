
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int cube = sc.nextInt();

        for (int i = 1; i <= cube; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));

        }

    }

}
