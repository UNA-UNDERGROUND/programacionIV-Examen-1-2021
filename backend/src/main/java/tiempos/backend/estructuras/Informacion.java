package tiempos.backend.estructuras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaSorteos",
    "listaUsuarios",
    "listaApuestas"
})
@XmlRootElement(name = "informaci\u00f3n")
public class Informacion {

    @XmlElement(name = "lista-sorteos", required = true)
    protected ListaSorteos listaSorteos;
    @XmlElement(name = "lista-usuarios", required = true)
    protected ListaUsuarios listaUsuarios;
    @XmlElement(name = "lista-apuestas", required = true)
    protected ListaApuestas listaApuestas;


    public ListaSorteos getListaSorteos() {
        return listaSorteos;
    }

 
    public void setListaSorteos(ListaSorteos value) {
        this.listaSorteos = value;
    }


    public ListaUsuarios getListaUsuarios() {
        return listaUsuarios;
    }


    public void setListaUsuarios(ListaUsuarios value) {
        this.listaUsuarios = value;
    }


    public ListaApuestas getListaApuestas() {
        return listaApuestas;
    }


    public void setListaApuestas(ListaApuestas value) {
        this.listaApuestas = value;
    }

}
