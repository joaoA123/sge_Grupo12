<%-- 
    Document   : principal
    Created on : 12/dez/2019, 8:32:58
    Author     : Luis Silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">


<!-- Mirrored from demo.riktheme.com/zinox/side-menu-full-2/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 03 Sep 2019 11:56:51 GMT -->
<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>SEC</title>

    <!-- Favicon -->
    <link rel="icon" href="assets/img/core-img/favicon.png">

    <!-- These plugins only need for the run this page -->
    <link rel="stylesheet" href="assets/css/default-assets/datatables.bootstrap4.css">
    <link rel="stylesheet" href="assets/css/default-assets/responsive.bootstrap4.css">

    <!-- Master Stylesheet [If you remove this CSS file, your file will be broken undoubtedly.] -->
    <link rel="stylesheet" href="assets/style.css">

</head>

<body>
    <!-- Preloader -->
    <div id="droba-loader">
        <div class="loader"></div>
    </div>
      <div class="ecaps-page-wrapper">
        <!-- Sidemenu Area -->
        <div class="ecaps-sidemenu-area">
            <!-- Desktop Logo -->
            <div class="ecaps-logo">
                <a href="index.html"><img class="desktop-logo" src="assets/img/core-img/logo.png" alt="Desktop Logo"> <img class="small-logo" src="http://localhost/RedeSocial/public/img/core-img/small-logo.png" alt="Mobile Logo"></a>
            </div>

            <!-- Side Nav -->
            <div class="ecaps-sidenav" id="ecapsSideNav">
                <!-- Side Menu Area -->
                <div class="side-menu-area">
                    <!-- Sidebar Menu -->
                    <nav>
                        <ul class="sidebar-menu" data-widget="tree">
                            <li class="active"><a href="Controller?action=principal"><i class="icon_lifesaver"></i> <span>Pagina Inicial</span></a></li>
                                <li><a href="Controller?action=add_criminoso"><i class="zmdi zmdi-account-add"></i> Cadastrar Criminoso</a></li>
                                    <li><a href="Controller?action=listar_criminoso"><i class="zmdi zmdi-accounts-alt"></i>Visualizar Criminoso</a></li>
                                    
                               
                            
                     
                                
                                    <li><a href="Controller?action=add_vitima"><i class="zmdi zmdi-account-add"></i>Cadastrar Vitima</a></li>
                                    <li><a href="Controller?action=listar_vitima"><i class="zmdi zmdi-accounts-alt"></i>Visualizar Vitima</a></li>
                                    
                              
                            

                            <li><a href="Controller?action=add_crime"><i class="zmdi zmdi-account-add"></i> <span>Cadastrar Crime</span></a></li>
                            

                        </ul>
                    </nav>
                </div>
            </div>
        </div>

        <!-- Page Content -->
        <div class="ecaps-page-content">
            <!-- Top Header Area -->
            <header class="top-header-area d-flex align-items-center justify-content-between">
                <div class="left-side-content-area d-flex align-items-center">
                    <!-- Mobile Logo -->
                    <div class="mobile-logo mr-3 mr-sm-4">
                        <a href="index.html"><img src="img/core-img/small-logo.png" alt="Mobile Logo"></a>
                    </div>

                    <!-- Triggers -->
                    <div class="ecaps-triggers mr-1 mr-sm-3">
                        <div class="menu-collasped" id="menuCollasped">
                            <i class="zmdi zmdi-menu"></i>
                        </div>
                        <div class="mobile-menu-open" id="mobileMenuOpen">
                            <i class="zmdi zmdi-menu"></i>
                        </div>
                    </div>

                    <!-- Left Side Nav -->
                    
                </div>

                <div class="right-side-navbar d-flex align-items-center justify-content-end">
                    <!-- Mobile Trigger -->
                   

                    <!-- Top Bar Nav -->
                    <ul class="right-side-content d-flex align-items-center">
                        <li class="hide-phone app-search mr-15">
                            <a href="" type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Cadastrar Policial</a>
                        </li>
                        <li class="hide-phone app-search mr-15"  >
                            <a href="" type="button" class="btn btn-primary">Logout</a>
                        </li>
                        
                    </ul>
                </div>
            </header>
            <div class="main-content">
                <div class="container-fluid">

             <div class="row">
                        <div class="col-sm-6 col-xl-3">
                            <div class="widget-slider-area primary-color mb-30 p-3">
                                <div class="widget-slides owl-carousel">
                                    <!-- Single Slider -->
                                    <div class="widget-slider-content">
                                        <div class="d-flex justify-content-between align-items-center mb-15">
                                            <h6 class="mb-0 text-white">Numeros de Criminosos</h6>
                                            <span class="badge badge-pill badge-primary">79% Done</span>
                                        </div>
                                        <h6 class="text-white mb-0">$79,639.69 <span>(+6.71)</span></h6>
                                        <p class="text-white mb-0">by last month</p>
                                    </div>

                                   

                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-xl-3">
                            <div class="widget-slider-area primary-color mb-30 p-3">
                                <div class="widget-slides owl-carousel">
                                    <!-- Single Slider -->
                                    <div class="widget-slider-content">
                                        <div class="d-flex justify-content-between align-items-center mb-15">
                                            <h6 class="mb-0 text-white">Numeros de Vitima</h6>
                                            <span class="badge badge-pill badge-primary">79% Done</span>
                                        </div>
                                        <h6 class="text-white mb-0">$79,639.69 <span>(+6.71)</span></h6>
                                        <p class="text-white mb-0">by last month</p>
                                    </div>

                                   

                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-xl-3">
                            <div class="widget-slider-area primary-color mb-30 p-3">
                                <div class="widget-slides owl-carousel">
                                    <!-- Single Slider -->
                                    <div class="widget-slider-content">
                                        <div class="d-flex justify-content-between align-items-center mb-15">
                                            <h6 class="mb-0 text-white">Numero de Crimes</h6>
                                            <span class="badge badge-pill badge-primary">79% Done</span>
                                        </div>
                                        <h6 class="text-white mb-0">$79,639.69 <span>(+6.71)</span></h6>
                                        <p class="text-white mb-0">by last month</p>
                                    </div>

                                   

                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-xl-3">
                            <div class="widget-slider-area primary-color mb-30 p-3">
                                <div class="widget-slides owl-carousel">
                                    <!-- Single Slider -->
                                    <div class="widget-slider-content">
                                        <div class="d-flex justify-content-between align-items-center mb-15">
                                            <h6 class="mb-0 text-white">Mortos</h6>
                                            <span class="badge badge-pill badge-primary">79% Done</span>
                                        </div>
                                        <h6 class="text-white mb-0">$79,639.69 <span>(+6.71)</span></h6>
                                        <p class="text-white mb-0">by last month</p>
                                    </div>

                                   

                                </div>
                            </div>
                        </div>

                        
                           
                        

                       
                    </div>

                     <div class="row justify-content-center">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title mb-2">Tabela Padrão Para Mostrar Dado</h4>
                                    <p class="text-muted font-14 mb-4">
                                        Lista de Todos os Utilizadores do meu Sistema
                                    </p>

                                    <div class="table-responsive">
                                        <table class="table mb-0">
                                            <thead>
                                                <tr>
                                                    <th scope="col">#</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                    <th scope="col">Heading</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="row">1</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">2</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">3</th>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                    <td>Cell</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div> <!-- end table-responsive-->

                                </div> <!-- end card body-->
                            </div> <!-- end card -->
                        </div>
                    </div>
                    

                </div>
            </div>
            <footer class="footer-area d-flex align-items-center flex-wrap">
                    <!-- Copywrite Text -->
                    <div class="copywrite-text">
                        <p>Sistema de Gestão na Cloud</a></p>
                    </div>
                    <!-- Footer Nav -->
                   
                </footer>
