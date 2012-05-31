package cs.web.ClienteServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cs.modelo.Cliente;
import cs.negocio.AdministradorClientesService;

/**
 * Un Servlet para probar los EJB.
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        @EJB
        private AdministradorClientesService admClientes;

        /**
         * Se llama a doGet cuando el cliente hace GET sobre el servlet.
         * @param request Información sobre la solicitud del navegador.
         * @param response Objeto para elaborar la respuesta que se le envía.
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) 
                        throws ServletException, IOException {

                Cliente c = new Cliente();
                c.setId((long)10);
                c.setDni((long)36025649);
                c.setNombre("luis");
                c.setCuil("23-36025649");
                admClientes.darDeAlta(c);

                PrintWriter out = response.getWriter();
                out.println("<html>" +
                "<head><title>Hello</title></head>" +
                "<body><p>" + "Agregu&eacute; un cliente y funciona!!!" + "</p></body>" +
                "</html>");
        }
}