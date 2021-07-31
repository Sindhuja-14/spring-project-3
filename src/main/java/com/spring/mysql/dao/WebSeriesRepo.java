package com.spring.mysql.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mysql.model.WebSeries;

public interface WebSeriesRepo extends JpaRepository<WebSeries, Integer>{

	List<WebSeries> findAllById(int webseriesid );

	List<WebSeries> findAllByName(String webseriesname);

}
