/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1.bai7;

/**
 *
 * @author Administrator
 */
public class Bai7 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i=0; i<10; i++){
            a[i] = (int)(Math.round(Math.random()*100));
        }
        for(int i=0; i<10; i++){
            System.out.print(a[i] + "\t");
        }
        int temp = 0;
        for(int i=0; i<10-1; i++){
            for(int j=i+1; j<10; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\nDay so sau khi sap xep tang dan:\n");
        for(int i=0; i<10; i++){
            System.out.print(a[i] + "\t");
        }
    }
}
