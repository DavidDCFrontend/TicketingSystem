package es.dsw.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.dsw.services.CurrentDateTimeService;

@Controller
public class MainController {
	
	private final CurrentDateTimeService currentDateTimeService;
	
	@Autowired 
	public MainController(CurrentDateTimeService currentDateTimeService) {
		this.currentDateTimeService = currentDateTimeService;
	}

	@GetMapping(value= {"/", "/index"}) 
	public String index(Model model) {	
		
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
	
	@GetMapping(value= {"/step1"})
	public String step1() {
		return "views/step1";
	}
	
	@GetMapping(value= {"/step2"})
	public String step2() {
		return "views/step2";
	}
	
	@GetMapping(value= {"/step3"})
	public String step3() {
		return "views/step3";
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