package tiempos.backend.estructuras;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "tarjeta")
public class Tarjeta {

    @XmlAttribute
    private String tipo;
    @XmlValue
    private Integer numero;

    public Tarjeta() {
    }

    public Tarjeta(String tipo, Integer numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
