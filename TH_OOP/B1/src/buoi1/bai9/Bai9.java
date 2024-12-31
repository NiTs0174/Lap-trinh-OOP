/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1.bai9;

/**
 *
 * @author Administrator
 */
public class Bai9 {
    public static int finabocci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        
        if(n<0){
            return -1;
        }
        else if(n == 0 || n == 1){
            return n;
        }
        else{
            for(int i=2; i<n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    
    public static void main(String[] args) {
        System.out.print("100 so cua day so finabocci: ");
        for(int i=1; i<100; i++){
            System.out.print(finabocci(i) + " ");
        }
    }
}
