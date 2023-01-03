package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.LoginDaoImpl;
/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 try {
			 
			 	Connection con = Db.initializeDatabase();
	  
	             PreparedStatement st = con.prepareStatement("insert into Product_ values(?,?,?)");
	  
	           
	            st.setInt(1, Integer.valueOf(request.getParameter("id")));
	            st.setString(2, request.getParameter("name"));
	            st.setString(3, request.getParameter("cat"));
	
	            
	            st.executeUpdate();
	  
	           
	            st.close();
	            con.close();
	  
	           
	            PrintWriter out = response.getWriter();
	            
	            
	            out.println("<html><body><b><h1>Successfully Inserted Product</h1>"
	            		
	                        + "</b></body></html>");
	           
	        }
	        catch (Exception e) {
	            e.printStackTrace();
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
