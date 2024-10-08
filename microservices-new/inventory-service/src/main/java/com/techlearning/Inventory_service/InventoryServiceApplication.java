package com.techlearning.Inventory_service;

import com.techlearning.Inventory_service.model.Inventory;
import com.techlearning.Inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("MOTOROLA Edge 50");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_13");
			inventory1.setQuantity(0);

			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("Samsung_Galaxy_S24");
			inventory2.setQuantity(100);
		};
	}

}
