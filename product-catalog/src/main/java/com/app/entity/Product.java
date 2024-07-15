package com.app.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private double price;
	@Column(name = "old_Price")
	private double old_Price;
	@Column(name = "rating")
	private double rating;
	@Column(name = "discount")
	private double discount;
	@Column(name = "colors")
	private String colors;
	@Column(name = "gender")
	private String gender;
	@Column(name = "brands")
	private String brands;
	@Column(name = "occasion")
	private String occasion;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at")
	private Date updatedAt;
	@Column(name = "image_url")
	private String imageUrl;
	
	
	
	public Product() {
		
	}



	public Product(Integer id, String name, String description, double price, double old_Price, double rating,
			double discount, String colors, String brands, String occasion, Date createdAt, Date updatedAt,
			String imageUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.old_Price = old_Price;
		this.rating = rating;
		this.discount = discount;
		this.colors = colors;
		this.brands = brands;
		this.occasion = occasion;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.imageUrl = imageUrl;
	}



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



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double getOld_Price() {
		return old_Price;
	}



	public void setOld_Price(double old_Price) {
		this.old_Price = old_Price;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public String getColors() {
		return colors;
	}



	public void setColors(String colors) {
		this.colors = colors;
	}


	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBrands() {
		return brands;
	}



	public void setBrands(String brands) {
		this.brands = brands;
	}



	public String getOccasion() {
		return occasion;
	}



	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}



	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public Date getUpdatedAt() {
		return updatedAt;
	}



	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", old_Price=" + old_Price + ", rating=" + rating + ", discount=" + discount + ", colors=" + colors
				+ ", gender=" + gender + ", brands=" + brands + ", occasion=" + occasion + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", imageUrl=" + imageUrl + "]";
	}



	
	
	
	
	
}
