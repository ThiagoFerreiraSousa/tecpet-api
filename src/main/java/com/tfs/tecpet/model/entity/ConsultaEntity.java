package com.tfs.tecpet.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tfs.tecpet.model.enums.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "consulta", schema = "pettec")
public class ConsultaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "data_consulta")
//	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private Date dataConsulta;

	@Column(name = "status")
	@Enumerated(value = EnumType.STRING)
	private StatusEnum status;
	
	@JoinColumn(name = "id_veterinario")
	@ManyToOne
	private VeterinarioEntity veterinario;
	
	@JoinColumn(name = "id_animal")
	@ManyToOne
	private AnimalEntity animal;

}
