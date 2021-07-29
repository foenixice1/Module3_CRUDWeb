import models.KhachHang;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {""})
public class ProductKH extends HttpServlet {
    ArrayList<KhachHang> list = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        list.add(new KhachHang("Nguyen Quang Hung", "23/03/2000", "Thai Nguyen", "Anh/1.jpg"));
        list.add(new KhachHang("Hoang Thi Hien", "16/03/2000", "Thai Nguyen", "Anh/2.jpg"));
        list.add(new KhachHang("Nguyen Hoai Nam", "05/04/1999", "Thai Nguyen", "Anh/3.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;
        if (action == null) {
            action = "";
        }
            switch (action) {
                case "create":
                    resp.sendRedirect("CreateKH.jsp");
                    break;
                case "delete":
                    int indexDelete = Integer.parseInt(req.getParameter("index"));
                    list.remove(indexDelete);
                    resp.sendRedirect("/");
                    break;
                case "edit":
                    int indexEdit = Integer.parseInt(req.getParameter("index"));
                    KhachHang khachHang = list.get(indexEdit);
                    req.setAttribute("list", khachHang);
                    requestDispatcher = req.getRequestDispatcher("editKH.jsp");
                    requestDispatcher.forward(req, resp);
                    break;
                default:
                    req.setAttribute("listKH", list);
                    requestDispatcher = req.getRequestDispatcher("KhachHang.jsp");
                    requestDispatcher.forward(req, resp);
            }
        }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String index = req.getParameter("index");
        String name = req.getParameter("name");
        String ngaySinh = req.getParameter("ngaySinh");
        String diaChi = req.getParameter("diaChi");
        String img = req.getParameter("img");

        if (index == null) {
            list.add(new KhachHang(name, ngaySinh, diaChi, img));
        } else {
            list.set(Integer.parseInt(index), new KhachHang(name, ngaySinh, diaChi, img));
        }

        resp.sendRedirect("/");
    }
}
