package es.dsw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import es.dsw.models.Booking;
import es.dsw.models.ValidationForm;

@Controller
@SessionAttributes({"booking", "validation"})
public class Step3Controller {
	
	@PostMapping("/step3")
	public String step3(@RequestParam(required=false) String fnom,
						@RequestParam(required=false) String fapell,
						@RequestParam(required=false) String fmail,
						@RequestParam(required=false) String frepmail,
						@RequestParam(required=false) String fdate,
						@RequestParam(required=false) String fhour,
						@RequestParam(defaultValue = "0", required=false)Integer fnumentradasadult,
						@RequestParam(defaultValue = "0", required=false) Integer fnumentradasmen,
						Model model) {
		
		// Recuperamos el objeto 'booking' de la sesión
		Booking booking = (Booking) model.getAttribute("booking");
		
		// Variable que almacena si hay error
		boolean hasErrors = false;
		
		// Validaciones
		boolean isFnomInvalid = fnom == null || fnom.trim().isEmpty();
		boolean isFmailInvalid = fmail == null || fmail.isEmpty();
		boolean isFrepInvalid = frepmail == null || frepmail.isEmpty() || !fmail.equalsIgnoreCase(frepmail);
		boolean isFdateInvalid = fdate == null || fdate.isEmpty();
		boolean isFhourInvalid = fhour == null || fhour.isEmpty();
		boolean isFnumentradasadultInvalid = fnumentradasadult == null || fnumentradasadult < 1;
		boolean isFnumentradaschildrenInvalid = fnumentradasmen == null || fnumentradasmen < 0;
		
		if(isFnomInvalid || isFmailInvalid || isFrepInvalid || isFdateInvalid || isFhourInvalid || isFnumentradasadultInvalid || isFnumentradaschildrenInvalid) {
			
			ValidationForm validation = new ValidationForm(isFnomInvalid, isFmailInvalid, isFrepInvalid, isFdateInvalid, isFhourInvalid, isFnumentradasadultInvalid, isFnumentradaschildrenInvalid);
			model.addAttribute("validation", validation);
			
			if(booking!=null) {
				booking.setfName(fnom);
				booking.setfSurname(fapell);
				booking.setfMail(fmail);
				booking.setfRepMail(frepmail);
				booking.setfDate(fdate);
				booking.setfHour(fhour);
				booking.setfNumAdults(fnumentradasadult);
				booking.setfNumChildren(fnumentradasmen);
			}
			
			// Redirección a 'step2' sin perder los datos
			model.addAttribute("booking", booking);
			return "redirect:/step2";	
		}
		
		ValidationForm validation = new ValidationForm(isFnomInvalid, isFmailInvalid, isFrepInvalid, isFdateInvalid, isFhourInvalid, isFnumentradasadultInvalid, isFnumentradaschildrenInvalid);
		model.addAttribute("validation", validation);
		
		booking.setfName(fnom);
		booking.setfSurname(fapell);
		booking.setfMail(fmail);
		booking.setfRepMail(frepmail);
		booking.setfDate(fdate);
		booking.setfHour(fhour);
		booking.setfNumAdults(fnumentradasadult);
		booking.setfNumChildren(fnumentradasmen);
		model.addAttribute("booking", booking);
		
		return "views/step3";
	}
}








/*

package es.dsw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import es.dsw.models.Booking;
import es.dsw.models.ValidationForm;

@Controller
@SessionAttributes({"booking", "validation"})
public class Step3Controller {
	
	@PostMapping("/step3")
	public String step3(@RequestParam(required=false) String fnom,
						@RequestParam(required=false) String fapell,
						@RequestParam(required=false) String fmail,
						@RequestParam(required=false) String frepmail,
						@RequestParam(required=false) String fdate,
						@RequestParam(required=false) String fhour,
						@RequestParam(defaultValue = "0", required=false)Integer fnumentradasadult,
						@RequestParam(defaultValue = "0", required=false) Integer fnumentradasmen,
						Model model) {
		
		// Recuperamos el objeto 'booking' de la sesión
		Booking booking = (Booking) model.getAttribute("booking");
		
		// Variable que almacena si hay error
		boolean hasErrors = false;
		
		// Validaciones
		boolean isFnomInvalid = fnom == null || fnom.trim().isEmpty();
		boolean isFmailInvalid = fmail == null || fmail.isEmpty();
		boolean isFrepInvalid = frepmail == null || frepmail.isEmpty() || !fmail.equalsIgnoreCase(frepmail);
		boolean isFdateInvalid = fdate == null || fdate.isEmpty();
		boolean isFhourInvalid = fhour == null || fhour.isEmpty();
		boolean isFnumentradasadultInvalid = fnumentradasadult == null || fnumentradasadult < 1;
		boolean isFnumentradaschildrenInvalid = fnumentradasmen == null || fnumentradasmen < 0;
		
		
		if(isFnomInvalid || isFmailInvalid || isFrepInvalid || isFdateInvalid || isFhourInvalid || isFnumentradasadultInvalid || isFnumentradaschildrenInvalid) {
			
			ValidationForm validation = new ValidationForm(isFnomInvalid, isFmailInvalid, isFrepInvalid, isFdateInvalid, isFhourInvalid, isFnumentradasadultInvalid, isFnumentradaschildrenInvalid);
			model.addAttribute("validation", validation);
			
			if(booking!=null) {
				booking.setfName(fnom);
				booking.setfSurname(fapell);
				booking.setfMail(fmail);
				booking.setfRepMail(frepmail);
				booking.setfDate(fdate);
				booking.setfHour(fhour);
				booking.setfNumAdults(fnumentradasadult);
				booking.setfNumChildren(fnumentradasmen);
			}
			
			// Redirección a 'step2' sin perder los datos
			model.addAttribute("booking", booking);
			return "redirect:/step2";	
		}
		
		isFnomInvalid = false;
		isFmailInvalid = false;
		isFrepInvalid = false;
		isFdateInvalid = false;
		isFhourInvalid = false;
		isFnumentradasadultInvalid = false;
		isFnumentradaschildrenInvalid = false;
		model.addAttribute("validation", validation);
		booking.setfName(fnom);
		booking.setfSurname(fapell);
		booking.setfMail(fmail);
		booking.setfRepMail(frepmail);
		booking.setfDate(fdate);
		booking.setfHour(fhour);
		booking.setfNumAdults(fnumentradasadult);
		booking.setfNumChildren(fnumentradasmen);
		model.addAttribute("booking", booking);
		
		return "views/step3";
	}
}
*/




