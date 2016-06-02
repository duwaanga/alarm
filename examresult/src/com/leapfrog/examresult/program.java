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
        
        System.out.println("Enter the Data Structute marks:");
        double Datastructure=input.nextDouble();
        System.out.println("Enter the Discrete Mathematics marks:");
        double Discretemathematics=input.nextDouble();
        System.out.println("Enter the Numericals Methods marks:");
        double Numericalsmethods=input.nextDouble();
        
        System.out.println("Enter the Electrical Machine marks:");
        double Electricalmachine=input.nextDouble();
        System.out.println("Enter the Applied Mathematics:");
        double Appliedmathematics=input.nextDouble();
        
        double percentage=0;
        
        if(Datastructure<32 || Discretemathematics<32 || Numericalsmethods<32 || Electricalmachine<32 || Appliedmathematics<32 )
        {
            
        System.out.println("You are fail");
        }
        else{
            percentage=((Datastructure|+Discretematheatics+Numericalsmethods+Electricalmachine+Appliedmathematics)/500)*100;
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
    

