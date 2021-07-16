package com.zking.interceptor;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zking.entity.NavUsers;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {

		HttpSession session = request.getSession();

//		NavUsers users = (NavUsers) session.getAttribute("users");
		Object users = session.getAttribute("users");

		if (users != null) {
			return true;
		} else {

//			response.sendRedirect(request.getContextPath() + "/login.html");
			response.sendRedirect("../login.html");
			return false;
		}

	}

}
