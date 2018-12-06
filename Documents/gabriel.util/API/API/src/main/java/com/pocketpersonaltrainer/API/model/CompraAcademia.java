package com.pocketpersonaltrainer.API.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CompraAcademia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Embeddable
	public static class CompraAcademiaId implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Column(name = "fk_idCompra")
		protected Long compraId;

		@Column(name = "fk_idAcademia")
		protected Long academiaId;

		public CompraAcademiaId() {
			
		}
		
		public CompraAcademiaId(Long compraId, Long academiaId) {
			this.academiaId = academiaId;
			this.compraId = compraId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((compraId == null) ? 0 : compraId.hashCode());
			result = prime * result
					+ ((academiaId == null) ? 0 : academiaId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			
			CompraAcademiaId other = (CompraAcademiaId) obj;
			
			if (compraId == null) {
				if (other.compraId != null)
					return false;
			} else if (!compraId.equals(other.compraId))
				return false;
			
			if (academiaId == null) {
				if (other.academiaId != null)
					return false;
			} else if (!academiaId.equals(other.academiaId))
				return false;
			
			return true;
		}
	}
	
	@EmbeddedId
	private CompraAcademiaId id;
	
	@ManyToOne
	@JoinColumn(name="fk_idCompra", insertable = false, updatable = false)
	private Academia academia;
	@ManyToOne
	@JoinColumn(name="fk_idCompra", insertable = false, updatable = false)
	private Compra compras;	
	
	private Date dtpago;
	private double valor;
	private int status;
	
	//getters & setters
	public Compra getCompras() {
		return compras;
	}
	
	public void setCompras(Compra compras) {
		this.compras = compras;
	}
	
	public Academia getAcademia() {
		return academia;
	}
	
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	
	public Date getDtpago() {
		return dtpago;
	}
	
	public void setDtpago(Date dtpago) {
		this.dtpago = dtpago;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public CompraAcademiaId getId() {
		return id;
	}

	public void setId(CompraAcademiaId id) {
		this.id = id;
	}
	
}
