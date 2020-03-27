package template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/requestmapping")
public class HelloController {
	
	@GetMapping("/hello")
    public ModelAndView getHello() {
        System.out.println("hello");
        return new ModelAndView("hello");
    }
	
}
