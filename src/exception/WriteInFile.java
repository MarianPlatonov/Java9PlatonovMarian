/*
 * Try to open a file
 */
package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marian
 */
public class WriteInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      BufferedReader r = null;
        try {
            r = new BufferedReader(new FileReader("C:\\Users\\maria\\Desktop\\text.txt"));
                 try {
                    String firstLine = r.readLine();
                     System.out.println("Am citit din fisier: "+firstLine);
                    } catch (IOException e) {
                    System.out.println("Cannot read first line from text.txt: "+
                    e.getMessage());
                    } finally {
                    r.close();
                    }

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exceptia are mesajul: "+ex.getMessage());
        }
           
    }
    
}
