package tiempos.backend.estructuras;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;



@XmlRegistry
public class ObjectFactory {

    private final static QName _Apellidos_QNAME = new QName("", "apellidos");
    private final static QName _Motivo_QNAME = new QName("", "motivo");
    private final static QName _Estado_QNAME = new QName("", "estado");
    private final static QName _Clave_QNAME = new QName("", "clave");
    private final static QName _MontoApuesta_QNAME = new QName("", "monto-apuesta");
    private final static QName _Nombre_QNAME = new QName("", "nombre");
    private final static QName _NumeroSorteo_QNAME = new QName("", "n\u00famero-sorteo");
    private final static QName _Fecha_QNAME = new QName("", "fecha");
    private final static QName _Retorno_QNAME = new QName("", "retorno");
    private final static QName _NumeroJuego_QNAME = new QName("", "n\u00famero-juego");
    private final static QName _NumeroGanador_QNAME = new QName("", "n\u00famero-ganador");
    private final static QName _MontoPremio_QNAME = new QName("", "monto-premio");
    private final static QName _Cedula_QNAME = new QName("", "c\u00e9dula");


    public ObjectFactory() {
    }

 
    public Sorteo createSorteo() {
        return new Sorteo();
    }


    public ListaApuestas createListaApuestas() {
        return new ListaApuestas();
    }


    public Apuesta createApuesta() {
        return new Apuesta();
    }


    public ListaUsuarios createListaUsuarios() {
        return new ListaUsuarios();
    }


    public Usuario createUsuario() {
        return new Usuario();
    }


    public Tarjeta createTarjeta() {
        return new Tarjeta();
    }


    public Informacion createInformacion() {
        return new Informacion();
    }


    public ListaSorteos createListaSorteos() {
        return new ListaSorteos();
    }


    @XmlElementDecl(namespace = "", name = "apellidos")
    public JAXBElement<String> createApellidos(String value) {
        return new JAXBElement<>(_Apellidos_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "motivo")
    public JAXBElement<String> createMotivo(String value) {
        return new JAXBElement<>(_Motivo_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "estado")
    public JAXBElement<Integer> createEstado(Integer value) {
        return new JAXBElement<>(_Estado_QNAME, Integer.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "clave")
    public JAXBElement<String> createClave(String value) {
        return new JAXBElement<>(_Clave_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "monto-apuesta")
    public JAXBElement<BigInteger> createMontoApuesta(BigInteger value) {
        return new JAXBElement<>(_MontoApuesta_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "nombre")
    public JAXBElement<String> createNombre(String value) {
        return new JAXBElement<>(_Nombre_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "n\u00famero-sorteo")
    public JAXBElement<BigInteger> createNumeroSorteo(BigInteger value) {
        return new JAXBElement<>(_NumeroSorteo_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "fecha")
    public JAXBElement<XMLGregorianCalendar> createFecha(XMLGregorianCalendar value) {
        return new JAXBElement<>(_Fecha_QNAME, XMLGregorianCalendar.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "retorno")
    public JAXBElement<Integer> createRetorno(Integer value) {
        return new JAXBElement<>(_Retorno_QNAME, Integer.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "n\u00famero-juego")
    public JAXBElement<Integer> createNumeroJuego(Integer value) {
        return new JAXBElement<>(_NumeroJuego_QNAME, Integer.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "n\u00famero-ganador")
    public JAXBElement<Integer> createNumeroGanador(Integer value) {
        return new JAXBElement<>(_NumeroGanador_QNAME, Integer.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "monto-premio")
    public JAXBElement<BigInteger> createMontoPremio(BigInteger value) {
        return new JAXBElement<>(_MontoPremio_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "c\u00e9dula")
    public JAXBElement<String> createCedula(String value) {
        return new JAXBElement<>(_Cedula_QNAME, String.class, null, value);
    }

}
