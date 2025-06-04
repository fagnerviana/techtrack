package model;

import java.util.List;

public class Pergunta {
	
	private String enunciado;
    private List<String> alternativas;
    private String respostaCorreta;

    
    public Pergunta() {}

    public Pergunta(String enunciado, List<String> alternativas, String respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
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
    
    
    

}
