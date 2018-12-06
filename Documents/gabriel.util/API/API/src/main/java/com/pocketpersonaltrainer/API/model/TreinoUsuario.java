package com.pocketpersonaltrainer.API.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TreinoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Embeddable
	public static class TreinoUsuarioId implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Column(name = "fk_idUsuario")
		protected Long usuarioId;

		@Column(name = "fk_idTreino")
		protected Long treinoId;

		public TreinoUsuarioId() {
			
		}
		
		public TreinoUsuarioId(Long usuarioId, Long treinoId) {
			this.usuarioId = usuarioId;
			this.treinoId = treinoId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((usuarioId == null) ? 0 : usuarioId.hashCode());
			result = prime * result
					+ ((treinoId == null) ? 0 : treinoId.hashCode());
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
			
			TreinoUsuarioId other = (TreinoUsuarioId) obj;
			
			if (usuarioId == null) {
				if (other.usuarioId != null)
					return false;
			} else if (!usuarioId.equals(other.usuarioId))
				return false;
			
			if (treinoId == null) {
				if (other.treinoId != null)
					return false;
			} else if (!treinoId.equals(other.treinoId))
				return false;
			
			return true;
		}
	}
	@EmbeddedId
	private TreinoUsuarioId id;	
	
	@ManyToOne
	@JoinColumn()
	private Usuario user;
	@ManyToOne
	@JoinColumn()
	private Treino treino;
	
	private int feitos;
	private Date dtAgendado;
	
	public Usuario getUser() {
		return user;
	}
	
	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public Treino getTreino() {
		return treino;
	}
	
	public void setTreino(Treino treino) {
		this.treino = treino;
	}
	
	public int getFeitos() {
		return feitos;
	}
	
	public void setFeitos(int feitos) {
		this.feitos = feitos;
	}
	
	public Date getDtAgendado() {
		return dtAgendado;
	}
	
	public void setDtAgendado(Date dtAgendado) {
		this.dtAgendado = dtAgendado;
	}

	public TreinoUsuarioId getId() {
		return id;
	}

	public void setId(TreinoUsuarioId id) {
		this.id = id;
	}

}
