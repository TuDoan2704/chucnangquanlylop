package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BEAN.BuoiHoc;
import DAO.DAOBuoiHoc;
import DB.DBConnection;

/**
 * Servlet implementation class BuoiHocController
 */
@WebServlet("/BuoiHocController")
public class BuoiHocController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuoiHocController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		List<BuoiHoc> list = DAOBuoiHoc.DisplayBuoiHoc(conn);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/BuoiHoc.jsp");
		rd.forward(request, response);
	}

}
