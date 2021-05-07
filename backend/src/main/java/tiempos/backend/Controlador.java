/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempos.backend;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import tiempos.backend.estructuras.Informacion;
import tiempos.backend.estructuras.ListaUsuarios;
import tiempos.backend.estructuras.Usuario;

/**
 *
 * @author jonathan
 */
public class Controlador {

    private Controlador() {

    }

    public Usuario recuperarUsuario(String cedula) {
        ListaUsuarios lista = info.getListaUsuarios();
        for (Usuario u : lista.getUsuario()) {
            if (u.getCedula().equals(cedula)) {
                return u;
            }
        }
        return null;
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").startsWith("Windows");
    }

    private void cargarConfiguraciones() {
        try {

            this.cfg.load(getClass().getResourceAsStream(UBICACION_CONFIGURACION));
            String rutaXML = cfg.getProperty(isWindows() ? "rutaWindows" : "rutaUNIX");
            String nombreXML = cfg.getProperty("nombreXML");
            String homeDIR = System.getProperty("user.home");
            this.ubicacionXML =  homeDIR + rutaXML + nombreXML;
        } catch (IOException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }

    public Usuario login(Usuario credenciales) {
        try{
            Usuario cred = recuperarUsuario(credenciales.getCedula());
            if (cred.getClave().equals(credenciales.getClave())) {
                return cred;
            }
        }
        catch(Exception ex){
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        
        return null;
    }

    public Boolean cargarDatos() {
        cargarConfiguraciones();
        info = new Informacion();
        try {
            File xml = new File(ubicacionXML);
            ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream(Files.readAllBytes(xml.toPath()));
            JAXBContext context = JAXBContext.newInstance(info.getClass());
            Unmarshaller unmarshaller = context.createUnmarshaller();

            unmarshaller.setSchema(null);
            info = info.getClass().cast(unmarshaller.unmarshal(xmlContentBytes));

        } catch (Exception ex) {
            System.err.printf("Excepción: '%s'%n", ex.getLocalizedMessage());
            System.err.printf("Excepción: '%s'%n", ex.getCause());
            return false;
        }

        return true;

    }

    public static Controlador getInstancia() {
        if (instancia == null) {
            instancia = new Controlador();
        }
        return instancia;
    }

    private String ubicacionXML;

    private static Controlador instancia;
    private final Properties cfg = new Properties();
    private Informacion info;

    private static final String UBICACION_CONFIGURACION = "/configuraciones/archivos.properties";
}
