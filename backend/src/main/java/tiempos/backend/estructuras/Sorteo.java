package tiempos.backend.estructuras;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sorteo")
public class Sorteo {

    @XmlElement(name = "n\u00famero-sorteo", required = true)
    protected BigInteger numeroSorteo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlElement(required = true)
    protected String motivo;
    protected int retorno;
    @XmlElement(name = "n\u00famero-ganador")
    protected Integer numeroGanador;
    protected int estado;


    public BigInteger getNumeroSorteo() {
        return numeroSorteo;
    }


    public void setNumeroSorteo(BigInteger value) {
        this.numeroSorteo = value;
    }


    public XMLGregorianCalendar getFecha() {
        return fecha;
    }


    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }


    public String getMotivo() {
        return motivo;
    }


    public void setMotivo(String value) {
        this.motivo = value;
    }


    public int getRetorno() {
        return retorno;
    }

    public void setRetorno(int value) {
        this.retorno = value;
    }

 

    public Integer getNumeroGanador() {
        return numeroGanador;
    }


    public void setNumeroGanador(Integer value) {
        this.numeroGanador = value;
    }


    public int getEstado() {
        return estado;
    }


    public void setEstado(int value) {
        this.estado = value;
    }

}
