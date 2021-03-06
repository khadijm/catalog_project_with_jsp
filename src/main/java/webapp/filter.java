package webapp;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "")
public class filter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;

		if (request.getSession().getAttribute("user") != null) {
			chain.doFilter(servletRequest, servletResponse);
		} else {
			request.setAttribute("account", "to be able to acces to alll our containt you must login if you have an account or signup if not");
			request.getRequestDispatcher("/welcome.ca").forward(servletRequest,
					servletResponse);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}


