package controller;
import model.Customer;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ControllerServlet", urlPatterns = "/controller")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn", "20/08/1983", "Hà Nội", "https://wall.vn/wp-content/uploads/2020/02/hinh-nen-con-ho-30-768x480.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam", "21/08/1983", "Bắc Giang", "https://thiepnhanai.com/wp-content/uploads/2021/05/hinh-anh-dong-dep-1.gif"));
        customerList.add(new Customer("Nguyễn Thái Hòa", "22/08/1983", "Nam Định", "https://upanh123.com/wp-content/uploads/2020/09/hinh-anh-buon6.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa", "23/08/1983", "Hà Tây", "https://topshare.vn/wp-content/uploads/2021/02/Hinh-anh-buon-co-don-8.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi", "24/08/1983", "Hà Nội", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKkhmMEQcPAYa2N4ikHORTHztJYWbl3b6Uqg&usqp=CAU"));

        request.setAttribute("customers",customerList);
        request.getRequestDispatcher("test.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
