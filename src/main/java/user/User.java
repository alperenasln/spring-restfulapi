package user;

//-----------------------------------------------------
//Title: User
//Author:Alperen Aslan
//Definition : This class is object class which contains constructor,setters,getters.. etc.
//Resource : https://spring.io/guides/tutorials/rest/
//------------------------------------------------------
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class User {

	private @Id @GeneratedValue Long id;
	private String name;

	User() {
	}

	User(String name) {

		this.name = name;

	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;
		User user = (User) o;
		return Objects.equals(this.id, user.id) && Objects.equals(this.name, user.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}

	@Override
	public String toString() {
		return "User{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
	}
}