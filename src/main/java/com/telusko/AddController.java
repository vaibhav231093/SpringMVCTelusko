package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.AddService;

@Controller
public class AddController {

	
//	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
//		
//		int a = Integer.parseInt((String) req.getParameter("t1"));
//		int b = Integer.parseInt(req.getParameter("t2"));
//		
//		
//		AddService service = new AddService();
//		int result = service.add(a, b);
//		
//		ModelAndView mv = new ModelAndView("display");
//		mv.addObject("result", result);
//		
//		return mv;
//	}
	
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int a, @RequestParam("t2") int b) {
		
		
		AddService service = new AddService();
		int result = service.add(a, b);
		
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("result", result);
		
		return mv;
	}
	
}
