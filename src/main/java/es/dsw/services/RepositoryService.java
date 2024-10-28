package es.dsw.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import es.dsw.models.RepositoryModel;

@Service
public class RepositoryService {

private List<RepositoryModel>repositorys;
	
	public RepositoryService() {
		
		repositorys = new ArrayList<>();
		repositorys.add(new RepositoryModel("1", "Morbius", "film1"));
		repositorys.add(new RepositoryModel("2", "Jurassic World", "film2"));
		repositorys.add(new RepositoryModel("3", "Lightyear", "film3"));
		repositorys.add(new RepositoryModel("4", "Los secretos de Dumbledorf", "film4"));
		repositorys.add(new RepositoryModel("5", "Muerte en el Nilo", "film5"));
		repositorys.add(new RepositoryModel("6", "The Northman", "film6"));
		repositorys.add(new RepositoryModel("7", "Nope", "film7"));
		repositorys.add(new RepositoryModel("8", "El buen patrón", "film8"));
		repositorys.add(new RepositoryModel("9", "Moonfall", "film9"));
		repositorys.add(new RepositoryModel("10", "Sonic 2", "film10"));
		repositorys.add(new RepositoryModel("11", "Encanto", "film11"));
		repositorys.add(new RepositoryModel("12", "El método Williams", "film12"));
		repositorys.add(new RepositoryModel("13", "Avatar 2", "film13"));
		repositorys.add(new RepositoryModel("14", "Top Gun Maverick", "film14"));			
	}	
	
	public List<RepositoryModel> getRepositorys(int numberOfMovies) {
		Collections.shuffle(repositorys);
		return repositorys.subList(0, numberOfMovies);
	}	
}




/*
 		repositorys.add(new RepositoryModel("Idfilm1", "Morbius", "film1"));
		repositorys.add(new RepositoryModel("Idfilm2", "Jurassic World", "film2"));
		repositorys.add(new RepositoryModel("Idfilm3", "Lightyear", "film3"));
		repositorys.add(new RepositoryModel("Idfilm4", "Los secretos de Dumbledorf", "film4"));
		repositorys.add(new RepositoryModel("Idfilm5", "Muerte en el Nilo", "film5"));
		repositorys.add(new RepositoryModel("Idfilm6", "The Northman", "film6"));
		repositorys.add(new RepositoryModel("Idfilm7", "Nope", "film7"));
		repositorys.add(new RepositoryModel("Idfilm8", "El buen patrón", "film8"));
		repositorys.add(new RepositoryModel("Idfilm9", "Moonfall", "film9"));
		repositorys.add(new RepositoryModel("Idfilm10", "Sonic 2", "film10"));
		repositorys.add(new RepositoryModel("Idfilm11", "Encanto", "film11"));
		repositorys.add(new RepositoryModel("Idfilm12", "El método Williams", "film12"));
		repositorys.add(new RepositoryModel("Idfilm13", "Avatar 2", "film13"));
		repositorys.add(new RepositoryModel("Idfilm14", "Top Gun Maverick", "film14"));	
 */


