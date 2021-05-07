package tiempos.backend.estructuras;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sorteo")
public class Sorteo {

    @XmlElement(name = "número-sorteo")
    private Integer numeroSorteo;
    @XmlElement(name = "fecha")
    private Date fecha;
    @XmlElement(name = "motivo")
    private String motivo;
    @XmlElement(name = "retorno")
    private Integer retorno;
    @XmlElement(name = "número-ganador")
    private Integer numeroGanador;
    @XmlElement(name = "estado")
    private Integer estado;

    public Sorteo() {
    }

    public Sorteo(
            Integer numeroSorteo,
            Date fecha,
            String motivo,
            Integer retorno,
            Integer numeroGanador,
            Integer estado) {
        this.numeroSorteo = numeroGanador;
        this.fecha = fecha;
        this.motivo = motivo;
        this.retorno = retorno;
        this.numeroGanador = numeroGanador;
        this.estado = estado;
    }

    public Integer getNumeroSorteo() {
        return numeroSorteo;
    }

    public void setNumeroSorteo(Integer numeroSorteo) {
        this.numeroSorteo = numeroSorteo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getRetorno() {
        return retorno;
    }

    public void setRetorno(Integer retorno) {
        this.retorno = retorno;
    }

    public Integer getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(Integer numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
