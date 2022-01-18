package com.joel.sprint.web.app.models;

import javax.persistence.*;

@Entity
public class MetodosPokemon {
	  @Id
	  private String id;
	private String abilities;
	private String base_experience;
	private String held_items;
	
	private String name;
	private String location_area_encounters;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAbilities() {
		return abilities;
	}
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	public String getBase_experience() {
		return base_experience;
	}
	public void setBase_experience(String base_experience) {
		this.base_experience = base_experience;
	}
	public String getHeld_items() {
		return held_items;
	}
	public void setHeld_items(String held_items) {
		this.held_items = held_items;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	@Override
	public String toString() {
		return "MetodosPokemon [id=" + id + ", abilities=" + abilities + ", base_experience=" + base_experience
				+ ", held_items=" + held_items + ", name=" + name + ", location_area_encounters="
				+ location_area_encounters + "]";
	}
	public MetodosPokemon() {
		
	}
	public MetodosPokemon(String id, String abilities, String base_experience, String held_items, String name,
			String location_area_encounters) {
		super();
		this.id = id;
		this.abilities = abilities;
		this.base_experience = base_experience;
		this.held_items = held_items;
		this.name = name;
		this.location_area_encounters = location_area_encounters;
	}
	
	
	
}
