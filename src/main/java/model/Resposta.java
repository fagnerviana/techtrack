package model;


public class Resposta {
	
	private Integer id;
    Resultado resultado;
    Pergunta pergunta;
    private String alternativa_escolhida;
    private boolean correta;
    
    
    
    
    
	public Resposta() {
		super();
	}
	public Resposta(Integer id, Resultado resultado, Pergunta pergunta, String alternativa_escolhida, boolean correta) {
		super();
		this.id = id;
		this.resultado = resultado;
		this.pergunta = pergunta;
		this.alternativa_escolhida = alternativa_escolhida;
		this.correta = correta;
	}
	
	
	
	@Override
	public String toString() {
		return "Resposta [id=" + id + ", resultado=" + resultado + ", pergunta=" + pergunta + ", alternativa_escolhida="
				+ alternativa_escolhida + ", correta=" + correta + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	public Pergunta getPergunta() {
		return pergunta;
	}
	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	public String getAlternativa_escolhida() {
		return alternativa_escolhida;
	}
	public void setAlternativa_escolhida(String alternativa_escolhida) {
		this.alternativa_escolhida = alternativa_escolhida;
	}
	public boolean isCorreta() {
		return correta;
	}
	public void setCorreta(boolean correta) {
		this.correta = correta;
	}
    
    
	

}
