package dto;

public class ResultadoDTO {
	private int experiencia;
    private int interesse;
    private String nivelConhecimento;
    private String nivelInteresse;

    public ResultadoDTO() {}

    public ResultadoDTO(int experiencia, int interesse, String nivelConhecimento, String nivelInteresse) {
        this.experiencia = experiencia;
        this.interesse = interesse;
        this.nivelConhecimento = nivelConhecimento;
        this.nivelInteresse = nivelInteresse;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getInteresse() {
        return interesse;
    }

    public String getNivelConhecimento() {
        return nivelConhecimento;
    }

    public String getNivelInteresse() {
        return nivelInteresse;
    }
}
