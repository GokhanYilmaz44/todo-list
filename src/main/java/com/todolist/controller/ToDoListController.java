package com.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entity.ToDoList;
import com.todolist.service.ToDoListService;

@RestController
@RequestMapping("/api")
public class ToDoListController {

	@Autowired
	ToDoListService toDoListService;
	
	@PostMapping("/todolist")
	public void createToDoList(@RequestBody ToDoList toDoList) {		
		toDoListService.createToDoList(toDoList);
	}
	
	@DeleteMapping("/todolist/{id}")
	public void DeleteToList(@RequestBody Long id) {
		toDoListService.deleteToDoList(id);
	}
	
	@GetMapping("/todolists")
	public Page<ToDoList> ListToDoList(Pageable pageable) {
		return toDoListService.getToDoLists(pageable);
	}
	
}
