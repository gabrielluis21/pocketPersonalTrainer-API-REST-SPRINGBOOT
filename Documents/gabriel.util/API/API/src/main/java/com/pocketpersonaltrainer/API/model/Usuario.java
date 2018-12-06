package com.pocketpersonaltrainer.API.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private double altura;
	private double peso;
	private int ativo;
	private double valorMensalidade;
	private Date dtVencimentoMensalidade;
	private int statusMensalidade;
	private String uriFotoPerfil;
	private Academia academia;
	
	//getters & setters
	
	public int getAtivo() {
		return ativo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Long getId() {
		return id;
	}
	public double getValorMensalidade() {
		return valorMensalidade;
	}
	
	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public Date getDtVencimento() {
		return dtVencimentoMensalidade;
	}
	
	public void setDtVencimentoMensalidade(Date dtVencimentoMensalidade) {
		this.dtVencimentoMensalidade = dtVencimentoMensalidade;
	}
	
	public int getStatusMensalidade() {
		return statusMensalidade;
	}
	
	public void setStatusMensalidade(int statusMensalidade) {
		this.statusMensalidade = statusMensalidade;
	}
	
	public String getUriFotoPerfil() {
		return uriFotoPerfil;
	}

	public void setUriFotoPerfil(String uriFotoPerfil) {
		this.uriFotoPerfil = uriFotoPerfil;
	}

	public Date getDtVencimentoMensalidade() {
		return dtVencimentoMensalidade;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	
}
