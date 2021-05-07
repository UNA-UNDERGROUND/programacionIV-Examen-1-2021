package tiempos.backend.estructuras;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "tarjeta")
public class Tarjeta {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "tipo")
    protected String tipo;


    public BigInteger getValue() {
        return value;
    }


    public void setValue(BigInteger value) {
        this.value = value;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String value) {
        this.tipo = value;
    }

}
