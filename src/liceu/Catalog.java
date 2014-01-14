/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liceu;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alexa_000
 */

public class Catalog {
    
    public static BufferedWriter credentials;
    
    public static void addCredential(String a) throws IOException{
    credentials = new BufferedWriter(new FileWriter("credentials", true));
    credentials.write(a);
    credentials.newLine();
    credentials.close();
  
}

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
    // line is not visible here.
    }
    
}
