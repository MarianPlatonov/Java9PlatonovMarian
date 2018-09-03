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
public class Java9PlatonovMarian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner username = new Scanner(System.in);
        System.out.println("Hello. What is you name? ");
        String user = username.nextLine();
        System.out.println("Nice to meet you "+user);
        System.out.println("\nLet's introduce some numbers to that the Java program is working. ");   
        
         Scanner sc = new Scanner(System.in);
   
        System.out.print("Input an float for a = ");
        float a = sc.nextFloat();
        System.out.print("Input an float for b = ");
       float b =sc.nextFloat();
    
      
        sum(a,b);
        sub(a,b);
        
      if(b==0.0){
      System.out.println("Invalid dividing operation "+a+"/"+b+"\n"+"Please input another value for b that is grater than 0");
           }
      else{
        div(a,b);
      }
      
        mult(a,b);
        
       sc.close();
       username.close();
       
   
       System.out.println();
        System.out.println("Multiplying table from 1 to 10\n");
           int multiply=1;
           
       for (int i=1;i<=10;i++){
           for(multiply=1;multiply<=10;multiply++){
               
            System.out.print(multiply+" * "+i+" = "+multiply*i+"\t"+"|"+"\t");
          
       }           
           System.out.println();
         
           multiply++;
           
          
       }
      
 
    
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return sum operation a + b
     */
    public static float sum (float a, float b){
        float sum;
        sum=a+b;
        System.out.println(a+" + "+b+" "+" = "+sum);
        return sum;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return substracting operation a - b
     */
     public static float sub (float a, float b){
        float sub;
        sub=a-b;
       
        System.out.println(a+" - "+b+" "+" = "+sub);
         return sub;
    }
    
     /**
      * 
      * @param a
      * @param b
      * @return dividing operation a / b
      */
    public static float div(float a, float b){
        float div= a/b;
        System.out.println(a+" / "+b+" "+" = "+div);
        return div;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return multiplying operation  a * b
     */
    public static float mult(float a, float b){
        float mult= a*b;
        System.out.println(a+" * "+b+" "+" = "+mult);
        return mult;
    }
    
}
