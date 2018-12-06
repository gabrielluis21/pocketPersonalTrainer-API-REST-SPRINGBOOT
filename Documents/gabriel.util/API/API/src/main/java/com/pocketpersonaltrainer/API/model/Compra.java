package com.pocketpersonaltrainer.API.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Date dtCompra;
	private double valorCompra;
	private Pacote plano;
	
	public Long getId() {
		return id;
	}
		
	public Date getDtCompra() {
		return dtCompra;
	}
	
	public void setDtCompra(Date dtCompra) {
		this.dtCompra = dtCompra;
	}
	
	public double getValorCompra() {
		return valorCompra;
	}
	
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public Pacote getPlano() {
		return plano;
	}
	
	public void setPlano(Pacote plano) {
		this.plano = plano;
	}
	
}
