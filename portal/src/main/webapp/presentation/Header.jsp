<%@page import="tiempos.backend.estructuras.Usuario"%>
<% Usuario usuario = (Usuario) session.getAttribute("usuario");%>
<header>
    <div class="logo">
        <img src="/portal-examen-1/images/logo.png" alt="logo">
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
            <li><a href="/portal-examen-1/admin/AbrirCuenta/show">Abrir Cuenta</a></li>
            <li><a href="/portal-examen-1/admin/Movimiento">Movimientos y Transferencias</a></li>
            <li><a href="/portal-examen-1/admin/intereses">Acreditar Intereses</a></li>
            <%}else{%>
            <li><a href="/portal-examen-1/cliente/cuentas">Ver Cuentas</a></li>
            <li><a href="/portal-examen-1/cliente/cuentas/vincular">Vincular Cuentas</a></li>
            <li><a href="/portal-examen-1/cliente/cuentas/transferencia">Transferencia remota</a></li>
            <%}}%>
        </ul>
    </nav>
    <%if (usuario == null) {%>
            <a href="/portal-examen-1/login/show"><button>Iniciar Sesion</button></a>
        <%} else {%>
            <a href="/portal-examen-1/logout"><button>Cerrar Sesion</button></a>
     <%}%>
</header>