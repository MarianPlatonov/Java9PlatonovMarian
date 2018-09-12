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
public class Calculator {
     float result=0;

    public float sum(float a, float b){
        result=a+b;
        return result;
    }   
    
    public float substract(float a, float b){
        result=a-b;
        return result;
    }   
    
    public float multiply(float a, float b){
        result=a*b;
        return result;
    }
    
    public float divide(float a, float b){
        result=a/b;
     return result;
    }
}


