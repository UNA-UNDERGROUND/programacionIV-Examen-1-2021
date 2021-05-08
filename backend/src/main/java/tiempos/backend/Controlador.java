/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempos.backend;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import tiempos.backend.estructuras.*;

/**
 *
 * @author jonathan
 */
public final class Controlador {

    private Controlador() {
        cargarDatos();
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

    public Usuario login(Usuario credenciales) {
        try{
            Usuario cred = recuperarUsuario(credenciales.getCedula());
            String clave1 = cred.getClave();
            String clave2 = credenciales.getClave();
            if (clave1.equals(clave2)) {
                if(credenciales.isAdministrador() != null && credenciales.isAdministrador()){
                    if(cred.isAdministrador() == null &&!cred.isAdministrador().equals(true)){
                        return null;
                    }
                }
                return cred;
            }
        }
        catch(Exception ex){
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        
        return null;
    }

    public List<Sorteo> getProximosSorteos(){
        ListaSorteos lista = info.getListaSorteos();
        List<Sorteo> filtro = new ArrayList<>();

        for(Sorteo sorteo: lista.getSorteo()){
            if (sorteo.getEstado() == 1){
                filtro.add(sorteo);
            }
        }

        return filtro;
    }
    public List<Sorteo> getPasadosSorteos() {
        ListaSorteos lista = info.getListaSorteos();
        List<Sorteo> filtro = new ArrayList<>();

        for(Sorteo sorteo: lista.getSorteo()){
            if (sorteo.getEstado() != 1){
                filtro.add(sorteo);
            }
        }

        return filtro;
    }
    public List<Apuesta> getApuestasUsuario(String cedula){
        ListaApuestas lista = info.getListaApuestas();
        List<Apuesta> filtro = new ArrayList<>();
        for (Apuesta apuesta : lista.getApuesta()) {
            if (apuesta.getCedula().equals(cedula)) {
                filtro.add(apuesta);
            }
        }
        return filtro;
    }
    public Sorteo getSorteo(BigInteger numeroSorteo){
        ListaSorteos lista = info.getListaSorteos();

        for(Sorteo sorteo: lista.getSorteo()){
            if (sorteo.getNumeroSorteo().equals(numeroSorteo)){
                return sorteo;
            }
        }

        return null;
    }
    public void agregarApuesta(Apuesta apuesta){
        int montoApuesta = apuesta.getMontoApuesta().intValue();
        int numeroJuego = apuesta.getNumeroJuego();
        if(montoApuesta > 99 && montoApuesta < 20000 && numeroJuego >= 0 && numeroJuego < 100){
            info.getListaApuestas().getApuesta().add(apuesta);
            System.out.print("apuesta nueva: \n" + apuesta);
        }
        //se imprime  la informacion de la apuesta
        
        
    }
    
    public void agregarGanador(BigInteger numeroSorteo, int numeroGanador){
        Sorteo sorteo = getSorteo(numeroSorteo);
        if(sorteo != null && numeroGanador <= 0 && numeroGanador < 100){
            sorteo.setNumeroGanador(numeroGanador);
            //cerrado
            sorteo.setEstado(3);
        }
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
