<%-- 
    Document   : Grupos
    Created on : 16-abr-2019, 17:17:33
    Author     : david
--%>

<%@page import="Entidades.Ciclo"%>
<%@page import="Entidades.Profesor"%>
<%@page import="Entidades.Curso"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Entidades.Grupo"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.7/dist/css/bootstrap-select.min.css">
        
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap-select@1.13.7/dist/js/bootstrap-select.min.js"></script>
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        
        
        <link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="../test/favicon.ico"/>
        
        
            <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


    <link type="text/css" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css" rel="stylesheet" />
    <script src="~/Scripts/jquery-ui-1.12.1.min.js"></script>
    <script src="~/Scripts/jquery-ui-1.12.1.js"></script>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <link href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" rel="Stylesheet"></>
    <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
    <link href="~/Content/css/style.css" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   
    <script src="~/Content/js/site.js"></script>
    <a ></a>
        <style>
            .col1{
                text-align: center;
                width: 225px
            }
        </style>
        <title>Mantenimiento de Grupos</title>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" style="color:#FFFFFF;">Sistema de Gestion Academica</a>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="Alumnos.jsp">Alumnos <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Profesores.jsp">Profesores</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Carreras.jsp">Carreras</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Cursos.jsp">Cursos</a>
                </li>
                <li class="nav-item ">
                    <a class="nav-link" href="Ciclos.jsp">Ciclos</a>
                </li>
                <li class="nav-item active">
                        <a class="nav-link" href="Grupos.jsp">Grupos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ofertaAcademica.jsp">Oferta Académica</a>
                </li>
                <li class="mav-item">
                    <a class="nav-link bordered" href="index.html" style="
                       margin-left: 430px;">Principal</a>
                </li>


            </ul>
        </div>
    </nav>
    </head>
    <body>
        <jsp:useBean id="cn" class="Controller.Grupos" scope="page"></jsp:useBean>
        <%
          ArrayList<Curso> cursos;
          cursos = (ArrayList<Curso>) cn.listarCursos();
          
          ArrayList<Profesor> profesores;
          profesores = (ArrayList<Profesor>) cn.listarProfesores();
        %>

    <div class="container">
        <div class="text-center">
            <h1>Mantenimiento Grupos</h1>
        </div>
                <div class="row">
            <div class="col-6">
                <form style="margin-left:25px" class="form-inline my-2 my-lg-0" action="Grupos" method="POST">
                    <br>
                        <br>
                            <select class="selectpicker" title="Seleccione una opción." name="options">
                                <option value="codigo">Código del Grupo</option>
                                <option value="curso">Curso</option>
                                <option value="profesor">Profesor</option>
                                <option value="horario">Horario</option>
                            </select>
                        <br>
                    <br>
                    <input class="form-control mr-sm-2" type="search" name="idBusqueda" placeholder="Buscar" aria-label="Search" autocomplete="off">
                    <button class="btn btn-outline-success my-2 my-sm-0" style="border: none; background-color: #e7e7e7; color: black;" value="buscar" name="action" type="submit">Buscar</button>
                </form>
            </div>
        </div>
        <div class="row">  
            <div class="col">
                <br>
                <table class="table table-striped table-hover table-condensed">
                    <thead class="thead-light">
                        <tr>
                            <tr>
                                <td>Código del Grupo</td>
                                <td>Curso</td>
                                <td>Profesor</td>
                                <td>Horario</td>
                            </tr>
                        </tr>
                    </thead>
                    <% 
                        if (request.getAttribute("grupoListar") != null) {
                        
                        List<Grupo> grupoLista = (List<Grupo>) request.getAttribute("grupoListar");
                        
                    %>
                    <tbody>
                         <tbody>
                            <tr>
                                <%
                                    for(Grupo gru: grupoLista){
                                %>
                                <td id='grupoCodigo'>
                                    <%
                                        out.println(gru.getCodigo());
                                    %>
                                </td>
                                <td id='grupoCurso'>
                                    <%
                                        out.println(gru.getCurso().getNombre());
                                    %>
                                </td>
                                <td id='grupoProfesor'>
                                    <%
                                        out.println(gru.getProfesor().getNombre());
                                    %>
                                </td>
                                <td id='grupoHorario'>
                                    <%
                                        out.println(gru.getHorario());
                                    %>
                                </td>
                           
                            <td> 
                                <form action="Grupos" method="POST">
                                    <input hidden="true"  value="<% out.println(gru.getCodigo());%>" id="deleteValue" name="codigo" type="text"/>
                                    <button class="btn btn-danger" id="btneliminar"type="button" onclick="clickDeleteButton('<%=gru.getCodigo()%>')">Eliminar</button>
                                    <input hidden="true"  value="<%out.println(gru.getCodigo());%>" name="codigo" type="text" />
                                    <button class="btn btn-info" value="editar" name="action" style="background-color: #555555; border:none"type="submit" data-toggle="model" data-target="#mEditar">Editar</button>
                                </form>
                            </td>

                        </tr>
                    </tbody>
                    <% 
                            }
                        }
                    %>
                </table>


                <br>
                <br> 
                <button type="button" class="btn btn-info btn-lg"  style="border: none; background-color: #e7e7e7; color: black;" data-toggle="modal" data-target="#mIngresar">Ingresar </button>
            </div>
        </div>
        <div class="text-center" style="display:none;">
            <button id="failedButton" href="#failedModal" class="trigger-btn" data-toggle="modal">FailedModal</button>
            <button id="deleteButton" href="#deleteModal" class="trigger-btn" data-toggle="modal">DeleteModal</button>
            <button id="successButton" href="#succesModal" class="trigger-btn" data-toggle="modal">SuccessModal</button>
            <button id="editButton" href="#mEditar" class="trigger-btn" data-toggle="modal">EditarModal</button>
        </div>
        <br>   
        <!--Modal Ingresar -->
        <div id="mIngresar" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4>Agregar Curso</h4>
                    </div>
                    <div class="modal-body">
                            <form action="Grupos" method="POST">
                                <div class="form-group row">
                                    <label class="col-sm-2 col-form-label">Código</label>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="text" placeholder="Código del Grupo"
                                               name="codigo" required="true" autocomplete="off"
                                               oninvalid="this.setCustomValidity('El grupo es necesario.')" oninput="setCustomValidity('')">
                                    </div>
                                </div>

                            <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Curso:</label>
                            <div class="col-sm-10">
                                <select name="curso">
                                    <% for (Curso c : cursos) {%>
                                    <option value="<%= c.getCodigo()%>"> <%= c.getNombre()%></option>
                                    <% ;
                                    }%>
                                </select>
                                </div>
                             </div>
                                
                            <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Profesor</label>
                            <div class="col-sm-10">
                                <select name="profesor">
                                    <% for (Profesor p : profesores  ) {%>
                                    <option value="<%= p.getCedula()%>"> <%= p.getNombre()%></option>
                                    <% ;
                                    }%>
                                </select>
                                </div>
                             </div>                               
                            
                                <div class="form-group row">
                                    <label class="col-sm-2 col-form-label">Horario</label>
                                    <div class="col-sm-10">
                                        <input class="form-control" type="text" required="true" autocomplete="off"
                                               name="horario" placeholder="Horario del Grupo"
                                               oninvalid="this.setCustomValidity('El horario es necesario.')" oninput="setCustomValidity('')">
                                    </div>
                                </div>
                        </div>
                    <div class="modal-footer">
                        <button class="btn btn-primary" value="crear"  style="border: none; background-color: #e7e7e7; color: black;"name="action" type="submit">Ingresar</button>
                        </form>
                        <button class="btn btn-danger" data-dismiss="modal" type="button" >Cerrar</button>
                    </div>
                </div>
            </div>
  
        </div>  
        <!-- Modal success -->
        <div id="succesModal" class="modal fade">
                <div class="modal-dialog modal-confirm">
                        <div class="modal-content">
                                <div class="modal-header">
                                        <div class="icon-box">
                                        </div>
                                         <h4 class="modal-title">¡Bien hecho!</h4>
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>  
                                </div>
                                <div class="modal-body text-center">
                                        <p id="labelSuccess"><big>El Grupo<strong id="codigoCurso">DEFAULT</strong> ha sido agregado con exito.</big></p>
                                </div>
                                <div class="modal-footer">
                                        <button class="btn btn-success" data-dismiss="modal"><span>Continuar</span> </button>
                                </div>
                        </div>
                </div>
        </div>   
        <!-- Modal failed -->
        <div id="failedModal" class="modal fade">
                <div class="modal-dialog modal-confirm">
                        <div class="modal-content">
                                <div class="modal-header">
                                        <div class="icon-box">
                                        </div>
                                        <h4 class="modal-title">¡Oops!</h4>
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                </div>
                                <div class="modal-body text-center">	
                                        <p id="labelFailed"><big>Ha ocurrido un <strong>error.</strong> Intentelo de nuevo.</big></p>

                                </div>
                                <div class="modal-footer">
                                        <button class="btn btn-success" data-dismiss="modal"><span>Continuar</span> </button>
                                </div>
                        </div>
                </div>
        </div>

        <!-- Modal delete -->
        <div id="deleteModal" class="modal fade">
                <div class="modal-dialog modal-confirm">
                        <div class="modal-content">
                                <div class="modal-header">
                                        <div class="icon-box">
                                        </div>				
                                        <h4 class="modal-title">¿Esta seguro?</h4>	
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                </div>
                                <div class="modal-body">
                                    <p><big>¿Desea eliminar a <strong id='grupoCod'></strong>?</big></p>
                                </div>
                                <div class="modal-footer">
                                    <form action="Grupos" method="POST">
                                        <input hidden="true" id="valueDelete" name="codigo" type="text"/>
                                        <button type="button" class="btn btn-info" data-dismiss="modal">Cancelar</button>
                                        <button type="submit" class="btn btn-danger" value="eliminar" name="action">Eliminar</button>
                                    </form>
                                </div>
                        </div>
                </div>
        </div>
        <!-- Modal editar -->
        <div id="mEditar" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Editar Grupo</h4>
                    </div>
                    <%   
                        if (request.getAttribute("grupoEditar") != null) 
                        {
                            Grupo g = (Grupo)request.getAttribute("grupoEditar");
                    %>
                    <div class="modal-body">
                        <form action="Grupos" method="POST">
                             <div class="form-group row">
                                <label  class="col-sm-2 col-form-label">Codigo</label>
                                <div class="col-sm-10">
                                  <input readonly class="form-control" type="text" value="<% out.println(g.getCodigo()); %>" name="codigo" placeholder="Codigo del curso" 
                                         required="true"autocomplete="off"
                                         oninvalid="this.setCustomValidity('El codigo es necesario.')" oninput="setCustomValidity('')">
                                </div>
                              </div>
                                         
                            <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Curso:</label>
                            <div class="col-sm-10">
                                <select name="curso">
                                    <% for (Curso cu : cursos) {%>
                                    <option value="<%= cu.getCodigo()%>"> <%= cu.getNombre()%></option>
                                    <% ;
                                    }%>
                                </select>
                                </div>
                             </div>
                                
                            <div class="form-group row">
                            <label class="col-sm-2 col-form-label">Profesor:</label>
                            <div class="col-sm-10">
                                <select name="profesor">
                                    <% for (Profesor pr : profesores  ) {%>
                                    <option value="<%= pr.getCedula()%>"> <%= pr.getNombre()%></option>
                                    <% ;
                                    }%>
                                </select>
                                </div>
                             </div>                                
                                                                 
                            <div class="form-group row">
                                <label  class="col-sm-2 col-form-label">Horario:</label>
                                <div class="col-sm-10">
                                  <input class="form-control" type="text" value="<% out.println(g.getHorario()); %>" name="horario" placeholder="Horario del grupo" 
                                         required="true"autocomplete="off"
                                         oninvalid="this.setCustomValidity('El horario es necesario.')" oninput="setCustomValidity('')">
                                </div>
                            </div>                                    
                            
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-primary" value="editar" name="action" style="border: none; background-color: #e7e7e7; color: black;" type="submit">Editar</button>
                        </form>
                        <button class="btn btn-danger" data-dismiss="modal" type="button" >Cerrar</button>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
                
        <%  
            if (request.getAttribute("grupoEditar") != null)
            {
        %>
        <script> 
                $("#editButton").click();
        </script>
        <%
                
            }
            String result = "default";
            if (request.getAttribute("result") != null)
            { 
                result = (String)request.getAttribute("result");
                if(result == "ExitoCrear"){
                    String variable = ((String)request.getAttribute("value")).replace("\n", "");
                    
        %>
         <script> 
                        
                    var codigo = "Curso <strong>"+"<%=variable%>"+"</strong> creado con exito.";
                    $('#labelSuccess').text("");
                    $('#labelSuccess').append(codigo);
                    $("#successButton").click();
        </script>
        <%
                }
                else if(result == "ErrorCrear"){
                    String variable = "Error al crear el Grupo"; 
%>
        <script> 
                    var Codigo = "<%=variable%>";
                    $('#labelFailed').text("");
                    $('#labelFailed').append(Codigo);           
                    $("#failedButton").click();
        </script>
<%
                }
                else if(result == "ExitoEliminar"){
                    String variable = "Exito al eliminar el curso"; 
%>
 <script> 
                    var codigoGrupo = "<%=variable%>";
                    $('#labelSuccess').text(codigoGrupo);
                    $("#successButton").click();
</script>
<%
                }
                else if(result == "ErrorEliminar"){
                    String variable = "Error al elimnar el curso"; 
%>
 <script> 
                    var codigoGrupo = "<%=variable%>";
                    $('#labelFailed').text("");
                    $('#labelFailed').append(codigoGrupo);           
                    $("#failedButton").click();
</script>
<%
                }
                else if(result == "ExitoEditar"){
                    String variable = ((String)request.getAttribute("value")).replace("\n", "");
%>
 <script> 
                    var codigoGrupo = "Curso <strong>"+"<%=variable%>"+"</strong> editado con exito.";
                    $('#labelSuccess').text("");
                    $('#labelSuccess').append(codigoGrupo);           
                    $("#successButton").click();
</script>
<%
                }
                else if(result == "ErrorEditar"){
                    String variable = "Error al editar el curso"; 
%>
 <script> 
                    var codigoGrupo = "<%=variable%>";
                    $('#labelFailed').text("");
                    $('#labelFailed').append(codigoGrupo);           
                    $("#failedButton").click();
</script>
<%
                }
                else{
                }
            }
%>

    </div>
    </body>
</html>
<script>
    function clickDeleteButton(codigo){
        document.getElementById('valueDelete').value = codigo;
        $('#grupoCod').text(codigo);
        $('#deleteButton').click();
    }
</script>