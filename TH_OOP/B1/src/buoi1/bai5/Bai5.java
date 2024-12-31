/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1.bai5;

import java.util.*;
/**
 *
 * @author Administrator
 */
public class Bai5 {
    public static void main(String[] args) {
	for(int i=1;i<=10;i++) {
            for(int j=2; j<=9; j++) {
                System.out.format("%d x %d = %d \t",j,i,i*j);
            }
            System.out.println();
        }
    }
}
