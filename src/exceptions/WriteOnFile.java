/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Marian Platonov
 */
public class WriteOnFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/exceptions/file.txt", true))) {
            try {
                writer.write(new Date().toString());
                writer.newLine();
                System.out.println("This program wrote something in file.txt");
            } catch (IOException ex) {
                System.out.println("First exception contains the message: " + ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println("Second exception contains the message: " + ex.getMessage());
        }
    }
}
