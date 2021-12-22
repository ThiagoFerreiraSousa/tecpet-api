package com.tfs.tecpet.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tfs.tecpet.model.entity.AnimalEntity;

@Repository
public interface AnimalDao extends JpaRepository<AnimalEntity, Long>{

}
