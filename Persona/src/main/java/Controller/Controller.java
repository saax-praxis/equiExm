package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Person;
import Service.Person_Service;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class Controller {
	
	@Autowired
	private Person_Service personservice;
	
	@PostMapping("save-person")
	public boolean savePerson(@RequestBody Person person) {
		 return personservice.savePerson(person);
		
	}
	
	@GetMapping("persons-list")
	public List<Person> allpersons() {
		 return personservice.getPersons();
	}
	
	
	@DeleteMapping("delete-person/{person_id}")
	public boolean deletePerson(@PathVariable("person_id") int person_id,Person person) {
		person.setPerson_id(person_id);
		return personservice.deletePerson(person);
	}

	@GetMapping("person/{person_id}")
	public List<Person> allpersonByID(@PathVariable("person_id") int person_id,Person person) {
		 person.setPerson_id(person_id);
		 return personservice.getPersonByID(person);
		
	}
	
	@PostMapping("update-person/{person_id}")
	public boolean updatePerson(@RequestBody Person person,@PathVariable("person_id") int person_id) {
		person.setPerson_id(person_id);
		return personservice.updatePerson(person);
	}
}
