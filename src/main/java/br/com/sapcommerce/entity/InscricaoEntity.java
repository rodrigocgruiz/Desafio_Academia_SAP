package br.com.sapcommerce.entity;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SAPC_ISCRICAO")

public class InscricaoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "aluno_id")
	@Column(nullable = false, unique = true)
	private String aluno_id;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	@Column(nullable = false)
	private String curso_id;
	
	@Column(nullable = false)
	private Date dataInscricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAluno_id() {
		return aluno_id;
	}

	public void setAluno_id(String aluno_id) {
		this.aluno_id = aluno_id;
	}

	public String getCurso_id() {
		return curso_id;
	}

	public void setCurso_id(String curso_id) {
		this.curso_id = curso_id;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aluno_id, curso_id, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InscricaoEntity other = (InscricaoEntity) obj;
		return Objects.equals(aluno_id, other.aluno_id) && Objects.equals(curso_id, other.curso_id)
				&& Objects.equals(id, other.id);
	}

}
