package com.spring.mysql.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebSeries {
	@Id
	private int id;
	private String name;
	private int seasons;
	private int episodes;
	private int rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public int getEpisodes() {
		return episodes;
	}
	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public WebSeries() {
		super();
	}
	public WebSeries(int id, String name, int seasons, int episodes, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.seasons = seasons;
		this.episodes = episodes;
		this.rating = rating;
	}
	public WebSeries(String name, int seasons, int episodes, int rating) {
		super();
		this.name = name;
		this.seasons = seasons;
		this.episodes = episodes;
		this.rating = rating;
	}
	
	
}
