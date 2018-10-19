/*
 * CNP Validator
 */
package cnpvalidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Marian Platonov
 */
public class CnpValidator {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please write your CNP ==> It has 13 digits and "
                + "first digit could be 1 or 2 and next 8 digits are for \n"
                + "MMDDYYYY, where MM is month on 2 digits, DD day on 2 digits"
                + " and  YYYY is year on 4 digits.\n");
        
        System.out.println("[S][AA][LL][ZZ][CJ][XXX][C] \n" +
"\n" +
"[S] - Cod sex, masculin/feminin, se aloca astfel:\n" +
"1/2 - nascuti intre 1 ian 1900 si 31 dec 1999;\n" +
"3/4 - nascuti intre 1 ian 1800 si 31 dec 1899;\n" +
"5/6 - nascuti intre 1 ian 2000 si 31 dec 2099;\n" +
"7/8 - pentru rezidenti;\n" +
"9/9 - pentru persoanele cu cetatenie straina. \n" +
"[AA] - An nastere \n" +
"[LL] - Luna nastere \n" +
"[ZZ] - Zi nastere \n" +
"[CJ] - Cod judet \n" +
"[XXX] - Numar de ordine \n" +
"[C] - Cifra de control \n  ");

        String txt = input.next();

String regex = "^[1-9]\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])"
        + "(0[1-9]|[1-4]\\d|5[0-2]|99)(00[1-9]|0[1-9]\\d|[1-9]\\d\\d)\\d$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(txt);
        

        if (matcher.find()) {
            System.out.println("The typed CNP is VALID");
        } else {
            System.out.println("The typed CNP is INVALID");
        }
       
    }

}