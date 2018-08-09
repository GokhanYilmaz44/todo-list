package com.todolist.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String name;
	
	private String description;
	
	private Date deadline;
	
	private String status;
	
	@ManyToOne(cascade = {
		   CascadeType.PERSIST,
 		   CascadeType.MERGE,
 		   CascadeType.DETACH,
 		   CascadeType.REFRESH})
	
	@JoinColumn(name="todolist_id")
	private ToDoList todolist;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public ToDoList getTodolist() {
		return todolist;
	}

	public void setTodolist(ToDoList todolist) {
		this.todolist = todolist;
	}

}
