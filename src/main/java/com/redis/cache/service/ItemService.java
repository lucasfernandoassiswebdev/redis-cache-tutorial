package com.redis.cache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.redis.cache.entities.Item;
import com.redis.cache.repositories.ItemRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ItemService {

	private final ItemRepository itemRepository;

	@Cacheable(value = "itemCache")
	public Item getItemForId(String id) {
		return itemRepository.findById(id).orElseThrow(RuntimeException::new);
	}
}
