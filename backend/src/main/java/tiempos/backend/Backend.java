/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempos.backend;




/**
 *
 * @author jonguz
 */
public class Backend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador c = Controlador.getInstancia();
        c.recuperarUsuario("105710421");
        System.out.print(c);
    }
    
}
