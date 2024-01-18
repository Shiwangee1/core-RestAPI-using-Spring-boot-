package com.rest.Api.RestApi.entities;

public class Coures {
	private long id;
	private String titile;
	private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Coures(long id, String titile, String description) {
		super();
		this.id = id;
		this.titile = titile;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Coures [id=" + id + ", titile=" + titile + ", description=" + description + "]";
	}
	public Coures() {
		super();
		// TODO Auto-generated constructor stub
	}

}
