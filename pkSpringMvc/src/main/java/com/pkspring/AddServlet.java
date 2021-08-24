package com.pkspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddServlet {
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request,HttpServletResponse Response)
	{
		
		int i=Integer.parseInt(request.getParameter("FirstNumber"));
		int j=Integer.parseInt(request.getParameter("SecondNumber"));
		
		int k=i+j;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Display");
		mv.addObject("result", k);
		return mv;
	//System.out.println("Hello");
	
	}

}
