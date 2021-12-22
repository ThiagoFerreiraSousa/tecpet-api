package com.tfs.tecpet.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tfs.tecpet.model.entity.VeterinarioEntity;

@Repository
public interface VeterinarioDao extends JpaRepository<VeterinarioEntity, Long>{
	
	

}
