package svl.productos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import svl.GenericHttpServlet;
import views.misc.TamanoView;
import views.productos.ProductoView;

@WebServlet("/jsp/Productos/AltaProducto")
public class AltaProducto extends GenericHttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String fragilidad = request.getParameter("tipoFragilidad");
		String tratamiento = request.getParameter("tipoTratamiento");
		String profundidad = request.getParameter("profundidad");
		String alto = request.getParameter("alto");
		String ancho = request.getParameter("ancho");
		String peso = request.getParameter("peso");
		String apilable = request.getParameter("apilable");
		String material = request.getParameter("material");
		String manipulacion = request.getParameter("manipulacion");
		String consideraciones = request.getParameter("consideraciones");
		String refrigerado = request.getParameter("refrigerado");

		try {
			TamanoView t = new TamanoView(Float.parseFloat(alto), Float.parseFloat(ancho), Float.parseFloat(profundidad));
			ProductoView p = new ProductoView(nombre, fragilidad, tratamiento, t, Float.parseFloat(peso), Integer.parseInt(apilable), manipulacion,
					material, consideraciones, new Boolean(refrigerado));
			Integer id = delegate.getInterfaz().altaProducto(p);
			forwardGenerico(request, response, "Producto agregado exitosamente con id: " + id + ".");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			forwardGenerico(request, response, e.getMessage());
		}
	}
}
