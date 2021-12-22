package com.tfs.tecpet.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.tfs.tecpet.model.enums.StatusEnum;

import lombok.Data;

@Data
@Entity
@Table(name = "consulta", schema = "tecpet")
public class ConsultaEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data_consulta")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)	
	private LocalDate dataConsulta;

	@Column(name = "status")
	@Enumerated (value = EnumType.STRING)
	private StatusEnum status;	
				
}
