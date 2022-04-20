package com.redis.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisCacheTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisCacheTutorialApplication.class, args);
	}

}
