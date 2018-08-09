package com.todolist;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.todolist.entity.Item;
import com.todolist.entity.ToDoList;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
		ToDoList toDoList = new ToDoList();
		Item item = new Item();
		item.setDeadline(new Date());
		item.setDescription("dsdsadasdsa");
		item.setName("gökhan");
		item.setStatus("completed");
		
		List<Item> items = new ArrayList<>();
		items.add(item);
		
       toDoList.setItems(items);
       toDoList.setName("list1");
       
       ObjectMapper mapper = new ObjectMapper();
       try {
		String json = mapper.writeValueAsString(toDoList);
		System.out.println(toDoList);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}
}
