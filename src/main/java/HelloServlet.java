import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Date;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hi好中国");
        response.getWriter().println(new Date().getTime());
        System.out.println("nihoasfasdfsafsafsaf234234342423as11111111");
    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
