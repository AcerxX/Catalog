/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liceu;

import java.io.IOException;

/**
 *
 * @author alexa_000
 */
public interface ISecretar {
    public void addClasa() throws IOException;
    public boolean delClasa();
    public boolean editClasa();
    public boolean addMaterieProfesor(Profesor profesor);
    public boolean delMaterieProfesor(Profesor profesor);
    public boolean editMaterieProfesor(Profesor profesor);
    public boolean addElev(Clasa clasa);
    public boolean delElev(Clasa clasa);
    public boolean editElev(Clasa clasa);
    public boolean addMaterieClasa(Clasa clasa);
    public boolean delElevClasa(Clasa clasa);
    public boolean editElevClasa(Clasa clasa);
    public int calcMedieGenerala(Elev elev);
}
