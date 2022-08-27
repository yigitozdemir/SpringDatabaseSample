package com.yigitozdemir.DatabaseSample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "Users", uniqueConstraints = @UniqueConstraint(columnNames={"USERNAME"}) )
@EnableAutoConfiguration
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "USERNAME")
	private String username;
	private String firstName;
	private String lastName;
	private String password;
	
	protected User() {}
	
	public User(String username, String firstName, String lastName, String password) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("User[id=%d, firstName='%s', lastName='%s', username='%s, password='%s']",
				id, firstName, lastName, username, password);
	}
	
}
