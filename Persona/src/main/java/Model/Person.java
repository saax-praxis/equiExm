package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int person_id;
	private String person_name;
	private String person_motherName;
	private String person_fatherName;
	private int person_age;
	
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	
	public String getPerson_motherName() {
		return person_motherName;
	}
	public void setPerson_motherName(String person_motherName) {
		this.person_motherName = person_motherName;
	}
	public String getPerson_fatherName() {
		return person_fatherName;
	}
	public void setPerson_fatherName(String person_fatherName) {
		this.person_fatherName = person_fatherName;
	}
	public int getPerson_age() {
		return person_age;
	}
	public void setPerson_age(int person_age) {
		this.person_age = person_age;
	}
	
}
