/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 ArrayList<Integer> ds = new ArrayList<>();
System.out.print("nhap so phan tu");
int n= sc.nextInt();
for(int i=1;i<=n;i++)
{
    System.out.print("phan tu thu"+i);
    int so=sc.nextInt();
    ds.add(so);
}
        System.out.println("tat ca phan tu la:");
        for (int so : ds) 
            System.out.println(so);    
    }
}
