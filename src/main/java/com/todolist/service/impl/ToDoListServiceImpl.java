package com.todolist.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.todolist.entity.ToDoList;
import com.todolist.repository.TodoListRepository;
import com.todolist.service.ToDoListService;

@Service
public class ToDoListServiceImpl implements ToDoListService {

	@Autowired
	TodoListRepository toDoListRepository;

	@Override
	public void deleteToDoList(Long id) {
		toDoListRepository.deleteById(id);
	}

	@Override
	public Page<ToDoList> getToDoLists(Pageable pageable) {
		Page<ToDoList> toDoList = toDoListRepository.findAll(pageable);
		return toDoList;
	}

	@Override
	public void createToDoList(ToDoList toDoList) {
		toDoListRepository.save(toDoList);
		
	}

	@Override
	public Optional<ToDoList> findById(Long id) {
		
		Optional<ToDoList> toDoList = toDoListRepository.findById(id);
		return toDoList;
	}

}
