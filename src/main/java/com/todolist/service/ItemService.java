package com.todolist.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.todolist.entity.Item;

public interface ItemService  {

public void deleteItem(Long id );

public Page<Item> getItems(Pageable page);

public void createItem(Item item);

public Page<Item> findByToDoListId(Long todoListId, Pageable pageable);
}
