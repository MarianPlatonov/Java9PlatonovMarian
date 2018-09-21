/*
 * String and Numbers Homework
 */
package stringandnumber;

import java.util.Scanner;


/**
 *
 * @author Marian Platonov
 */
public class StringAndNumbers {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        /*If you initialize stringbuilder with any content, then capacity 
        will be content length+16*/
        System.out.println("The string: " + sb);
        System.out.println("The initial capacity of the  string "
                             + "builder is: " + sb.capacity()); 
        System.out.println("The length of the string "
                             + "builder is: " + sb.length());
        
        System.out.println("______________________________________________");
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("We have this string: " + hannah);
        System.out.println("The string length is: " + hannah.length());
        System.out.println("The char at the 15th position is: " 
                             + hannah.charAt(15));
        
        System.out.println("______________________________________________");
        String s = "Was it a car or a cat I saw?";
        System.out.println("For this string: " + s);
        System.out.println("The s.substring(9, 12): " + s.substring(9, 12));
        System.out.println("The length of string is: " + s.length());
       
         System.out.println("______________________________________________");
        String s1 = "Hi,";
        String s2 = "mom.";
        
        //First way to concatenate two strings
        String s3 = s1 + s2;
        //Second way to concatenate two strings
        String s4 = s1.concat(s2);
        
        System.out.println(s3);
        System.out.println(s4);
       
       System.out.println("______________________________________________");
       /*A program that computes your initials from your full name and displays
       them*/
       Scanner username_input = new Scanner(System.in);
       System.out.println("Enter you Name and Surname: ");
       String FullName = username_input.nextLine();
       
       String FirstNameChars = "";
       FirstNameChars = FullName.substring(0, 1);
       
       int spacePos = FullName.indexOf(" ");
       String SurNameChars = "";
       SurNameChars = FullName.substring((spacePos+1), (spacePos + 1)+1);
       
       String SecondNameChars = "";
       SecondNameChars = FullName.substring(spacePos, spacePos+1);
              
       System.out.println("The space is at position: " + spacePos);
       System.out.println("The initials of your name are: " + 
                            FirstNameChars.concat(SurNameChars));
       
       /*The derived classes from Number are:  AtomicInteger, AtomicLong, 
         BigDecimal, BigInteger, Byte, Double, DoubleAccumulator, DoubleAdder,
            Float, Integer, Long, LongAccumulator, LongAdder, Short*/

      
  }   
    }
    
 
