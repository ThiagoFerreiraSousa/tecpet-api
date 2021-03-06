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

import com.tfs.tecpet.model.enums.EspecieEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "animal", schema = "pettec")
public class AnimalEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "especie")
	@Enumerated(value = EnumType.STRING)
	private EspecieEnum especie;

	@Column(name = "raca")
	private String raca;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@JoinColumn(name = "id_tutor")
	@ManyToOne
	private TutorEntity tutor;

}
