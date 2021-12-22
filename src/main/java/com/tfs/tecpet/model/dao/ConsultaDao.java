package com.tfs.tecpet.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tfs.tecpet.model.entity.ConsultaEntity;

@Repository
public interface ConsultaDao extends JpaRepository<ConsultaEntity, Long>{
	
	

}
