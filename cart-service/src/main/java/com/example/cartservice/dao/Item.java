package com.example.cartservice.dao;

/**
 * Copyright (c) 2019. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 6/20/2019.
 */
public class Item
{
	private long itemId;
	private String itemName;
	private double unitPrice;
	private double qty;

	public Item( long itemId, String itemName, double unitPrice, double qty )
	{
		this.itemId = itemId;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}

	public long getItemId()
	{
		return itemId;
	}

	public void setItemId( long itemId )
	{
		this.itemId = itemId;
	}

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName( String itemName )
	{
		this.itemName = itemName;
	}

	public double getUnitPrice()
	{
		return unitPrice;
	}

	public void setUnitPrice( double unitPrice )
	{
		this.unitPrice = unitPrice;
	}

	public double getQty()
	{
		return qty;
	}

	public void setQty( double qty )
	{
		this.qty = qty;
	}
}
