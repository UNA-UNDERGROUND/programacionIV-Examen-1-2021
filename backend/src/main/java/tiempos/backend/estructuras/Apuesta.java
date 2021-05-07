package tiempos.backend.estructuras;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "apuesta")
public class Apuesta {

    @XmlElement(name ="c\u00e9dula",required = true)
    protected String cedula;
    @XmlElement(name = "n\u00famero-sorteo", required = true)
    protected BigInteger numeroSorteo;
    @XmlElement(name = "n\u00famero-juego")
    protected int numeroJuego;
    @XmlElement(name = "monto-apuesta", required = true)
    protected BigInteger montoApuesta;
    @XmlElement(name = "monto-premio", required = true)
    protected BigInteger montoPremio;


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String value) {
        this.cedula = value;
    }

    public BigInteger getNumeroSorteo() {
        return numeroSorteo;
    }

    public void setNumeroSorteo(BigInteger value) {
        this.numeroSorteo = value;
    }

    public int getNumeroJuego() {
        return numeroJuego;
    }

    public void setNumeroJuego(int value) {
        this.numeroJuego = value;
    }

    public BigInteger getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(BigInteger value) {
        this.montoApuesta = value;
    }

    public BigInteger getMontoPremio() {
        return montoPremio;
    }

    public void setMontoPremio(BigInteger value) {
        this.montoPremio = value;
    }

}
