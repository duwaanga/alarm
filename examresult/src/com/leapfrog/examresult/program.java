/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.examresult;
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
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the name:");
        String name=input.next();
        String grade="";
        System.out.println("Enter your Symbol no:");
        String symbol=input.next();
        
        System.out.println("Enter the Cmaths marks:");
        double Cmaths=input.nextDouble();
        System.out.println("Enter the Optmaths marks:");
        double Optmaths=input.nextDouble();
        System.out.println("Enter the Science marks:");
        double Science=input.nextDouble();
        
        System.out.println("Enter the English marks:");
        double English=input.nextDouble();
        System.out.println("Enter the Nepali marks:");
        double Nepali=input.nextDouble();
        
        double percentage=0;
        
        if(Cmaths<32 || Optmaths<32 || Science<32 || English<32 || Nepali<32 )
        {
            
        System.out.println("You are fail");
        }
        else{
            percentage=((Cmath|+Optmaths+Science+English+Nepalali)/500)*100;
        }
            if (percentage>=80){
                grade="Distinction";
            }
            else if (percentage>=60 && percentage <80){
                grade="First Division";
            }
                else if (percentage >=45 && percentage <60){
                    grade="Second Division";
                }
                else if(percentage>=32 && percentage <45){
                    grade="Third Division";
                    
                }
                else{
                    grade="fail";
                    System.out.println("Your percentage is " + percentage);
                    
                    System.out.println("Your grade is" + grade);
            }
             
            
        }
        
        
        
    }
    

