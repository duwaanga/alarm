/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.counting;
import java.util.Scanner;
/**
 *
 * @author Sampang
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner count = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = count.nextLine();
        char[] word = s.toCharArray();
        int v = 0;
        int c = 0;
        for (char i : word) {
            switch (i) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    v++;
                    break;
                default:
                    c++;
                    break;
            }
        }
        System.out.println("The no. of Vowel and Consonant in " + s + " is " + v + " and " + c + " respectively.");
    }
    
}
