import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayDisCount",urlPatterns={"/display-discount"})
public class DisplayDisCount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double price=Double.parseDouble(request.getParameter("product_price"));
        int percent= Integer.parseInt(request.getParameter("discount_percent"));

        double discount_amount= price * percent *0.01;

        double discount_price= price-discount_amount;

        PrintWriter writer=response.getWriter();

        writer.println("Actual Price is: "+discount_price);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
