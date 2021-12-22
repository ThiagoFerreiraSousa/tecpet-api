package com.tfs.tecpet.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tfs.tecpet.model.entity.TutorEntity;

@Repository
public interface TutorDao extends JpaRepository<TutorEntity, Long>{
	
	

}
