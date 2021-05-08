<%@ page import="tiempos.backend.Controlador" %>
<%@ page import="tiempos.backend.estructuras.Sorteo" %>
<%@ page import="java.util.List" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
    Controlador controlador = Controlador.getInstancia();
    List<Sorteo> proximos = controlador.getProximosSorteos();
    List<Sorteo> anteriores = controlador.getPasadosSorteos();
%>

<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sorteos</title>
    <%@ include file="/presentation/Head.jsp" %>
    <link rel="stylesheet" href="/portal/css/componentes/formulario.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
    <jsp:include page="/presentation/Header.jsp" />
    <div>
  

    <div class="contenido">
        <table>
            <caption>Sorteos Proximos</caption>
            <tr>
                <th>Motivo</th>
                <th>Fecha</th>
                <th>Retorno</th>
            </tr>
            <%for (Sorteo sorteo : proximos) {%>
            <tr>

                <td><%=sorteo.getMotivo()%></td>
                <td><%=sorteo.getFecha()%></td>
                <td><%=sorteo.getRetorno()%></td>
            </tr>
            <%}%>
        </table>
        <table>
            <caption>Sorteos Anteriores</caption>
            <tr>
                <th>Motivo</th>
                <th>Fecha</th>
                <th>Retorno</th>
                <th>Ganador</th>
            </tr>
            <%for (Sorteo sorteo : anteriores) {%>
            <tr>

                <td><%=sorteo.getMotivo()%></td>
                <td><%=sorteo.getFecha()%></td>
                <td><%=sorteo.getRetorno()%></td>
                <td><%=sorteo.getNumeroGanador()%></td>
            </tr>
            <%}%>
        </table>
    </div>


</div>
    <%@ include file="/presentation/Footer.jsp" %>
</body>

</html>



