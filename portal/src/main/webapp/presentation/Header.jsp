<%@page import="tiempos.backend.estructuras.Usuario"%>
<% Usuario usuario = (Usuario) session.getAttribute("usuario");%>
<header>
    <div class="logo">
        <img src="/portal/images/logo.png" alt="logo">
        <div class="overlay">
            <div>
                <a href="/portal">Inicio</a>
            </div>
        </div>
    </div>

    <nav>
        <ul>
            <%if (usuario != null) {%>
            <%if (usuario.isAdministrador()) {%>
            <li><a href="/portal/admin-ganador">asignar Numero Ganador</a></li>
            <%}else{%>
            <li><a href="/portal/cliente-apuestas">apuestas</a></li>
            <%}}%>
        </ul>
    </nav>
    <%if (usuario == null) {%>
            <a href="/portal/login-show"><button>Iniciar Sesion</button></a>
        <%} else {%>
            <a href="/portal/logout"><button>Cerrar Sesion</button></a>
     <%}%>
</header>