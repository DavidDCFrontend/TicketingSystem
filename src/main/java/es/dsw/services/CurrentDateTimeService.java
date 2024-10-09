package es.dsw.services;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CurrentDateTimeService {
	
	public String getCurrentDay() {
		
		ZonedDateTime currentDateTime = ZonedDateTime.now();
		
	    return currentDateTime.getDayOfWeek().toString();	    		
	}
	
	public String getCurrentHour() {
		
		ZonedDateTime currentDateTime = ZonedDateTime.now();
		
		return currentDateTime.getHour() + "h " + currentDateTime.getMinute() + "m";    	
	}
	
	public String getDayOfMonth() {
		
		ZonedDateTime currentDateTime = ZonedDateTime.now();
		
		return String.valueOf(currentDateTime.getDayOfMonth());	
	}
	
	public String getDateFormatted() {
		
		ZonedDateTime currentDateTime = ZonedDateTime.now();
        
        DayOfWeek day = currentDateTime.getDayOfWeek();
        
        Month month = currentDateTime.getMonth();
        
        Map<DayOfWeek, String> daysInSpanish = new HashMap<>();
        
        daysInSpanish.put(DayOfWeek.MONDAY, "Lunes");
        daysInSpanish.put(DayOfWeek.TUESDAY, "Martes");
        daysInSpanish.put(DayOfWeek.WEDNESDAY, "Miércoles");
        daysInSpanish.put(DayOfWeek.THURSDAY, "Jueves");
        daysInSpanish.put(DayOfWeek.FRIDAY, "Viernes");
        daysInSpanish.put(DayOfWeek.SATURDAY, "Sábado");
        daysInSpanish.put(DayOfWeek.SUNDAY, "Domingo");
        
        
        String dayInSpanish = daysInSpanish.get(day);
        
        String dayOfMonth = String.valueOf(currentDateTime.getDayOfMonth());
        
        Map<Month, String> monthsInSpanish = new HashMap<>();
        
        monthsInSpanish.put(Month.JANUARY, "Enero");
        monthsInSpanish.put(Month.FEBRUARY, "Febrero");
        monthsInSpanish.put(Month.MARCH, "Marzo");
        monthsInSpanish.put(Month.APRIL, "Abril");
        monthsInSpanish.put(Month.MAY, "Mayo");
        monthsInSpanish.put(Month.JUNE, "Junio");
        monthsInSpanish.put(Month.JULY, "Julio");
        monthsInSpanish.put(Month.AUGUST, "Agosto");
        monthsInSpanish.put(Month.SEPTEMBER, "Septiembre");
        monthsInSpanish.put(Month.OCTOBER, "Octubre");
        monthsInSpanish.put(Month.NOVEMBER, "Noviembre");
        monthsInSpanish.put(Month.DECEMBER, "Diciembre");
        
        String monthInSpanish = monthsInSpanish.get(month);
        
        return dayInSpanish + ", día " + dayOfMonth + " de " + monthInSpanish;
	}
}