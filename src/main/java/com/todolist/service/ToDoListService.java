package com.todolist.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.todolist.entity.ToDoList;

public interface ToDoListService  {

public void deleteToDoList(Long id );

public Page<ToDoList> getToDoLists(Pageable pageable);

public void createToDoList(ToDoList toDoList);

public Optional<ToDoList> findById(Long id);

}
