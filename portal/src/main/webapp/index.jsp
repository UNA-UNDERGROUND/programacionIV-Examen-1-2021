<!DOCTYPE html>
<%@page import="tiempos.backend.estructuras.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Usuario usuario = (Usuario) session.getAttribute("usuario");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ include file="/presentation/Head.jsp" %>
        <title>tiempos PSB</title>
    </head>

    <body>
        <jsp:include page="/presentation/Header.jsp" />
        <div class="contenido">

            <div>
                <%if (usuario == null) {%>
                <h1>Bienvenido al tiempos PSB</h1>
                <%} else {%>
                <%if (usuario.isAdministrador()) {%>
                <h1>DashBoard Administrativo</h1>
                <%} else {%>
                <h1>Bienvenido: <%=usuario.getNombre() + " " + usuario.getApellidos()%></h1>
                <%}%>
                <%}%>

            </div>

        </div>



        <%@ include file="/presentation/Footer.jsp" %>
    </body>

</html>