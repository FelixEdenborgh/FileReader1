/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felix
 */
public class FileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        }
    }
    
}
