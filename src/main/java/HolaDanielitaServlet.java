import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 7/19/14
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class HolaDanielitaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String title = req.getParameter("title");
        String poster =req.getParameter("poster");
        String shortDescription=req.getParameter("shortdescrip");
        String ingredients = req.getParameter("ingredients");
        String directions = req.getParameter("directions");
        String imageLocation = req.getParameter("image");


        resp.getWriter().print("the name is:" + title);
        resp.getWriter().print("the name is:" + poster);

    }
}
