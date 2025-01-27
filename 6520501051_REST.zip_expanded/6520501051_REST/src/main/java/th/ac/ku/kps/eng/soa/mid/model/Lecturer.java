package th.ac.ku.kps.eng.soa.mid.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lecturer implements Serializable {
	
	@JsonProperty("id")
	public int id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("email")
	public String email;
	
	public Lecturer() {
		
	}
	
	public Lecturer(int id , String name , String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
