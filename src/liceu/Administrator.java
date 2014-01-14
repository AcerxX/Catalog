/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liceu;

import grafic.Administratorapp;
import static grafic.Administratorapp.listModelSecretari;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

    public Administrator() {
        this.username = "";
        this.password = "";
        this.numeComplet = "";
        this.CNP = "";
        this.statut = "";
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
    public void delUser(String userDeSters) {
        BufferedReader fisier;
        BufferedWriter fisier_nou;
        try {            
            fisier = new BufferedReader(new FileReader("credentials"));
            ArrayList<String> vector = new ArrayList<>();
            for(String line; (line = fisier.readLine())!= null;){
                vector.add(line);                  
            }            
            for(int i=0;i<vector.size();i=i+5){               
                if(userDeSters.equals(vector.get(i))){
                        vector.remove(i+4);
                        vector.remove(i+3);
                        vector.remove(i+2);
                        vector.remove(i+1);
                        vector.remove(i);
                        fisier_nou = new BufferedWriter(new FileWriter("credentials"));
                        for(i=0;i<vector.size();i++){
                             fisier_nou.write(vector.get(i));
                             fisier_nou.newLine();
                        }
                        fisier_nou.close();
                    }
            }        
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Administratorapp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Administratorapp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean listUseri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
        public void addMaterie(String idMaterie) throws IOException{
        BufferedWriter clase = new BufferedWriter(new FileWriter("fmaterii", true));
        clase.write(idMaterie);
        clase.newLine();
        clase.close();        
        }

    @Override
        public void delMaterie(String materieDeSters) {
        BufferedReader fisier;
        try {
            fisier = new BufferedReader(new FileReader("fmaterii"));
            BufferedWriter fisier_nou;
            ArrayList<String> vector = new ArrayList<>();
            for(String line; (line = fisier.readLine())!= null;){
                vector.add(line);                  
            }
            for(int i=0;i<vector.size();i++){
                if(materieDeSters.equals(vector.get(i)))
                {
                    vector.remove(i);
                    //NEED MORE HERE
                    fisier_nou = new BufferedWriter(new FileWriter("fmaterii"));
                    for(i=0;i<vector.size();i++){
                        fisier_nou.write(vector.get(i));
                        fisier_nou.newLine();
                    }
                    fisier_nou.close();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Secretar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Secretar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }
    
}
