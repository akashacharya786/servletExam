package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import model.Product;
import service.ProductLoginImpl;
import service.ProductLoginServic;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/WelcomeServlet")
public class Filter extends HttpFilter implements javax.servlet.Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Filter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String userName = request.getParameter("input-1");
		String password1 = request.getParameter("input-2");
		
		ProductLoginServic service = new ProductLoginImpl();
		
		if(userName.equals("") || password1.equals("")) {
			pw.print("<h2>**Please enter username and password**</h2> <br>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
				
		}
		else if(service.isValidUser(userName, password1)) {
			
			
			List<Product> prodList = service.getProd();
			request.setAttribute("user1", userName);
		
			
			request.setAttribute("prodList", prodList);
			chain.doFilter(request, response);
	}
		else {
			pw.print("<h2>** Incorrect Login Credentials **</h2> ");
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	
		
		chain.doFilter(request, response);
	
}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
