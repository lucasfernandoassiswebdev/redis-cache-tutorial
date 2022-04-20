package com.redis.cache.repositories;

import org.springframework.data.repository.CrudRepository;

import com.redis.cache.entities.Item;

public interface ItemRepository extends CrudRepository<Item, String> {
}
