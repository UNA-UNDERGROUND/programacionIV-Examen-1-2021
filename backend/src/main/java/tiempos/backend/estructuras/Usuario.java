package tiempos.backend.estructuras;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sorteo")
public class Usuario {

    @XmlAttribute
    private Boolean administrador;
    @XmlElement(name = "nombre")
    private String nombre;
    @XmlElement(name = "apellidos")
    private String apellidos;
    @XmlElement(name = "cédula")
    private Integer cedula;
    @XmlElement(name = "clave")
    private String clave;
    @XmlElement(name = "tarjeta")
    private Tarjeta tarjeta;

    public Usuario() {
    }

    public Usuario(Boolean administrador, String nombre, String apellidos, Integer cedula, String clave,
            Tarjeta tarjeta) {
        this.administrador = administrador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.clave = clave;
        this.tarjeta = tarjeta;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

}
