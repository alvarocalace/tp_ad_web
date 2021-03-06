<%@page import="impl.cargas.TipoCarga"%>
<%@page import="impl.personal.TipoPuesto"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Alta Carga</title>
</head>
<body>

	<div id="test1" class="col s12" style="padding-bottom: 350px;">

		<form id="altaCarga" class="box-padding" class="form-control">

			<div class="input-field col s12">
				<select name="tipoCarga">
					<option value="" disabled selected></option>
					<%
						for (TipoCarga t : TipoCarga.values()) {
					%>
					<option value="<%=t.getTipo()%>"><%=t.getTipo()%></option>
					<%
						}
					%>
				</select> <label>Tipo de Carga</label>
			</div>

			<div class="input-field col s12">
				<input type="number" class="validate" name="cuit"> <label
					for="email">ID Cliente</label>
			</div>
			<div style="padding-top: 20px; padding-bottom: 20px;">
				<p>
					<input name="local" type="checkbox" id="test6" checked="checked" />
					<label for="test6">Envío dentro del país</label>
				</p>
			</div>

		</form>

	</div>


	<script>
		$(document).ready(function() {
			$('select').material_select();
		});

		$('.datepicker').pickadate({
			selectMonths : true, // Creates a dropdown to control month
			selectYears : 15
		// Creates a dropdown of 15 years to control year
		});

		$('input[name="cuit"]').keyup(function() {
			$('input').removeAttr('disabled', 'disabled');
			$.ajax({
				url: 'ObtenerProductosEmpresa',
				type: 'GET',
				data: {
					idEmpresa: $('input[name="cuit"]').val().trim()
				},
				success: function(productos) {
					var select = $('#productoEmpresa');
					select.empty();
					select.removeAttr('disabled');
					select.append($('<option>').attr('selected', 'selected').text('Seleccionar producto').attr('value', -1));

					for (var i = 0; i < productos.length; i++) {
						var option = $('<option>').attr('value', productos[i].id).text(productos[i].nombre);
						select.append(option);
					}
					
					select.unbind().change(function() {
						if ($(this).val() !== undefined && $(this).val().trim() !== '') {
							$(this).closest('tr').nextAll('tr').each(function() {
								$(this).find('input').attr('disabled', 'disabled');
							});
						} else {
							$(this).closest('tr').nextAll('tr').each(function() {
								$(this).find('input').removeAttr('disabled', 'disabled');
							});
						}
					}).material_select();
				},
				error: function() {
					var select = $('#productoEmpresa');
					select.empty();
					select.attr('disabled', 'disabled');	
				}
			});
		});
	</script>


</body>
</html>