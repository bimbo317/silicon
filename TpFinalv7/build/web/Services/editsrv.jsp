<%@page import="java.util.Date"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="logica.Servicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>polotic2da (BS 5)</title>
        <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.min.css?h=781fb6de6e6c5e4ad71f8f3786a9f480">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Kaushan+Script">
        <link rel="stylesheet" href="../assets/fonts/fontawesome-all.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/font-awesome.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/ionicons.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/material-icons.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/fonts/fontawesome5-overrides.min.css?h=220695d33937f0c1d9977599320bf21d">
        <link rel="stylesheet" href="../assets/css/styles.min.css?h=bba6c2735f5d24a882e68f15efabe94d">
    </head>

    <body style="background: rgb(34,34,34);min-height: 750px;">
        <nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark" id="mainNav" style="height: 70px;background-color: #8f3c10!important;position: relative;">
            <div class="container"><a class="navbar-brand" href="#page-top" style="/*background-color: #8f3c10;*/margin: 0!important;padding: 0!important;">Travel Agency</a><button data-bs-toggle="collapse" data-bs-target="#navbarResponsive" class="navbar-toggler navbar-toggler-right" type="button" data-toogle="collapse" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto text-uppercase" style="background-color: rgba(143,60,16,0.75);align-items: center;">
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="../index.jsp">Inicio</a></li>
                        <li class="nav-item"></li>
                        <li class="nav-item"></li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">clientes</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);"><a class="dropdown-item" href="../Clients/lstclients.jsp">Lista</a><a class="dropdown-item" href="../Clients/addclient.jsp">Agregar</a></div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Ventas</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);"><a class="dropdown-item" href="../Sales/lstsales.jsp">Lista</a><a class="dropdown-item" href="../Sales/addsale.jsp">Agregar</a></div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Servicios</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);"><a class="dropdown-item" href="../Services/buses.jsp">Autobuses</a><a class="dropdown-item" href="../Services/cars.jsp">autos</a><a class="dropdown-item" href="../Services/events.jsp">Eventos</a><a class="dropdown-item" href="../Services/excursions.jsp">Excursiones</a><a class="dropdown-item" href="../Services/hotel.jsp">Hoteles</a><a class="dropdown-item" href="../Services/trains.jsp">Trenes</a><a class="dropdown-item" href="../Services/flights.jsp">Vuelos</a></div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">paquetes</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);"><a class="dropdown-item" href="../Package/lstpackage.jsp">lista</a><a class="dropdown-item" href="../Package/addpackage.jsp">agregar</a></div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">empleados</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);"><a class="dropdown-item" href="../Admin/lstemployees.jsp">Lista</a><a class="dropdown-item" href="../Admin/addemployee.jsp">agregar</a></div>
                        </li>
                        <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">usuario</a>
                            <div class="dropdown-menu" style="background: rgb(187,99,53);"><a class="dropdown-item" href="#" data-bs-target="#editProfile" data-bs-toggle="modal">Profile</a><a class="dropdown-item" href="../logout.jsp">Logout</a></div>
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
                        <p class="text-center m-0 fw-bold" style="font-size: 32px;text-shadow: 5px 4px 7px rgb(150,129,40);color: rgb(143,60,16);">Modificar Servicio</p>
                    </div>
                    <div class="card-body">
                        <form action="../SvMdfSrv" method="POST">
                            <%
                                Servicio servi = (Servicio) request.getSession().getAttribute("servicio");
                                Long id = servi.getId();
                                Integer cod = servi.getCod_servicio();
                                String nombre = servi.getNombre();
                                String dest = servi.getDestino();
                                String cost = Double.toString(servi.getCosto_servicio());
                                String desc = servi.getDescripcion();
                                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                                sdf.setTimeZone(TimeZone.getTimeZone("America/Argentina"));
                                Date fecha = servi.getFecha_servicio();
                                String fecSrv = "";
                                if (fecha != null) {
                                    fecSrv = sdf.format(servi.getFecha_servicio());
                                }

                            %>
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="form-group mb-3">
                                        <label class="form-label" for="first_name">
                                            <strong>Nombre</strong>
                                        </label>
                                        <input class="form-control" type="text" placeholder="Nombre servicio" name="name_service" value="<%=nombre%>" required>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group mb-3">
                                        <label class="form-label" for="first_name">
                                            <strong>Destino</strong>
                                        </label>
                                        <input class="form-control" type="text" placeholder="Ciudad destino" name="destiny" required value="<%=dest%>">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <div class="form-group mb-3">
                                        <label class="form-label" for="last_name">
                                            <strong>Costo</strong>
                                        </label>
                                        <input class="form-control" type="text" placeholder="$ 00,00" name="price" required value="<%=cost%>">
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-group mb-3">
                                        <label class="form-label" for="date">
                                            <strong>Fecha de Servicio</strong>
                                        </label>
                                        <input class="form-control" type="date" name="date" value="<%=fecSrv%>">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <div class="form-group mb-3">
                                        <label class="form-label" for="description">
                                            <strong>Descripción</strong>
                                        </label>
                                        <input class="form-control" type="text" placeholder="Describa el servicio" name="description" required value="<%=desc%>">
                                    </div>
                                </div>
                            </div>
                            <div class="d-xl-flex justify-content-xl-center form-group mb-3">
                                <input type="hidden" name="id" value="<%=id%>">
                                <button class="btn btn-primary btn-sm" type="submit">Modificar</button>
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
                <li class="list-inline-item"><a href="../index.jsp">Inicio</a></li>
                <li class="list-inline-item"><a href="../Services/services.jsp">Servicios</a></li>
            </ul><!-- End: Links -->
            <!-- Start: Copyright -->
            <p class="copyright">Silicon Misiones&nbsp; © 2021</p><!-- End: Copyright -->
        </footer><!-- End: Footer Basic -->
        <div class="modal fade" role="dialog" tabindex="-1" id="editProfile">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <!-- Start: user settings -->
                    <div class="col-lg-12 col-xl-12 offset-xl-0 d-lg-flex justify-content-lg-center">
                        <div class="card shadow mb-3">
                            <div class="card-header py-3">
                                <p class="text-primary m-0 fw-bold">User Settings</p>
                            </div>
                            <div class="card-body">
                                <form>
                                    <div class="row">
                                        <div class="col-xl-6">
                                            <div class="form-group mb-3"><label class="form-label" for="first_name"><strong>First Name</strong></label><input class="form-control" type="text" placeholder="John" name="first_name"></div>
                                        </div>
                                        <div class="col">
                                            <div class="form-group mb-3"><label class="form-label" for="last_name"><strong>Last Name</strong></label><input class="form-control" type="text" placeholder="Doe" name="last_name"></div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <div class="form-group mb-3"><label class="form-label" for="first_name"><strong>Address</strong></label><input class="form-control" type="text" placeholder="Street and number" name="address"></div>
                                        </div>
                                        <div class="col">
                                            <div class="form-group mb-3"><label class="form-label" for="nationality"><strong>Nationality</strong></label><input class="form-control" type="text" placeholder="Where are you from" name="last_name"></div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <div class="form-group mb-3"><label class="form-label" for="first_name"><strong>Telephone</strong></label><input class="form-control" type="text" placeholder="261555555" name="telephone"></div>
                                        </div>
                                        <div class="col">
                                            <div class="form-group mb-3"><label class="form-label" for="nationality"><strong>Email</strong></label><input class="form-control" type="text" placeholder="mail@mail.com" name="email"></div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col">
                                            <div class="form-group mb-3"><label class="form-label" for="first_name"><strong>New Password</strong><br></label><input class="form-control" type="password"></div>
                                        </div>
                                        <div class="col">
                                            <div class="form-group mb-3"><label class="form-label" for="last_name"><strong>Confirm New Password</strong><br></label><input class="form-control" type="password"></div>
                                        </div>
                                    </div>
                                    <div class="d-xl-flex justify-content-xl-center form-group mb-3"><button class="btn btn-primary btn-sm" type="submit">Save Settings</button></div>
                                </form>
                            </div>
                        </div>
                    </div><!-- End: user settings -->
                </div>
            </div>
        </div>
        <script src="../assets/js/jquery.min.js?h=83e266cb1712b47c265f77a8f9e18451"></script>
        <script src="../assets/bootstrap/js/bootstrap.min.js?h=5488c86a1260428f0c13c0f8fb06bf6a"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="../assets/js/script.min.js?h=99e4877f501cd30e2301247e12adfe46"></script>
    </body>

</html>