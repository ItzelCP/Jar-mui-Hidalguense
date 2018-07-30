<%-- 
    Document   : artesanos
    Created on : 27-jul-2018, 17:51:44
    Author     : Evelin
--%>

<%@page import="model.Categorias"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Artesanos" %>
<!DOCTYPE html>
<html lang="es" dir="ltr">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Jar'mui Hidalguense</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/style.css">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="index.jsp">Jar´mui</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="catalogo.html">Catalogo</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="registrate.html">Registrate</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Mas
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="nuestro.html">Nuestro equipo</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="jarmui.html">Jar´mui K´oi</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="conocenos.html">Conocenos</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="artesanos.html">Artesanos</a>
                        </li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                    </form>
                </div>
            </nav>
        </header>

        <section class="artesanos-desc">
            <div class="container artesano" >
                <br><br>
                <br>
                <br>
                <center><h2>ARTESANOS</h2></center>
                <br><br>
                <c:forEach items="${artesanos}" var="artesano" >
                    <div class="row">
                        <div class="col-12 col-md-6 lg-6">
                            <div class="card" style="width: 25rem;">
                                <img class="card-img-top" src="${artesano.getImagen()}" alt="ar">
                                <div class="card-body">
                                    <p class="card-text">${artesano.getNombre()}</p>
                                    <p class="card-text">${artesano.getApellido()}</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-md-6 lg-6">
                            <div class="card" style="width: 25rem;">
                                <h5 class="card-header">${artesano.getRegion()}</h5>
                                <div class="card-body">
                                    <h5 class="card-title"></h5>
                                    <p class="card-text">${artesano.getHistoria()}</p>
                                    <a href="#" class="btn btn-primary">ver más</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <br>
                    <br>
                </c:forEach>
                <br>


            </div>
        </section>

    </body>
</html>
