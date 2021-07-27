import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", urlPatterns = "/index")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String txtProduct = req.getParameter("txtProduct");
        int  txtPrice = Integer.parseInt(req.getParameter("txtPrice"));
        int  txtPercent = Integer.parseInt(req.getParameter("txtPercent"));

      int Discount = txtPrice * (txtPercent/100);


        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("Product " +txtProduct);
        writer.println("Price " + txtPrice);
        writer.println("Discount Amount = " +Discount);
        writer.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
