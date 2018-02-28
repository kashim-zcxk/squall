package mx.squall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String genericoHome(@RequestParam(value="name", required=false, defaultValue="World") String name, ModelMap model, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		return "greeting";
	}
	
}
