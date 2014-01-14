/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liceu;

/**
 *
 * @author alexa_000
 */
public interface IProfesor {
    public void listUseriClasa();
    public boolean sortUseri(int Criteria);
    public boolean addNota(Elev Elev);
    public boolean modMedie(Elev Elev);
    public boolean addAbsenta(Elev Elev);
    public boolean modAbsenta(SituatieMaterieBaza.Absenta Absenta);    
}
