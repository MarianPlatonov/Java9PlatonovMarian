/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java9platonovmarian;

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
        
        System.out.println("Hello my friend! ");
        sum(2,2);
        decrease(9,-1);
    }
    
    public static int sum (int a, int b){
        int sum;
        sum=a+b;
        System.out.println("Sum of a and b = " +sum);
        return sum;
    }
    
     public static int decrease (int a, int b){
        int decrease;
        decrease=a-b;
        System.out.println("Decrease of a and b = " +decrease);
        return decrease;
    }
    
}
