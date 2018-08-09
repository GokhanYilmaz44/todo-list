package com.todolist.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="todolist")
public class ToDoList {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY,
			mappedBy="todolist",
	        cascade = {CascadeType.PERSIST,
	        		   CascadeType.MERGE,
	        		   CascadeType.DETACH,
	        		   CascadeType.REFRESH}	        
	    )
	@JsonIgnore
	private List<Item> items;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		if (item !=null) {
			items = new ArrayList<>();
		}
		items.add(item);
		item.setTodolist(this);		
	}
	
	
}