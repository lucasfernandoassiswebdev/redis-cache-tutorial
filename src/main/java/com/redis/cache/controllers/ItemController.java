package com.redis.cache.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.redis.cache.entities.Item;
import com.redis.cache.service.ItemService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ItemController {

	private final ItemService itemService;

	@GetMapping("/item/{id}")
	public Item getItemById(@PathVariable String id) {
		return itemService.getItemForId(id);
	}
}
