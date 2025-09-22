/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BAITAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap");
        int n=sc.nextInt();
       if (n > 0) {
            System.out.println(n + " so duong");
        } else if (n < 0) {
            System.out.println(n + " so am.");
        } else {
            System.out.println("so 0");
        }

        sc.close();
    }
}

