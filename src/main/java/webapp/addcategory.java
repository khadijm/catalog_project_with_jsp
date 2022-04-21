package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.categorycontroller;

@WebServlet(urlPatterns = "")
public class addcategory extends HttpServlet {
	
	protected categorycontroller signup=new categorycontroller();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		request.getRequestDispatcher("/WEB-INF/views/category.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String cat_name = request.getParameter("name");
		String cat_des=request.getParameter("username");
		signup.registraion_category(cat_name, cat_des);

		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
		
	}

}
