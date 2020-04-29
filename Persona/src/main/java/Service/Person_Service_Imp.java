package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Person_DAO;
import Model.Person;

@Service
@Transactional
public class Person_Service_Imp implements Person_Service {
 
	@Autowired
	private Person_DAO persondao;
	
	@Override
	public boolean savePerson(Person person) {
		return persondao.savePerson(person);
	}

	@Override
	public List<Person> getPersons() {
		return persondao.getPersons();
	}

	@Override
	public boolean deletePerson(Person person) {
		return persondao.deletePerson(person);
	}

	@Override
	public List<Person> getPersonByID(Person person) {
		return persondao.getPersonByID(person);
	}

	@Override
	public boolean updatePerson(Person person) {
		return persondao.updatePerson(person);
	}

}
