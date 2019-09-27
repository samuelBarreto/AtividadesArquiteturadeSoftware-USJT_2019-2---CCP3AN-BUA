package com.example.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Tempo {
	
	 	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 	@Column(name = "id")
	    private long id;	  
	 	 
	 	private String descrição;
	 	
        private  double temperaturaminima;
	 	
	 	private double temperaturamaxima;
	 	
	 	private double humidaderelativadoar;
	 	
	 	private double latitude;
	 	
	 	private double longitude;
	 	
	 	@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "tempo_id", referencedColumnName = "id")
	    private DiaDaSemana diadasemana;
	 	
	 	public String getDescrição() {
			return descrição;
		}


		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}


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

}
