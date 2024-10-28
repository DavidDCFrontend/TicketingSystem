package es.dsw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import es.dsw.models.Booking;
import es.dsw.models.ValidationForm;

@Controller
@SessionAttributes({"booking", "validation"})
public class Step2Controller {

	@GetMapping("/step2")
	public String step2(@RequestParam(value= "idFilm", required=false) String movieId,
			            @RequestParam(value= "sala", required=false) String sala,
			            Model model) {
		
	    ValidationForm validation = (ValidationForm) model.getAttribute("validation");
	    
	    if(validation == null) {
	    	validation = new ValidationForm();
	    	model.addAttribute("validation", validation);
	    }
	    
		// Si los parámetros están presentes los guardamos en la sesión
		if(movieId != null && sala != null && !model.containsAttribute("booking")) {
			Booking booking = new Booking(movieId, sala);
			model.addAttribute("booking", booking);
		}
		
		if(movieId != null && sala != null && model.containsAttribute("booking")) {
			Booking booking = (Booking) model.getAttribute("booking");
			booking.setIdFilm(movieId);
			booking.setSala(sala);
			model.addAttribute("booking", booking);
		}
			
		// Si no hay parámetros, intentamos obtener los valores de la sesión
        if (!model.containsAttribute("booking")) {
            return "redirect:/step1";  // Si no hay datos de sesión, redirigir a 'step1'
        }
        
        Booking booking = (Booking) model.getAttribute("booking");
        model.addAttribute("booking", booking);
	
		return "views/step2";	
	}
}