package com.example.orderservice.controller;

import com.example.orderservice.dao.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2019. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 6/20/2019.
 */
@RestController
@RequestMapping("products")
public class ProductController
{
	@GetMapping
	ResponseEntity<List<Item>> findAllCartDetails()
	{
		List<Item> items = new ArrayList<>();
		items.add( new Item( 1, "Pen", 12.0, 150 ) );
		items.add( new Item( 1, "Pencil", 5.0, 80 ) );
		items.add( new Item( 1, "Eraser", 10.0, 200 ) );
		items.add( new Item( 1, "A4 Bundle", 500.0, 500 ) );

		return ResponseEntity.ok( items );
	}
}
