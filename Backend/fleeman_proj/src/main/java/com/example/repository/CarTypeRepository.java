package com.example.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Cartype;

public interface CarTypeRepository  extends JpaRepository<Cartype,Integer>{
   
	/*@Query("SELECT c FROM Cartype c WHERE c.hub.Hub_id = :hub_id")
	  List<Cartype> findAllCartypeByHubId(@Param("hub_id") int hub_id);*/
	
	@Query(value = "select * from Cartype where hub_id=:hubId and cartype_id in(select cartype_id from Car where Hub_id=:hubId and is_available=true)", nativeQuery = true)
	List<Cartype> findAllByHubId(@Param("hubId") int hubId);
}