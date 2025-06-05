package model;


public class Alternativas {
	
	
	private Integer id;
	Pergunta pergunta;
	private String texto;
	
		
	public Alternativas() {
		super();
	}
	public Alternativas(Integer id, Pergunta pergunta, String texto) {
		super();
		this.id = id;
		this.pergunta = pergunta;
		this.texto = texto;
	}
		
	@Override
	public String toString() {
		return "Alternativas [id=" + id + ", pergunta=" + pergunta + ", texto=" + texto + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pergunta getPergunta() {
		return pergunta;
	}
	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
}
