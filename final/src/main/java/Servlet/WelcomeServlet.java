package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.Product;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user1 = (String)request.getAttribute("user1");
		
		
		@SuppressWarnings("unchecked")
		List<Product> pdrList = (List<Product>)request.getAttribute("prodList");
		 out.println("<br><table border='1'> ");
			out.println("<th> Product Id </th>");
			out.println("<th> Product Name </th>");
			out.println("<th> Category </th>");
			out.println("<th>Action</th>");

			
			for(Product pd:pdrList) {
				out.println("<tr><td>" +pd.getId() +"</td>");
				out.println("<td>" +pd.getProd_name() +"</td> ");
				out.println("<td>" +pd.getCat() +"</td> ");
				out.println("<td><button><a href='add.html'>Add</a></button><button><a href='del.html'>Delete</a></button></tr></td>");
		
	

	
			}
		
				}
		
	
				
			
			
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
