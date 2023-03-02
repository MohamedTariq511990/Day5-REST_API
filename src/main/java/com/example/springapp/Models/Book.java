package com.example.springapp.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_lib")
public class Book {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="bookName")
	private String bookName;
	@Column(name="price")
	private float price;
	@Column(name="quantity")
	private int quantity;
	@Column(name="authorName")
	private String authorName;
	public int getid() {
		return id;
	}
	public void setSid(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public float getprice() {
		return price;
	}
	public int getquantity() {
		return quantity;
	}
	
	public String getauthorName() {
		return authorName;
	}
}