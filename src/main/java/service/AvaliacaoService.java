package service;

//Trataremos aqui tudo que vem do front para o repositorio

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import dto.ResultadoDTO;
import enumeration.TipoNivelPergunta;
import factory.PerguntaFactory;
import model.Pergunta;




public class AvaliacaoService {
	
	private final Map<Pergunta, TipoNivelPergunta> mapaPerguntas;
    private final List<Pergunta> listaPerguntas;

    public AvaliacaoService() {
        this.mapaPerguntas = PerguntaFactory.gerarPerguntas();
        this.listaPerguntas = new ArrayList<>(mapaPerguntas.keySet());
        Collections.shuffle(listaPerguntas);
    }

    public List<Pergunta> gerarPerguntas() {
        return listaPerguntas;
    }

    /*
    public ResultadoDTO avaliarResposta(ResultadoDTO respostaDTO) {
        Pergunta pergunta = listaPerguntas.get(respostaDTO.getExperienciagetIndex());
        String respostaCorreta = pergunta.getRespostaCorreta();
        String respostaUsuario = respostaDTO.getRespostaUsuario();

        int experiencia = 0;
        int interesse = 0;

        Nivel nivel = mapaPerguntas.get(pergunta);
        int peso = switch (nivel) {
            case FACIL -> 10;
            case MEDIO -> 20;
            case DIFICIL -> 30;
        };

        if (respostaUsuario.equalsIgnoreCase(respostaCorreta)) {
            experiencia += peso;
            if (respostaDTO.getTempoResposta() > 8) {
                interesse += peso;
                experiencia -= 5;
            } else {
                interesse += peso + 5;
            }
        } else {
            experiencia -= 5;
            if (respostaDTO.getTempoResposta() > 8) {
                interesse += peso;
            } else {
                interesse -= 5;
            }
        }

        String nivelConhecimento = experiencia < 60 ? "Iniciante"
                : experiencia < 160 ? "Intermediário" : "Avançado";

        String nivelInteresse = interesse < 60 ? "Baixo"
                : interesse < 160 ? "Moderado" : "Alto";

        return new ResultadoDTO(experiencia, interesse, nivelConhecimento, nivelInteresse);
    }
*/

}
