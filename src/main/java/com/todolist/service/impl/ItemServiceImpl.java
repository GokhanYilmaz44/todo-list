package com.todolist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.todolist.entity.Item;
import com.todolist.repository.ItemRepository;
import com.todolist.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	@Override
	public void deleteItem(Long id) {
		itemRepository.deleteById(id);
	}

	@Override
	public Page<Item> getItems(Pageable pageable) {
		Page<Item> items = itemRepository.findAll(pageable);
		return items;
	}

	@Override
	public void createItem(Item item) {
		itemRepository.save(item);
		
	}

	@Override
	public Page<Item> findByToDoListId(Long todoListId, Pageable pageable) {
		
		Page<Item> items = itemRepository.findAll(pageable);
		
		return items;
	}

}
