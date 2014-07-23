import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/19/14
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class HolaDanielitaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hola Danielita Nuevamente!!!");
    }
}
