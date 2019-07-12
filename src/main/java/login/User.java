package login;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User{
	@Id
	@GeneratedValue
	private Long id;
	private String name=" ";
	private String password=" ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

