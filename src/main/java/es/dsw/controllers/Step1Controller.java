package es.dsw.controllers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import es.dsw.models.Booking;
import es.dsw.models.RepositoryModel;
import es.dsw.models.ValidationForm;
import es.dsw.services.RepositoryService;


@Controller
@SessionAttributes({"booking", "validation"})
public class Step1Controller {
	
	// Inyección del servicio a través del constructor
	private final RepositoryService moviesService;
	
	public Step1Controller(RepositoryService moviesService) {
		this.moviesService = moviesService;
	}
	
	@GetMapping(value= {"/step1"})
	public String step1(Model model) {
		
		// Día actual
		DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
		
		// Definición de cantidad de películas a mostrar
		int numberOfMovies;
		if(currentDay == DayOfWeek.MONDAY || currentDay == DayOfWeek.WEDNESDAY || currentDay == DayOfWeek.SUNDAY) {
			numberOfMovies = 4;		
		} else {	
			numberOfMovies = 7;
		}
		
		// Obtención de películas aleatorias
		List<RepositoryModel> movies = moviesService.getRepositorys(numberOfMovies);
		
		
		ValidationForm validation = (ValidationForm) model.getAttribute("validation");
		model.addAttribute("validation", validation);
		
		Booking booking = (Booking) model.getAttribute("booking");
		
		
		
		// Añadir lista de películas al modelo
		model.addAttribute("movies", movies);
		model.addAttribute("currentDay", currentDay);
		
		return "views/step1";
	}
}
