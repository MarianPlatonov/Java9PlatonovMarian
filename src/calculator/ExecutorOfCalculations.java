/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;


/**
 *
 * @author Marian Platonov
 */
public class ExecutorOfCalculations {
    
    public static void main(String args[]){
         
    Calculator aCalculator = new Calculator();
      
    Scanner numbers = new Scanner(System.in);
   
    System.out.print("Please introduce your first number: ");
    float a = numbers.nextFloat();
    
    Scanner operator = new Scanner(System.in);
        
    System.out.print("Please introduce an operator (+,-,*,/): ");
    String oper = operator.nextLine();
        
    System.out.print("Please introduce your second number: ");
    float b =numbers.nextFloat();
       
    
    System.out.print("Please introduce \"=\": ");
    String equal=operator.nextLine();
    if(equal.equals("=")){
           
        switch(oper){
         case ("+"):
            float resultOfSum = aCalculator.sum(a, b);
            System.out.println("The sum is: "+a+" + " +b+" = "+resultOfSum);
            break;
         case("-"):
            float resultOfSubstract = aCalculator.substract(a, b);
            System.out.println("The substract is: "+a+" - " +b+" = "+resultOfSubstract);
            break;
         case("*"):
            float resultOfMultiply = aCalculator.multiply(a, b);
            System.out.println("The multiply is: "+a+" * " +b+" = "+resultOfMultiply);
            break;
         case("/"):
            float resultOfDivide = aCalculator.divide(a, b);
            System.out.println("The divide is: "+a+" / " +b+" = "+resultOfDivide);
            break;
            default:
            throw new IllegalArgumentException("Invalid operand: " + oper+" Please introduce an operator (+,-,*,/)");    
        }   
    } 
     
    else {
        System.out.println("Illegal operator!. Sorry, you introduced wrong data. I quit \":)\" ");  
        System.exit(0);
                  
   }
     
       numbers.close();
       operator.close();
       
              
       }   
    
}


