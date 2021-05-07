package tiempos.backend.estructuras;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "usuario")
public class Usuario {



    @XmlAttribute(name = "administrador")
    protected Boolean administrador;
    @XmlElement(name = "c\u00e9dula", required = false)
    protected String cedula;
    @XmlElement(name = "clave", required = false)
    protected String clave;
    @XmlElement(name = "apellidos", required = false)
    protected String apellidos;
    @XmlElement(name = "tarjeta", required = false)
    protected String tarjeta;
    @XmlElement(name = "nombre", required = false)
    protected String nombre;

    public Boolean isAdministrador() {
        return administrador;
    }


    public void setAdministrador(Boolean value) {
        this.administrador = value;
    }

    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
