package dto;

public class RespostaDTO {
	
	private int index;
    private String respostaUsuario;
    private long tempoResposta;

    public RespostaDTO() {}

    public RespostaDTO(int index, String respostaUsuario, long tempoResposta) {
        this.index = index;
        this.respostaUsuario = respostaUsuario;
        this.tempoResposta = tempoResposta;
    }

    public int getIndex() {
        return index;
    }

    public String getRespostaUsuario() {
        return respostaUsuario;
    }

    public long getTempoResposta() {
        return tempoResposta;
    }
}
