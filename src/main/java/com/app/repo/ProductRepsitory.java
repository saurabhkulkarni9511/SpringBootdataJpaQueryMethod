package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepsitory extends JpaRepository<Product, Integer>{

	@Query("select p from com.app.model.Product p")
	public List<Product> getMyData();

	@Query("select p.prodCost from com.app.model.Product p")
	public List<Double> getCostOnly();

	@Query("select p.prodCost,p.prodCode from com.app.model.Product p")
	public List<Object[]> getInfo();

	//--passing parameters 
	//--positional parameters ?1,?2,?3
	@Query("select p from com.app.model.Product p where p.prodId=?1 or p.prodCost<?2")
	public List<Product> getNewData(Integer pid,Double cost);

	//--named parameter--
	@Query("select p from com.app.model.Product p where p.prodId=:a or p.prodCost=:b")
	public List<Product> getMyDataName(Integer a,Double b);
}

