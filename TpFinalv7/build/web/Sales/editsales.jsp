<%@page import="logica.Venta"%>
<%@page import="logica.Paquete"%>
<%@page import="logica.Cliente"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="logica.Servicio"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Trabajo Final (Silicon Misiones)</title>
        <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.min.css?h=781fb6de6e6c5e4ad71f8f3786a9f480">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kaushan+Script">
        <link rel="stylesheet" href="../assets/fonts/fontawesome-all.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/font-awesome.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/ionicons.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/material-icons.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/fontawesome5-overrides.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/css/styles.min.css?h=bba6c2735f5d24a882e68f15efabe94d">
        <link rel="icon" href="../assets/img/favicon.png">
    </head>

    <body style="background: rgb(34,34,34);min-height: 750px;">
        <%
            HttpSession misession = request.getSession();
            String user = (String) misession.getAttribute("usuario");
            if (user == null) {
                response.sendRedirect("../login.jsp");
            } else {
        %>
        <nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark" id="mainNav" style="height: 70px;background-color: #8f3c10!important;position: relative;">
            <div class="container"><a class="navbar-brand" href="#page-top" style="/*background-color: #8f3c10;*/margin: 0!important;padding: 0!important;">Travel Agency</a><button data-bs-toggle="collapse" data-bs-target="#navbarResponsive" class="navbar-toggler navbar-toggler-right" type="button" data-toogle="collapse" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto text-uppercase" style="background-color: rgba(143,60,16,0.75);align-items: center;">
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="../index.jsp">Inicio</a></li>
                        <li class="nav-item"></li>
                        <li class="nav-item"></li>
                        <li class="nav-item dropdown">
                            <a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">clientes</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);">
                                <form action="../SvCliente" method="GET">
                                    <a href="../SvCliente" class="SUBMIT dropdown-item">Listado</a>
                                </form>
                                <a class="dropdown-item" href="../Clients/addclient.jsp">Agregar</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Ventas</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);">
                                <form action="../SvLstVta" method="GET">
                                    <a href="../SvLstVta" class="SUBMIT dropdown-item">Listado</a>
                                </form>
                                <form action="../SvVenta" method="GET">
                                    <a class="dropdown-item" href="../SvVenta" style="text-decoration: none;">Agregar</a>
                                </form>
                            </div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Servicios</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);">
                                <form action="../SvServicio" method="GET">
                                    <a class="dropdown-item" href="../SvServicio" style="text-decoration: none;">Listado</a>
                                </form>
                                <a class="dropdown-item" href="../Services/addservice.jsp">Agregar</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">paquetes</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);">
                                <form action="../SvLstPkg" method="GET">
                                    <a class="dropdown-item" href="../SvLstPkg" style="text-decoration: none;">Listado</a>
                                </form>
                                <form action="../SvServicio" method="GET">
                                    <a class="dropdown-item" href="../SvPackage" style="text-decoration: none;">Agregar</a>
                                </form>
                            </div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">empleados</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);">
                                <form action="../SvEmpleado" method="GET">
                                    <a href="../SvEmpleado" class="SUBMIT dropdown-item">Listado</a>
                                </form>
                                <a class="dropdown-item" href="../Admin/addemployee.jsp">agregar</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#"><%=user%></a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);">
                                <a class="dropdown-item" href="#" data-bs-target="#editProfile" data-bs-toggle="modal">Profile</a>
                                <a class="dropdown-item" href="../logout.jsp">Logout</a>
                            </div>
                        </li>
                        <li class="nav-item"></li>
                        <li class="nav-item"></li>
                        <li class="nav-item"></li>
                        <li class="nav-item"></li>
                        <li class="nav-item"></li>
                        <li class="nav-item"></li>
                    </ul>
                </div>
            </div>
        </nav>
        <section id="services" style="/*position: 50% 50%;*/display: block;box-sizing: border-box;position: relative;vertical-align: middle;overflow: visible;object-fit: cover;clear: both;content: '';background-image: url(&quot;../assets/img/80695701-0.jpeg?h=ba907fe0be1b39a84cd0d15e4724b0e6&quot;);background-size: cover;background-repeat: no-repeat;min-height: 750px;padding: 110px 0;">
            <!-- Start: user settings -->
            <div class="col-lg-12 col-xl-12 offset-xl-0 d-lg-flex justify-content-lg-center">
                <div class="card shadow mb-3" style="background: rgba(255,255,255,0.77);">
                    <div class="card-header py-3">
                        <p class="text-center m-0 fw-bold" style="font-size: 32px;text-shadow: 5px 4px 7px rgb(150,129,40);color: rgb(143,60,16);">Modificar Venta</p>
                    </div>
                    <div class="card-body">
                        <form name="frmventa" id="frmpackage" action="../SvMdfVta" method="POST">
                            <div class="card" style="background-color: #ffffffa8;">
                                <div class="card-body">
                                    <h5 class="card-title text-uppercase mb-0">Clientes</h5>
                                    <p>Seleccione UN SOLO cliente para realizar la venta</p>
                                </div>
                                <div class="table-responsive">
                                    <div class="table-responsive table no-wrap user-table mb-0">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col" class="border-0 text-uppercase font-medium pl-4">Cod</th>
                                                    <th class="border-0 text-uppercase font-medium" scope="col">Nombre/Domicilio</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">DNI/NAC</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Email &amp; Celular</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">F.Nac</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Estado</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Administrar</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    Venta ventaMod = (Venta) request.getSession().getAttribute("venta");
                                                    String idVenta = String.valueOf(ventaMod.getIdVenta());
                                                    Cliente clienteMod = ventaMod.getCliente();
                                                    List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
                                                    for (Cliente cliente : listaClientes) {
                                                        Long idCliente = cliente.getId();
                                                        Integer cod = cliente.getCod_cliente();
                                                        String nombre = cliente.getApellido() + " " + cliente.getNombre();
                                                        String dire = cliente.getDireccion();
                                                        String dni = cliente.getDni();
                                                        String nacion = cliente.getNacionalidad();
                                                        String mail = cliente.getEmail();
                                                        String cel = cliente.getCelular();
                                                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                                        sdf.setTimeZone(TimeZone.getTimeZone("America/Argentina"));
                                                        String fecNac = sdf.format(cliente.getFechaNac());
                                                        Boolean estado1 = cliente.getAlta();
                                                        String estado = "inactivo";
                                                        int cantCompras = cliente.getListaventas().size();
                                                        if (estado1) {
                                                            estado = "activo";
                                                        }
                                                        String clienteChecked = "";
                                                        System.out.println("Cod: " + cod + "\nCod2: " + clienteMod.getCod_cliente());
                                                        if (cod != null) {
                                                            if (cod.equals(clienteMod.getCod_cliente())) {
                                                                clienteChecked = "checked";
                                                            }
                                                        }

                                                %>
                                                <tr>
                                                    <td style="width: 2%;"><%=cod%></td>
                                                    <td class="col-3">
                                                        <h5 class="font-medium mb-0"><%=nombre%></h5>
                                                        <span class="text-muted"><%=dire%></span>
                                                    </td>
                                                    <td class="col-1">
                                                        <span class="text-muted"><%=dni%></span><br>
                                                        <span class="text-muted"><%=nacion%></span>
                                                    </td>
                                                    <td class="col-2">
                                                        <span class="text-muted"><%=mail%></span><br>
                                                        <span class="text-muted"><%=cel%></span>
                                                    </td>
                                                    <td class="col-1"><span class="text-muted"><%=fecNac%></span><br>
                                                    </td>
                                                    <td class="col-1">
                                                        <span class="text-muted"><%=estado%></span><br>
                                                        <span class="text-muted"><%=cantCompras%></span>
                                                    </td>
                                                    <td class="col-2">
                                                        <input type="radio" name="idCliente" class="btn-check" id="<%=idCliente%>" value="<%=idCliente%>" <%=clienteChecked%>>
                                                        <label class="btn btn-outline-primary" for="<%=idCliente%>">Elegir</label>
                                                    </td>
                                                </tr>
                                                <% }%>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="card" style="background-color: #ffffffa8;">
                                <div class="card-body">
                                    <h5 class="card-title text-uppercase mb-0">Servicios</h5>
                                    <p>Si el cliente desea UN SOLO SERVICIO, seleccione uno de esta lista</p>
                                </div>
                                <div class="table-responsive">
                                    <div class="table-responsive table no-wrap user-table mb-0">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col" class="border-0 text-uppercase font-medium pl-4">Cod</th>
                                                    <th class="border-0 text-uppercase font-medium" scope="col">Nombre/Destino</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Costo/F.Serv</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Descripci??n</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Elegir</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    List<Servicio> listaServicios = (List) request.getSession().getAttribute("listaServicios");
                                                    Servicio servMod = ventaMod.getServicio();
                                                    for (Servicio unServicio : listaServicios) {
                                                        Long idServicio = unServicio.getId();
                                                        Integer cod = unServicio.getCod_servicio();
                                                        String nombre = unServicio.getNombre();
                                                        String dest = unServicio.getDestino();
                                                        String desc = unServicio.getDescripcion();
                                                        Double costo = unServicio.getCosto_servicio();
                                                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                                        sdf.setTimeZone(TimeZone.getTimeZone("America/Argentina"));
                                                        Date fecha = unServicio.getFecha_servicio();
                                                        String fecsv = "";
                                                        if (fecha != null) {
                                                            fecsv = sdf.format(unServicio.getFecha_servicio());
                                                        }
                                                        String serviceCheck = "";
                                                        if (servMod != null) {
                                                            if (cod.equals(servMod.getCod_servicio())) {
                                                                serviceCheck = "checked";
                                                            }
                                                        }

                                                %>
                                                <tr>
                                                    <td style="width: 2%;"><%=cod%></td>
                                                    <td class="col-2">
                                                        <h5 class="font-medium mb-0"><%=nombre%></h5>
                                                        <span class="text-muted"><%=dest%></span>
                                                    </td>
                                                    <td class="col-2">
                                                        <span class="text-muted">$ <%=costo%></span><br>
                                                        <span class="text-muted"><%=fecsv%></span></td>
                                                    <td class="col-5">
                                                        <span class="text-muted"><%=desc%></span><br>
                                                    <td class="col-2">
                                                        <input type="hidden" name="cambio" value="S">
                                                        <input type="radio" name="srvpkg" class="btn-check" id="<%=idServicio%>" value="S<%=idServicio%>" <%=serviceCheck%>>
                                                        <label class="btn btn-outline-primary" for="<%=idServicio%>">Elegir</label>
                                                    </td>
                                                </tr>
                                                <% }%>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="card" style="background-color: #ffffffa8;">
                                <div class="card-body">
                                    <h5 class="card-title text-uppercase mb-0">Paquetes</h5>
                                    <p>Si el cliente desea MAS de un SERVICIO, seleccione uno de los paquetes de esta lista o cree un paquete nuevo</p>
                                </div>
                                <div class="table-responsive">
                                    <div class="table-responsive table no-wrap user-table mb-0">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col" class="border-0 text-uppercase font-medium pl-4">Cod.</th>
                                                    <th class="border-0 text-uppercase font-medium" scope="col">Servicios Incluidos</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Precio</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Seleccionar</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    List<Paquete> listaPaquetes = (List) request.getSession().getAttribute("listaPaquetes");
                                                    Paquete paqMod = ventaMod.getPaquete();
                                                    for (Paquete unPaquete : listaPaquetes) {
                                                        Long idPaquete = unPaquete.getId();
                                                        Integer cod = unPaquete.getCod_paquete();
                                                        Double precio = unPaquete.getCosto_paquete();
                                                        List<Servicio> listaServi = unPaquete.getLista_servicios_incluidos();
                                                        String servicios = "";
                                                        for (Servicio unServicio : listaServi) {
                                                            servicios = servicios + unServicio.getNombre() + ": " + unServicio.getDescripcion() + "; ";
                                                        }
                                                        List<Venta> listaVenta = unPaquete.getListaVenta();
                                                        String packCheck = "";
                                                        if (paqMod != null) {
                                                            if (cod.equals(paqMod.getCod_paquete())) {
                                                                packCheck = "checked";
                                                            }
                                                        }
                                                %>
                                                <tr>
                                                    <td style="width: 2%;"><%=cod%></td>
                                                    <td class="col-8">
                                                        <span class="text-muted"><%=servicios%></span>
                                                    </td>
                                                    <td class="col-2"><span class="text-muted">$ <%=precio%></span><br>
                                                    <td class="col-2">
                                                        <input type="hidden" name="cambio" value="P">
                                                        <input type="radio" name="srvpkg" class="btn-check" id="<%=idPaquete%>" value="P<%=idPaquete%>" <%=packCheck%>>
                                                        <label class="btn btn-outline-primary" for="<%=idPaquete%>">Elegir</label>
                                                    </td>
                                                </tr>
                                                <% }%>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="card" style="background-color: #ffffffa8;">
                                <div class="card-body">
                                    <h5 class="card-title text-uppercase mb-0">Medio de pago</h5>
                                    <p>Elegir un solo medio de Pago</p>
                                </div>
                                <div class="table-responsive">
                                    <div class="table-responsive table no-wrap user-table mb-0">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col" class="border-0 text-uppercase font-medium pl-4">Cod.</th>
                                                    <th class="border-0 text-uppercase font-medium" scope="col">Descripcion</th>
                                                    <th scope="col" class="border-0 text-uppercase font-medium">Seleccionar</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    String medPagoMod = ventaMod.getMedio_pago();
                                                    String efectivo = "";
                                                    String debito = "";
                                                    String credito = "";
                                                    String transferencia = "";
                                                    String monevirtual = "";
                                                    switch (medPagoMod) {
                                                        case "efectivo":
                                                            efectivo = "checked";
                                                            break;
                                                        case "debito":
                                                            debito = "checked";
                                                            break;
                                                        case "credito":
                                                            credito = "checked";
                                                            break;
                                                        case "transferencia":
                                                            transferencia = "checked";
                                                            break;
                                                        case "monevirtual":
                                                            monevirtual = "checked";
                                                            break;
                                                    }
                                                %>
                                                <tr>

                                                    <td style="width: 2%;">1</td>
                                                    <td class="col-8">
                                                        <span class="text-muted">Efectivo</span>
                                                    </td>
                                                    <td class="col-2">
                                                        <input type="radio" class="btn-check" id="efectivo" name="medioPago" value="efectivo" <%=efectivo%>>
                                                        <label class="btn btn-outline-primary" for="efectivo">Elegir</label>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="width: 2%;">2</td>
                                                    <td class="col-8">
                                                        <span class="text-muted">D??bito</span>
                                                    </td>
                                                    <td class="col-2">
                                                        <input type="radio" class="btn-check" id="debito" name="medioPago" value="debito" <%=debito%>>
                                                        <label class="btn btn-outline-primary" for="debito">Elegir</label>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="width: 2%;">3</td>
                                                    <td class="col-8">
                                                        <span class="text-muted">Cr??dito</span>
                                                    </td>
                                                    <td class="col-2">
                                                        <input type="radio" class="btn-check" id="credito" name="medioPago" value="credito" <%=credito%>>
                                                        <label class="btn btn-outline-primary" for="credito">Elegir</label>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="width: 2%;">4</td>
                                                    <td class="col-8">
                                                        <span class="text-muted">Transferencia</span>
                                                    </td>
                                                    <td class="col-2">
                                                        <input type="radio" class="btn-check" id="transferencia" name="medioPago" value="transferencia" <%=transferencia%>>
                                                        <label class="btn btn-outline-primary" for="transferencia">Elegir</label>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td style="width: 2%;">5</td>
                                                    <td class="col-8">
                                                        <span class="text-muted">Monedero Virtual</span>
                                                    </td>
                                                    <td class="col-2">
                                                        <input type="radio" class="btn-check" id="monevirtual" name="medioPago" value="monevirtual" <%=monevirtual%>>
                                                        <label class="btn btn-outline-primary" for="monevirtual">Elegir</label>
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="d-xl-flex justify-content-xl-center form-group mb-3">
                                <input type="hidden" name="idVenta" value="<%=idVenta%>">
                                <input type="hidden" name="usuario" value="<%=user%>">
                                <button class="btn btn-primary btn-sm" type="submit">Guardar Venta</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div><!-- End: user settings -->
        </section><!-- Start: Footer Basic -->
        <footer class="footer-basic" style="background: rgb(34,34,34);border-color: #333333;border-top-color: rgb(75,;border-right-color: 76,;border-bottom-color: 77);border-left-color: 76,;padding: 0px;">
            <!-- Start: Social Icons -->
            <div class="social" style="padding: 10px;color: rgb(255,255,255);"><a href="#"><i class="icon ion-social-instagram"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-facebook"></i></a></div><!-- End: Social Icons -->
            <!-- Start: Links -->
            <ul class="list-inline" style="color: rgb(255,255,255);">
                <li class="list-inline-item">
                    <a href="#">Inicio</a>
                </li>
                <li class="list-inline-item">
                    <form action="../SvServicio" method="GET">
                        <a href="../SvServicio" style="text-decoration: none;">Servicios</a>
                    </form>
                </li>
            </ul><!-- End: Links -->
            <!-- Start: Copyright -->
            <p class="copyright">Ariel Guerrero&nbsp; ?? 2021</p><!-- End: Copyright -->
        </footer><!-- End: Footer Basic -->
        <% }%>
        <script src="../assets/js/jquery.min.js?h=83e266cb1712b47c265f77a8f9e18451"></script>
        <script src="../assets/bootstrap/js/bootstrap.min.js?h=5488c86a1260428f0c13c0f8fb06bf6a"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="../assets/js/script.min.js?h=99e4877f501cd30e2301247e12adfe46"></script>
    </body>
</html>
