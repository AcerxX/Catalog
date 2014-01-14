/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liceu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static liceu.Catalog.credentials;

/**
 *
 * @author alexa_000
 */
public class Administrator extends Utilizator implements IAdministrator{

    public BufferedWriter credentials;
    private String username, password, numeComplet, CNP, statut;
    public Administrator(String user, String parola, String nume_complet, String cnp, String text){
        this.username = user;
        this.password = parola;
        this.numeComplet = nume_complet;
        this.CNP = cnp;
        this.statut = text;
    }
    @Override
    public void addUser() {
        try {
            credentials = new BufferedWriter(new FileWriter("credentials", true));
            credentials.write(this.username);
            credentials.newLine();
            credentials.write(this.password);
            credentials.newLine();
            credentials.write(this.numeComplet);
            credentials.newLine();
            credentials.write(this.CNP);
            credentials.newLine();
            credentials.write(this.statut);
            credentials.newLine();
            credentials.close();
        } catch (IOException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean listUseri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
