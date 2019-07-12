package entity;

import javax.persistence.*;

@Entity
@Table
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	//@Column(name = "FIRST_NAME")
	private String firstName;
	//@Column(name = "LAST_NAME")
	private String lastName;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
