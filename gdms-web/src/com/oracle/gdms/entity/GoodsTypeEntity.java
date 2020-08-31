package com.oracle.gdms.entity;

import java.io.Serializable;

public class GoodsTypeEntity implements  Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5290877979333496707L;
	private int gtid;
	private String name;
	private String description;
	public int getGtids() {
		return gtid;
	}
	public void setGtids(int gtids) {
		this.gtid = gtids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public GoodsTypeEntity() {
		super();
	}
	public GoodsTypeEntity(int gtid,String name,String description) {
		super();
		this.gtid = gtid;
		this.name = name;
		this.description = description;
	}
	@Override
	public String toString() {
		return "GoodsTypeEntity [gtid=" + gtid + ", name=" + name + ", description=" + description + "]";
	}	



}
