package tiempos.backend.estructuras;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apuesta"
})
@XmlRootElement(name = "lista-apuestas")
public class ListaApuestas {

    @XmlElement(required = true)
    protected List<Apuesta> apuesta;


    public List<Apuesta> getApuesta() {
        if (apuesta == null) {
            apuesta = new ArrayList<>();
        }
        return this.apuesta;
    }

}
