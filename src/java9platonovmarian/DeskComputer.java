/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java9platonovmarian;
import java.util.Scanner;
/**
 *
 * @author Marian Platonov
 */
public class DeskComputer {
    
    public static void main(String args[]){
       
        
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
                sum(a,b);
                break;
            case("-"):
                substract(a,b);
                break;
            case("*"):
                multiply(a,b);
                break;
            case("/"):
                divide(a,b);
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
       
    public static float sum (float a, float b){
        float sum;
        sum=a+b;
        System.out.println("Result is: "+a+" + "+b+" = "+sum);
        return sum;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return substracting operation a - b
     */
     public static float substract (float a, float b){
        float substract;
        substract=a-b;
       
        System.out.println("Result is: "+a+" - "+b+" "+" = "+substract);
         return substract;
    }
    
     /**
      * 
      * @param a
      * @param b
      * @return dividing operation a / b
      */
    public static float divide(float a, float b){
        float divide= a/b;
        System.out.println("Result is: "+a+" / "+b+" "+" = "+divide);
        return divide;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return multiplying operation  a * b
     */
    public static float multiply(float a, float b){
        float multiply= a*b;
        System.out.println("Result is: "+a+" * "+b+" "+" = "+multiply);
        return multiply;
    }
    
}
