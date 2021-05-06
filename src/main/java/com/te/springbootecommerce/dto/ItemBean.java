package com.te.springbootecommerce.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "item")
@Entity
public class ItemBean implements Serializable{
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer qty;
	@Column
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemBean [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	


}
