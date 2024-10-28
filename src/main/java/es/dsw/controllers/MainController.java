package es.dsw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import es.dsw.services.CurrentDateTimeService;
import es.dsw.services.RepositoryService;

@Controller
@SessionAttributes({"booking", "validation"})
public class MainController {
	
	private final CurrentDateTimeService currentDateTimeService;
	
	@Autowired 
	public MainController(CurrentDateTimeService currentDateTimeService) {
		this.currentDateTimeService = currentDateTimeService;
	}

	@GetMapping(value= {"/", "/index"}) 
	public String index(SessionStatus status, Model model) {
		
		status.setComplete();
		
		String currentDay = currentDateTimeService.getCurrentDay();
		String currentHour = currentDateTimeService.getCurrentHour();
		String currentDayOfMonth = currentDateTimeService.getDayOfMonth();
		String dateFormatted = currentDateTimeService.getDateFormatted();
		model.addAttribute("currentDay", currentDay);
		model.addAttribute("currentHour", currentHour);
		model.addAttribute("currentDayOfMonth", currentDayOfMonth);
		model.addAttribute("dateFormatted", dateFormatted);
		return "index";
	}
	
	
	@GetMapping(value= {"/step4"})
	public String step4() {
		return "views/step4";
	}
	
	@GetMapping(value= {"/end"})
	public String end() {
		return "views/end";
	}
}