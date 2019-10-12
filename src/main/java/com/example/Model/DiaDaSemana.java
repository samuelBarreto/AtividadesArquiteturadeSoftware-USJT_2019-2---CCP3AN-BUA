package com.example.Model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DiaDaSemanas")
public class DiaDaSemana {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "DiaDaSemana")
	private Date DiaDaSemana;

	

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDiaDaSemana() {
		return DiaDaSemana;
	}

	public void setDiaDaSemana(Date diaDaSemana) {
		DiaDaSemana = diaDaSemana;
	}


}
