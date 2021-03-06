package svl.vehiculos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svl.GenericHttpServlet;
import views.misc.TamanoView;
import views.vehiculos.VehiculoExternoView;

@WebServlet("/jsp/Vehiculos/AltaVehiculoExterno")
public class AltaVehiculoExterno extends GenericHttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String patente = request.getParameter("patente");
		String profundidad = request.getParameter("profundidad");
		String alto = request.getParameter("alto");
		String ancho = request.getParameter("ancho");
		String tara = request.getParameter("tara");
		String tarifa = request.getParameter("tarifa");
		String tipo = request.getParameter("tipo");
		String peso = request.getParameter("peso");
		try {
			TamanoView t = new TamanoView(Float.parseFloat(alto), Float.parseFloat(ancho), Float.parseFloat(profundidad));
			VehiculoExternoView v = new VehiculoExternoView(patente, t, Float.parseFloat(peso), Float.parseFloat(tara), Float.parseFloat(tarifa), tipo);
			Integer i = delegate.getInterfaz().altaVehiculoExterno(Integer.parseInt(id), v);
			forwardGenerico(request, response, "Vehiculo externo agregado exitosamente con id: " + i + ".");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			forwardGenerico(request, response, e.getMessage());
		}
	}
}
