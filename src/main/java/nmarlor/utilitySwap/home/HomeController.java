package nmarlor.utilitySwap.home;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Principal principal) {
		return principal != null ? "home/homepage" : "home/homepage";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView index(@Valid @ModelAttribute("postcodeForm") PostcodeForm postcodeForm, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView("energy/homeEnergy");
		
		mv.addObject("postcodeForm", postcodeForm);
		
		return mv;
	}
}
