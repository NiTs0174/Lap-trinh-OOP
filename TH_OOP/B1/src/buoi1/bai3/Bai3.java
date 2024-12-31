/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1.bai3;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class Bai3 {
    public static void main(String[] args) {
        int a[], n=0;
        
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        n = x.nextInt();
        
        a = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.print("a[" + i + "]: ");
            a[i] = x.nextInt();
        }
        
        int max = a[0];
        for(int i=0; i<n; i++){
            if(a[0]< a[i]){
                max = a[i];
            }
        }
        System.out.print("GTLN: " + max);
        
    }
}
