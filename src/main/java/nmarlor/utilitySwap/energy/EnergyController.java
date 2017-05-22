package nmarlor.utilitySwap.energy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class EnergyController {

	@RequestMapping(value = "/homeEnergy", method = RequestMethod.GET)
	public ModelAndView HomeEnergy() {
		ModelAndView mv = new ModelAndView("energy/homeEnergy");
		return mv;
	}
}
