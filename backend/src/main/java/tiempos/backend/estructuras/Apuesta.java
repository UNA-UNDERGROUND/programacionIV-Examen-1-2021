package tiempos.backend.estructuras;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "apuesta")
public class Apuesta {

    @XmlElement(name = "cédula")
    private Integer cedula;
    @XmlElement(name = "número-sorteo")
    private Integer numeroSorteo;
    @XmlElement(name = "número-juego")
    private Integer numeroJuego;
    @XmlElement(name = "monto-apuesta")
    private Integer montoApuesta;
    @XmlElement(name = "monto-premio")
    private Integer montoPremio;

    public Apuesta() {
    }

    public Apuesta(Integer cedula, Integer numeroSorteo, Integer numeroJuego, Integer montoApuesta,
            Integer montoPremio) {
        this.cedula = cedula;
        this.numeroSorteo = numeroSorteo;
        this.numeroJuego = numeroJuego;
        this.montoApuesta = montoApuesta;
        this.montoPremio = montoPremio;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getNumeroSorteo() {
        return numeroSorteo;
    }

    public void setNumeroSorteo(Integer numeroSorteo) {
        this.numeroSorteo = numeroSorteo;
    }

    public Integer getNumeroJuego() {
        return numeroJuego;
    }

    public void setNumeroJuego(Integer numeroJuego) {
        this.numeroJuego = numeroJuego;
    }

    public Integer getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(Integer montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    public Integer getMontoPremio() {
        return montoPremio;
    }

    public void setMontoPremio(Integer montoPremio) {
        this.montoPremio = montoPremio;
    }

}
