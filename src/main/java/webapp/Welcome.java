package webapp;
import controller.welcomecontroller;
import controller.categorycontroller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;


@WebServlet(urlPatterns = "/welcome.ca")
public class Welcome extends HttpServlet {
	private categorycontroller cat=new categorycontroller();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		
		welcomecontroller con=new welcomecontroller();
		categorycontroller cat=new categorycontroller();
        System.out.println("hello");
        request.setAttribute("user", request.getSession().getAttribute("user"));
        request.setAttribute("product", con.list_product());
        request.setAttribute("category", cat.list_category());
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		 String category_name = request.getParameter("category_name");
		  String category_id = request.getParameter("category_id");
		  String category_description = request.getParameter("category_description");
		  // cat.update(category_id,category_name,category_description);
		   cat.delete(category_id);
		  request.setAttribute("categ", cat.list_category());
		  request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	    		
	}
	
	 /* public void doPut(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	    { //your code here
		  String category_name = request.getParameter("category_name");
		  String category_id = request.getParameter("category_id");
			
		   cat.update(category_id,category_name);
		 // request.setAttribute("category", cat.list_category());
		  request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	    }
	  public void doDelete(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
	    { //your code here
		  
	    }*/
	

		

	/*	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			String name = request.getParameter("name");
			String password = request.getParameter("password");

			boolean isValidUser = service.validateUser(name, password);

			if (isValidUser) {
			request.setAttribute("name", name);
				request.setAttribute("todos", todoService.retrieveTodos());
				request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Invalid Credentials!!");
				request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
			}
		}*/

	


}
