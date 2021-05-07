package tiempos.backend.estructuras;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "usuario")
public class Usuario {

    @XmlElementRefs({
        @XmlElementRef(name = "clave", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "c\u00e9dula", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "apellidos", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tarjeta", type = Tarjeta.class, required = false),
        @XmlElementRef(name = "nombre", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "administrador")
    protected Boolean administrador;


    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }


    public Boolean isAdministrador() {
        return administrador;
    }


    public void setAdministrador(Boolean value) {
        this.administrador = value;
    }
    
}
