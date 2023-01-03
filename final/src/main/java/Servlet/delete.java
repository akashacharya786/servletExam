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

/**
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 
			 Connection con = Db.initializeDatabase();
	  
	             PreparedStatement st = con
	                   .prepareStatement("delete from Product_ where id=?");
	  
	           
	            st.setInt(1, Integer.valueOf(request.getParameter("id")));
	            
	           st.executeUpdate();
	  
	           
	            st.close();
	            con.close();
	  
	           
	            PrintWriter out = response.getWriter();
	           
	            
	            
	            out.println("<html><body><b><h1>Successfully Deleted Product</h1>"
	            		
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
