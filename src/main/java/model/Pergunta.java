package model;

import java.util.List;

import enumeration.TipoNivelPergunta;


public class Pergunta {
	
	private Integer id;
	private String enunciado;
    private List<String> alternativas;
    private String respostaCorreta;
    TipoNivelPergunta tipoNivelPergunta;
    
       
	public Pergunta() {
		super();
	}
	public Pergunta(Integer id, String enunciado, List<String> alternativas, String respostaCorreta,
			TipoNivelPergunta tipoNivelPergunta) {
		super();
		this.id = id;
		this.enunciado = enunciado;
		this.alternativas = alternativas;
		this.respostaCorreta = respostaCorreta;
		this.tipoNivelPergunta = tipoNivelPergunta;
	}
	
	
	
	
	public Pergunta(String enunciado, List<String> alternativas, String respostaCorreta,
			TipoNivelPergunta tipoNivelPergunta) {
		super();
		this.enunciado = enunciado;
		this.alternativas = alternativas;
		this.respostaCorreta = respostaCorreta;
		this.tipoNivelPergunta = tipoNivelPergunta;
	}
	public Pergunta(String string, List<String> asList, String string2) {
		
	}
	@Override
	public String toString() {
		return "Pergunta [id=" + id + ", enunciado=" + enunciado + ", alternativas=" + alternativas
				+ ", respostaCorreta=" + respostaCorreta + ", tipoNivelPergunta=" + tipoNivelPergunta + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public List<String> getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}
	public String getRespostaCorreta() {
		return respostaCorreta;
	}
	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}
	public TipoNivelPergunta getTipoNivelPergunta() {
		return tipoNivelPergunta;
	}
	public void setTipoNivelPergunta(TipoNivelPergunta tipoNivelPergunta) {
		this.tipoNivelPergunta = tipoNivelPergunta;
	}

        
    

}
