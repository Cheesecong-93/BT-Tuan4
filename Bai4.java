/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.printf("nhap so");
       int n=sc.nextInt();
       int s=0;
       for(int i=1;i<=n;i++)
       {
           s=s+i;
       }
       System.out.println("tong tu 1 den so vua nhap la"+s);
       
    }
    
}
