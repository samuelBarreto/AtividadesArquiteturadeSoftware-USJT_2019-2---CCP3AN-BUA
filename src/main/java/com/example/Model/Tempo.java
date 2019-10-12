package com.example.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tempos")
public class Tempo {
	
	 	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 	@Column(name = "id")
	    private long id;	  
	 	 
	 	private String descricaoo;
	 	
        private  double temperaturaminima;
	 	
	 	private double temperaturamaxima;
	 	
	 	private double humidaderelativadoar;
	 	
	 	private double latitude;
	 	
	 	private double longitude;
	 	
		 @OneToOne(fetch = FetchType.LAZY,
		            cascade = {
		                CascadeType.PERSIST,
		                CascadeType.MERGE
		            })
		    @JoinTable(name = "DiaDaSemana",
		            joinColumns = { @JoinColumn(name = "tempo_id") },
		            inverseJoinColumns = { @JoinColumn(name = "dia_id") })
		    private DiaDaSemana semanas = new DiaDaSemana();
	 	
	   
	 	
	 

		public double getTemperaturaminima() {
			return temperaturaminima;
		}


		public void setTemperaturaminima(double temperaturaminima) {
			this.temperaturaminima = temperaturaminima;
		}


		public double getTemperaturamaxima() {
			return temperaturamaxima;
		}


		public void setTemperaturamaxima(double temperaturamaxima) {
			this.temperaturamaxima = temperaturamaxima;
		}


		public double getHumidaderelativadoar() {
			return humidaderelativadoar;
		}


		public void setHumidaderelativadoar(double humidaderelativadoar) {
			this.humidaderelativadoar = humidaderelativadoar;
		}


		public double getLatitude() {
			return latitude;
		}


		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}


		public double getLongitude() {
			return longitude;
		}


		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
	 	
	 	
	 	public long getId() {
			return id;
		}


		public String getDescricaoo() {
			return descricaoo;
		}


		public void setDescricaoo(String descricaoo) {
			this.descricaoo = descricaoo;
		}
		
	
}
