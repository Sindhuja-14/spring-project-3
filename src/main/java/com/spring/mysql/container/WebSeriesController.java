package com.spring.mysql.container;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mysql.dao.WebSeriesRepo;
import com.spring.mysql.model.WebSeries;

@RestController
public class WebSeriesController {

	@Autowired
	WebSeriesRepo repo;
	
	@PostMapping(path = "/addseries")
	public WebSeries addSeries(@RequestBody WebSeries web) {
		repo.save(web);
		return web;
	}
	
	@GetMapping(path = "/series") 
	public List<WebSeries> getWebSeries() {
		
		return repo.findAll();
	}
	
	 @GetMapping(path = "/getallseriesbyid")
		public List<WebSeries> getWebSeriesId(@RequestParam("id") int webseriesid) {
			
			return repo.findAllById(webseriesid);
		}
	 
	 @GetMapping(path = "/getallseriesbyname")
		public List<WebSeries> getWebSeriesName(@RequestParam("id") String webseriesname) {
			
			return repo.findAllByName(webseriesname);
		}
	
	  @PutMapping(path = "/update")
	    public WebSeries updateWebSeries(@RequestParam("id") int id,@RequestBody WebSeries wb) {
		repo.deleteById(id);
		wb.setId(id);
		repo.save(wb);
		return wb;
	}

	@DeleteMapping(path = "/delete{id}")
	public String updateStudent(@RequestParam("id") int id) {
		repo.deleteById(id);
		return "Series Removed !";
	}
	
	
	
}
