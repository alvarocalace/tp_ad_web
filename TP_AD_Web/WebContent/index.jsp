<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/materialize.min.css">

<link type="text/css" rel="stylesheet" href="css/styles.css">


<title>Insert title here</title>


</head>
<body>
	<div>
		<nav style="background-color: #7374C2;">
			<ul id="slide-out" class="side-nav">
				<li><a class="menu-anchor" href="AltaClienteParticular">Inicio</a></li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Clientes<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a class="menu-anchor"
										id="jsp/Clientes/AltaClienteParticular" href="#!">Alta
											Particular</a></li>
									<li><a class="menu-anchor"
										id="jsp/Clientes/AltaClienteEmpresa" href="#!">Alta
											Empresa</a></li>
									<li><a class="menu-anchor" href="#!">Baja</a></li>
									<li><a class="menu-anchor" href="#!">Modificacion</a></li>
									<li><a class="menu-anchor" href="#!">Listar</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Empleados<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a href="#!">Alta</a></li>
									<li><a href="#!">Baja</a></li>
									<li><a href="#!">Listar</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Sucursales<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a href="#!">Alta</a></li>
									<li><a href="#!">Listar</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Productos<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a href="#!">Alta</a></li>
									<li><a href="#!">Listar</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Sucursales<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a href="#!">Alta</a></li>
									<li><a href="#!">Listar</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Vehiculos<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a href="#!">Alta</a></li>
									<li><a href="#!">Baja</a></li>
									<li><a href="#!">Listar Vehiculos Locales</a></li>
									<li><a href="#!">Listar Vehiculos EXternos</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Cargas<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a href="#!">Alta</a></li>
									<li><a href="#!">Baja</a></li>
									<li><a href="#!">Listar</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
				<li class="no-padding">
					<ul class="collapsible collapsible-accordion">
						<li><a class="collapsible-header">Viajes<i
								class="mdi-navigation-arrow-drop-down"></i></a>
							<div class="collapsible-body">
								<ul>
									<li><a href="#!">Alta</a></li>
									<li><a href="#!">Baja</a></li>
									<li><a href="#!">Listar</a></li>
								</ul>
							</div></li>
					</ul>
				</li>
			</ul>
			<a href="#" data-activates="slide-out" class="button-collapse"
				style="display: inline;"><i class="mdi-navigation-menu"></i></a>
		</nav>
	</div>

	<div id="content" class=""></div>


	<!-- SCRIPTS -->

	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.96.1/js/materialize.min.js"></script>

	<script type="text/javascript">
		$(".button-collapse").sideNav();

		$('.menu-anchor').click(function(event) {
			event.preventDefault();
			$('#content').load($(this).attr('id') + '.jsp');
			$('.button-collapse').sideNav('hide');
		});

		$(document).ready(function() {
			$('a').addClass('waves-effect waves-teal');
		});
	</script>

</body>


</html>
