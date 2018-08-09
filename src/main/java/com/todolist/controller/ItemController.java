package com.todolist.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entity.Item;
import com.todolist.entity.ToDoList;
import com.todolist.service.ItemService;
import com.todolist.service.ToDoListService;

@RestController
@RequestMapping("/api")
public class ItemController {
	
	@Autowired
	ToDoListService toDoListService;
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/todolists/{todoListId}/items")
    public Page<Item> getAllItemsByToDoListId(@PathVariable (value = "todoListId") Long todoListId,Pageable pageable) {
        return itemService.findByToDoListId(todoListId,pageable);
    }
	
	@PostMapping("/todolists/{todoListId}/items")
    public Item createItem(@PathVariable (value = "todoListId") Long todoListId,
                                 @Valid @RequestBody Item item) {
        
		ToDoList toDoList = toDoListService.findById(todoListId).get();
	    toDoList.addItem(item);
	    toDoListService.createToDoList(toDoList);
		return item;
    }

}
