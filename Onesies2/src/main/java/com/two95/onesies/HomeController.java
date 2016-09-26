package com.two95.onesies;





import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.two95.onesies.model.Kid;
import com.two95.onesies.service.ReportService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	@Qualifier("service")
	ReportService service;
	
	public ReportService getService() {
		return service;
	}

	public void setService(ReportService service) {
		this.service = service;
	}
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/newreport", method = RequestMethod.GET)
	public String homepage() {
		
				
		
		return "check";
	}
	@RequestMapping(value = "/display", method = RequestMethod.POST)
	public String disppage(Model model) {
		
		List<Kid> kidlist = service.getKids();
		model.addAttribute("kidlist", kidlist);
		
		
		
				
		
		return "display";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@Valid@ModelAttribute("kid") Kid kid, BindingResult result){
		if (result.hasErrors()){
			ModelAndView model = new ModelAndView("check");
			return model;
		}
		
		service.save(kid);
		String msg = "Save successful";
		
		ModelAndView model1 = new ModelAndView("check");
		model1.addObject("msg", msg);
		return model1;
		
	}
	
}
