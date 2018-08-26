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
        System.out.println("Let's introduce some numbers to see the Java working. ");   
        
         Scanner sc = new Scanner(System.in);
   
        System.out.print("Input an float for a = ");
        float a = sc.nextFloat();
        System.out.print("Input an float for b = ");
       float b =sc.nextFloat();
        sum(a,b);
        sub(a,b);
        div(a,b);
        mult(a,b);
        
       sc.close();
         username.close();
     
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
