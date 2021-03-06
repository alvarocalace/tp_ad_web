package svl.vehiculos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svl.GenericHttpServlet;
import views.misc.TamanoView;
import views.personal.EmpleadoView;
import views.vehiculos.PlanMantenimientoView;
import views.vehiculos.VehiculoLocalView;

@WebServlet("/jsp/Vehiculos/AltaVehiculoLocal")
public class AltaVehiculoLocal extends GenericHttpServlet {
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
		String vencimientoGarantia = request.getParameter("vencimientoGarantia");
		String tipoPlan = request.getParameter("tipoPlan");
		String idEmpleado = request.getParameter("tipoPlan");

		try {
			PlanMantenimientoView p = procesarPlanMantenimientoView(tipoPlan, request);
			TamanoView t = new TamanoView(Float.parseFloat(alto), Float.parseFloat(ancho), Float.parseFloat(profundidad));
			EmpleadoView empleado = new EmpleadoView();
			empleado.setId(Integer.parseInt(idEmpleado));
			VehiculoLocalView v = new VehiculoLocalView(patente, t, Float.parseFloat(peso), Float.parseFloat(tara), Float.parseFloat(tarifa), tipo,
					vencimientoGarantia, empleado);
			Integer i = delegate.getInterfaz().altaVehiculoLocal(Integer.parseInt(id), v, p, Integer.parseInt(idEmpleado));
			forwardGenerico(request, response, "Vehiculo local agregado exitosamente con id: " + i + ".");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			forwardGenerico(request, response, e.getMessage());
		}
	}

	private PlanMantenimientoView procesarPlanMantenimientoView(String tipoPlan, HttpServletRequest request) {
		PlanMantenimientoView plan = new PlanMantenimientoView(tipoPlan);
		switch (tipoPlan) {
		case "kilometraje":
			plan.setPuntoControl(Float.parseFloat(request.getParameter("puntoControl")));
			break;
		case "kilometrajeRelativo":
			plan.setPuntoControl(Float.parseFloat(request.getParameter("puntoControl")));
			break;
		case "temporal":
			plan.setIntervaloMantenimiento(Integer.parseInt(request.getParameter("intervaloMantenimiento")));
			break;
		}
		return plan;
	}
}
