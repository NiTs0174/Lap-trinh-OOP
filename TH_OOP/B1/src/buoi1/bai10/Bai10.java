/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1.bai10;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class Bai10 {
    public static void main(String[] args) {
        int a[][], d=0,c=0;
        
        a = new int[10][10];
        Scanner x = new Scanner(System.in);
        
        System.out.print("Nhap so dong: ");
        d = x.nextInt();
        System.out.print("Nhap so cot: ");
        c = x.nextInt();
        
        //input
        for(int i=0; i<d; i++){
            for(int j=0; j<c; j++){
                a[i][j] = (int)(Math.random()*100);
            }
        }
        
        //output
        for(int i=0; i<d; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        int k, s = 0;
        System.out.print("Dong k can tim: ");
        k = x.nextInt();
        for(int i=0; i<c; i++){
            s += a[k][i];
        }
        System.out.print("Tong dong k la: " + s);
    }
    
}
