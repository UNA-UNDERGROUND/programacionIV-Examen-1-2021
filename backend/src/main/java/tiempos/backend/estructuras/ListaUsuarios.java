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
    "usuario"
})
@XmlRootElement(name = "lista-usuarios")
public class ListaUsuarios {

    @XmlElement(required = true)
    protected List<Usuario> usuario;


    public List<Usuario> getUsuario() {
        if (usuario == null) {
            usuario = new ArrayList<>();
        }
        return this.usuario;
    }

}
