package model;

//As nossas entity 

import java.util.Date;

public class Resultado {
	
	private Integer id;
	Aluno aluno;
	private Integer experiencia;
	private Integer interesse;
	Date date;
	
	
	
	
	
	public Resultado() {
		super();
	}
	public Resultado(Integer id, Aluno aluno, Integer experiencia, Integer interesse, Date date) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.experiencia = experiencia;
		this.interesse = interesse;
		this.date = date;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Resultado [id=" + id + ", aluno=" + aluno + ", experiencia=" + experiencia + ", interesse=" + interesse
				+ ", date=" + date + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Integer getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}
	public Integer getInteresse() {
		return interesse;
	}
	public void setInteresse(Integer interesse) {
		this.interesse = interesse;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	

}
