package com.example.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity // This tells Hibernate to make a table out of this class
public class DiaDaSemana {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private Date  DiaDaSemana;

    @OneToOne(mappedBy = "diadasemana")
    private Tempo tempo;
    
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
