/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1.bai4;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class Bai4_2 {
    public static void main(String[] args) {
        int a[][], d=0,c=0;
        
        a = new int[5][7];
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
        
    }
    
}
