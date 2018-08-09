package com.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.todolist.entity.ToDoList;


@Repository
public interface TodoListRepository extends PagingAndSortingRepository<ToDoList,Long> {
	
}
