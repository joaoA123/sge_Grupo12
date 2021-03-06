<%--
    Document   : listar
    Created on : 05/01/2019, 19:32:43
    Author     : USER
--%>


<%@page import="Model.Arquivos"%>
<%@page import="java.util.Iterator"%>
<%@page import="Model.Propietario"%>
<%@page import="java.util.List"%>
<%@page import="ModelDAO.ArquivoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>



    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Meus Arquivos</title>
        <!-- Bootstrap core CSS-->
        <link href='assets/vendor/bootstrap/css/bootstrap.min.css' rel="stylesheet">
        <link href='assets/sweetalert2.css' rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href='assets/vendor/font-awesome/css/font-awesome.min.css' rel="stylesheet" type="text/css">
        <!-- Page level plugin CSS-->
        <link href='assets/vendor/datatables/dataTables.bootstrap4.css' rel="stylesheet">
        <!-- Custom styles for this template-->
        <link href='assets/css/sb-admin.css' rel="stylesheet">
        <link rel="stylesheet" type="text/css" media="screen" href="../assets/table/">
        <link rel="stylesheet" type="text/css" href="../assets/Data/datatables.min.css">
        <link rel="stylesheet" type="text/css" href="../assets/Data/datatables.css">
    </head>

    <!-- MENU -->
    <body class="fixed-nav sticky-footer bg-dark" id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
            <a class="navbar-brand" href="index.html">Gestão de Conteudos v 3.0.1</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
                    <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
                        <a class="nav-link" href="#">
                            <i class="fa fa-fw fa-dashboard"></i>
                            <span class="nav-link-text">Ambiente</span>
                        </a>

                    <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                        <a class="nav-link nav-link-collapse collapsed" href="r" data-parent="#exampleAccordion">
                            <i class="fa fa-fw fa-wrench"></i>
                            <span class="nav-link-text">Arquivos</span>
                        </a>
                        <ul class="sidenav-second-level collapse" id="collapseComponents">


                    </li>
                </ul>
                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                    <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents3" data-parent="#exampleAccordion">
                        <i class="fa fa-fw fa-wrench"></i>
                        <span class="nav-link-text">Configurações</span>
                    </a>
                    <ul class="sidenav-third-level collapse" id="collapseComponents3">
                        <li>
                            <a href="actualizarAlsimples.php?id=<?php echo $_GET['id'] ;?>">Perfil</a>
                        </li>
                        <li>
                            <a href="actualizarAlagregado.php?id=<?php echo $_GET['id'] ;?>">Exibição</a>
                        </li>

                    </ul>
                </li>

                </li>
                <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                    <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents4" data-parent="#exampleAccordion">
                        <i class="fa fa-fw fa-wrench"></i>
                        <span class="nav-link-text">Gerenciar Pratos</span>
                    </a>
                    <ul class="sidenav-third-level collapse" id="collapseComponents4">

                        <li>
                            <a href="ActualizarPragregado.php?id=<?php echo $_GET['id'] ;?>">Pratos Composto</a>
                        </li>

                    </ul>
                </li>

                </li>




                </ul>
                <ul class="navbar-nav sidenav-toggler">
                    <li class="nav-item">
                        <a class="nav-link text-center" id="sidenavToggler">
                            <i class="fa fa-fw fa-angle-left"></i>
                        </a>
                    </li>
                </ul>
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle mr-lg-2" id="messagesDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fa fa-fw fa-envelope"></i>
                            <span class="d-lg-none">Messages
                                <span class="badge badge-pill badge-primary">12 New</span>
                            </span>
                            <span class="indicator text-primary d-none d-lg-block">
                                <i class="fa fa-fw fa-circle"></i>
                            </span>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="messagesDropdown">
                            <h6 class="dropdown-header">New Messages:</h6>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">
                                <strong>David Miller</strong>
                                <span class="small float-right text-muted">11:21 AM</span>
                                <div class="dropdown-message small">Hey there! This new version of SB Admin is pretty awesome! These messages clip off when they reach the end of the box so they don't overflow over to the sides!</div>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">
                                <strong>Jane Smith</strong>
                                <span class="small float-right text-muted">11:21 AM</span>
                                <div class="dropdown-message small">I was wondering if you could meet for an appointment at 3:00 instead of 4:00. Thanks!</div>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">
                                <strong>John Doe</strong>
                                <span class="small float-right text-muted">11:21 AM</span>
                                <div class="dropdown-message small">I've sent the final files over to you for review. When you're able to sign off of them let me know and we can discuss distribution.</div>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item small" href="#">View all messages</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fa fa-fw fa-bell"></i>
                            <span class="d-lg-none">Alerts
                                <span class="badge badge-pill badge-warning">6 New</span>
                            </span>
                            <span class="indicator text-warning d-none d-lg-block">
                                <i class="fa fa-fw fa-circle"></i>
                            </span>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="alertsDropdown">
                            <h6 class="dropdown-header">New Alerts:</h6>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">
                                <span class="text-success">
                                    <strong>
                                        <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
                                </span>
                                <span class="small float-right text-muted">11:21 AM</span>
                                <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">
                                <span class="text-danger">
                                    <strong>
                                        <i class="fa fa-long-arrow-down fa-fw"></i>Status Update</strong>
                                </span>
                                <span class="small float-right text-muted">11:21 AM</span>
                                <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">
                                <span class="text-success">
                                    <strong>
                                        <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
                                </span>
                                <span class="small float-right text-muted">11:21 AM</span>
                                <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item small" href="#">View all alerts</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <form class="form-inline my-2 my-lg-0 mr-lg-2">
                            <div class="input-group">
                                <input class="form-control" type="text" placeholder="Procurar por">
                                <span class="input-group-append">
                                    <button class="btn btn-primary" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                            </div>
                        </form>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="modal" href="<?php session_destroy(); header('location: ../index.php');?>" data-target="#exampleModal">
                            <i class="fa fa-fw fa-sign-out" href="df"></i>Sair</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Deseja Sair?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Clique em Sair se pretende Fechar essa Sessão.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancelar</button>
                        <a class="btn btn-primary" href="../index.php">Sair</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="content-wrapper">
            <div class="container-fluid">
                <!-- Breadcrumbs-->
                <ol class="breadcrumb">
                    <li class="breadcrumb-item">
                        <a href="#">Ambiente de Trabalho</a>
                    </li>
                    <li class="breadcrumb-item active">ETAPA 1</li>
                </ol>




          

















            
                

                <%
                     int id=Integer.parseInt((String)request.getAttribute("idprop"));
                %>
                        <a class="btn btn-success" href="Controller?action=add&id=<%=id%>">Adicionar Um Arquivo</a>

                        <table class="table table-bordered table-responsive">
                            <thead>
                                <tr>
                                    <th class="text-center">ID</th>
                                    <th class="text-center">NOME</th>
                                    <th class="text-center">PRECO</th>
                                    <th class="text-center">TIPO</th>
                                    <!--<th class="text-center">DATA DE UPLOAD</th>-->
                                    <th class="text-center">ID ARQUIVO</th>
                                    <th class="text-center">ACCAO</th>
                                </tr>
                            </thead>
                            <%
                                ArquivoDAO dao = new ArquivoDAO();
                                List<Arquivos> list = dao.listar(id);
                                Iterator<Arquivos> iter = list.iterator();
                                Arquivos arq = null;
                                while (iter.hasNext()) {
                                    arq = iter.next();

                            %>
                            <tbody>
                                <tr>
                                    <td class="text-center"><%= arq.getId()%></td>
                                    <td class="text-center"><%= arq.getNome()%></td>
                                    <td class="text-center"><%= arq.getPreco()%></td>
                                    <td class="text-center"><%= arq.getTipo()%></td>
                                   <!-- <td class="text-center"><%= arq.getData()%></td>-->
                                    <td class="text-center"><%= arq.getId_arq()%></td>
                          
                                    <td class="text-center">
                                        <a class="btn btn-success" href="ControllerDownload?id=<%= arq.getId()%>&idprop=<%=id%>">Baixar</a>
                                        <a class="btn btn-warning" href="Controller?action=editar&id=<%= arq.getId()%>&idprop=<%=id%>">Editar</a>
                                        <a class="btn btn-danger" href="Controller?action=apagar&id=<%= arq.getId()%>&idprop=<%=id%>">Remover</a>
                                    </td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
  </div>
                    </div>
                </div>
                    </body>
                    </html>
