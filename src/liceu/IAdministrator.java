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
public interface IAdministrator {
    public void addUser();
    public void delUser(String userDeSters);
    public boolean listUseri();
    public void addMaterie(String idMaterie) throws IOException;
    public void delMaterie(String materieDeSters);
}
