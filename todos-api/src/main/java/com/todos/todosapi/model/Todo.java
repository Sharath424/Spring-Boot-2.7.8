package com.todos.todosapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
//@Table(name = "todos")
public class Todo {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@Column(nullable = false)
	
	@NotNull
	private String user;
	
	@Size(min=9,message="Enter atleast 10 characters")
	private String description;
//	@Column
	
	private Date targetDate;
//	@Column
	private boolean done;

	public Todo() {
		super();
	}

	public Todo(int id,String user, String description, Date targetDate, boolean done) {
		super();
		this.id = id;
		this.user=user;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
