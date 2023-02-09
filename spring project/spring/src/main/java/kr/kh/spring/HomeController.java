package kr.kh.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/")
	public ModelAndView home(ModelAndView mv, String name, Integer age) {
		mv.addObject("name1", name);
		mv.addObject("age",age);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/board/{num}")
	public ModelAndView board(ModelAndView mv, @PathVariable("num")Integer num1) {
		System.out.print("게시글 번호: " + num1);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(ModelAndView mv, InfoVO info) {
		mv.addObject("info1", info);
		System.out.print(info);
		mv.setViewName("home2");
		return mv;
	}
	@RequestMapping(value = "/login")
	public ModelAndView login(ModelAndView mv, member id) {
		
		System.out.print(id);
		mv.setViewName("login");
		return mv;
	}
	
}
