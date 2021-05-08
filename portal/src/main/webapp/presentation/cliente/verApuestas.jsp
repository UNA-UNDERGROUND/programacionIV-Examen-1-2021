<%@page import="java.math.BigInteger"%>
<%@page import="tiempos.backend.estructuras.Sorteo"%>
<%@page import="tiempos.backend.estructuras.Apuesta"%>
<%@page import="java.util.List"%>
<%@page import="tiempos.backend.Controlador"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
    Controlador controlador = Controlador.getInstancia();
    List<Apuesta> apuestasUsuario = controlador.getApuestasUsuario(usuario.getCedula());
    List<Sorteo> sorteos = controlador.getProximosSorteos();
%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Cuentas</title>
        <%@ include file="/presentation/Head.jsp" %>
        <link rel="stylesheet" href="/portal/css/componentes/formulario.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <jsp:include page="/presentation/Header.jsp" />

    <div>
            <table>
                <caption>Mis Apuestas</caption>
                <tr>
                    <th>Motivo</th>
                    <th>Fecha</th>
                    <th>Retorno</th>
                    <th>Ganador</th>
                    <th>Casas</th>
                    <th>Premio</th>
                </tr>
                <%for (Apuesta apuesta : apuestasUsuario) {%>
                <tr>
                    <%
                        Sorteo sorteo = controlador.getSorteo(apuesta.getNumeroSorteo());
                        Integer numeroGanador = sorteo.getNumeroGanador();
                    %>
                    <td><%=sorteo.getMotivo()%></td>
                    <td><%=sorteo.getFecha()%></td>
                    <td><%=sorteo.getRetorno()%></td>
                    <td><%=numeroGanador == null ? "" : numeroGanador%></td>
                    <td><%=apuesta.getMontoApuesta() == null ? "" : apuesta.getMontoApuesta()%></td>
                    <td><%=(numeroGanador != null && numeroGanador.equals(apuesta.getNumeroJuego())) ? apuesta.getMontoPremio() : 0%></td>
                </tr>
                <%}%>
            </table>
        </div>
    <div class="contenido">


        
        <div>
            <div class="formulario">
                <h6>Apostar</h6>

                <form action="/portal/cliente-apostar" method="post">

                    <div class="campo-entrada" >
                        <a>Sorteo: </a>
                        <select required name="sorteo">
                            <option value=""  disabled selected>Seleccione un sorteo</option>
                            <%for (Sorteo sorteo : sorteos) {%>
                            <option value="<%=sorteo.getNumeroSorteo()%>">
                                <%=sorteo.getFecha()%> - <%=sorteo.getMotivo()%>
                            </option>
                            <%}%>
                        </select>
                    </div>
                    <div class="campo-entrada" >
                        <input type="number" id="numero" name="numero"  
                               placeholder=" " required>
                        <label for="numero">numero</label>
                    </div>
                    <div class="campo-entrada" >
                        <input type="number" id="monto" name="monto"  
                               placeholder=" " required>
                        <label for="monto">monto</label>
                    </div>

                    <button class="submit">Apostar</button>


                </form>
            </div>
        </div>

    </div>


    <%@ include file="/presentation/Footer.jsp" %>


</html>


<%!
    private String erroneo(String campo, Map<String, String> errores) {
        if ((errores != null) && (errores.get(campo) != null)) {
            return "erroneo";
        } else {
            return "";
        }
    }
%> 

