package in.gov.cgg.base.masters.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/")
	String home() {
		//return "base.login";
		return "base.globalerror";	
	}
}
