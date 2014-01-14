/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liceu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alexa_000
 */
public class Secretar extends Utilizator implements ISecretar{
    public String idClasa;
    
    public BufferedWriter clase;

    public Secretar(String text) {
        this.idClasa = text;
    }
    public Secretar(){
        this.idClasa = "";
    }
    
    @Override
        public void addClasa() throws IOException{
        clase = new BufferedWriter(new FileWriter("clase", true));
        clase.write(idClasa);
        clase.newLine();
        clase.close();
        String path;
        File file = new File("elevi");
        file.mkdir();
        path = "elevi/"+idClasa;
        
        try (BufferedWriter elevi = new BufferedWriter(new FileWriter(path))) {
            elevi.write("");
        }
        
        file = new File("materii");
        file.mkdir();
        path = "materii\\"+idClasa;
        try (BufferedWriter materii = new BufferedWriter(new FileWriter(path))) {
            materii.write("");
        }
        
        file = new File("profesori");
        file.mkdir();
        path = "profesori\\"+idClasa;
        try (BufferedWriter profesori = new BufferedWriter(new FileWriter(path))) {
            profesori.write("");
        }
    }

    @Override
            public boolean delClasa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean editClasa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean addMaterieProfesor(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean delMaterieProfesor(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean editMaterieProfesor(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean addElev(Clasa clasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean delElev(Clasa clasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean editElev(Clasa clasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean addMaterieClasa(Clasa clasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean delElevClasa(Clasa clasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public boolean editElevClasa(Clasa clasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
            public int calcMedieGenerala(Elev elev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public static void main(String args[]){
            
        }
    
}
