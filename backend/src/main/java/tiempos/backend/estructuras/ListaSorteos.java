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
    "sorteo"
})
@XmlRootElement(name = "lista-sorteos")
public class ListaSorteos {

    @XmlElement(required = true)
    protected List<Sorteo> sorteo;


    public List<Sorteo> getSorteo() {
        if (sorteo == null) {
            sorteo = new ArrayList<Sorteo>();
        }
        return this.sorteo;
    }

}