</div>
</div>
 <!-- Must needed plugins to the run this Template -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/bundle.js"></script>

    <!-- Active JS -->
    <script src="assets/js/default-assets/active.js"></script>

    <!-- These plugins only need for the run this page -->
    <script src="assets/js/default-assets/particles.js"></script>
    <script src="assets/js/default-assets/app.js"></script>
     <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/bundle.js"></script>

    <!-- Active JS -->
    <script src="assets/js/default-assets/active.js"></script>

    <!-- These plugins only need for the run this page -->
    <script src="assets/js/default-assets/jquery.datatables.min.js"></script>
    <script src="assets/js/default-assets/datatables.bootstrap4.js"></script>
    <script src="assets/js/default-assets/datatable-responsive.min.js"></script>
    <script src="assets/js/default-assets/responsive.bootstrap4.min.js"></script>
    <script src="assets/js/default-assets/datatable-button.min.js"></script>
    <script src="assets/js/default-assets/button.bootstrap4.min.js"></script>
    <script src="assets/js/default-assets/button.html5.min.js"></script>
    <script src="assets/js/default-assets/button.flash.min.js"></script>
    <script src="assets/js/default-assets/button.print.min.js"></script>
    <script src="assets/js/default-assets/datatables.keytable.min.js"></script>
    <script src="assets/js/default-assets/datatables.select.min.js"></script>
    <script src="assets/js/default-assets/demo.datatable-init.js"></script>
</body>
</html>
<div class="modal inmodal" id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content animated bounceInRight">
                                                    <div class="modal-header">
                                                        <h4 class="modal-title d-block">Cadstaro Policial</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        
                                   <form class="forms-sample" method="post" action="Controller">
                                        <div class="form-group">
                                            <label for="exampleInputName1">Nome</label>
                                            <input type="text" class="form-control" name="nome" id="exampleInputName1" placeholder="Nome Completo">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputEmail3">Data Nascimento</label>
                                            <input type="date" class="form-control" name="data" id="exampleInputEmail3" placeholder="Email">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleSelectGender">Genero</label>
                                            <select class="form-control" name="genero" id="exampleSelectGender">
                                                <option value="Masculino">Masculino</option>
                                                <option value="Femenino">Femenino</option>
                                            </select>
                                        </div>
                                         <div class="form-group">
                                            <label for="exampleInputName1">Numero do Bilhete</label>
                                            <input type="text" class="form-control" name="bi" id="exampleInputName1" placeholder="Numero Bilhete">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputName1">Email </label>
                                            <input type="email" class="form-control" name="email" id="exampleInputName1" placeholder="Email">
                                        </div>
                                         <div class="form-group">
                                            <label for="exampleInputName1">Senha </label>
                                            <input type="password" class="form-control" name="senha" id="exampleInputName1" placeholder="Senha">
                                        </div>
                                           <div class="form-group">
                                            <label>Foto</label>
                                            <input type="file" name="img[]" class="file-upload-default">
                                            <div class="input-group col-xs-12">
                                                <input type="file" class="form-control file-upload-info"  placeholder="Upload Image">
                                                <span class="input-group-append">
                                                    <button class="file-upload-browse btn btn-primary" type="button">Upload</button>
                                                </span>
                                            </div>
                                            
                                        </div>
                                                        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                                        <button type="submit" class="btn btn-primary" action="action" value="cadastrar_policial">Salvar Dados</button>
                                                   
                                                    </form>
                                                   
                                        </div>
                                    
                                       
                                       
                                            
                                                   
                                                   
                                                         </div>
                                                </div>
                                            </div>
                                        </div>
