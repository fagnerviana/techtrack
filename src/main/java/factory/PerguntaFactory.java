package factory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import enumeration.TipoNivelPergunta;
import model.Pergunta;


public class PerguntaFactory {
	
	

    public static Map<Pergunta, TipoNivelPergunta> gerarPerguntas() {
        Map<Pergunta, TipoNivelPergunta> perguntas = new HashMap<>();

        perguntas.put(new Pergunta("O que é uma variável?",
                Arrays.asList("Um tipo de dado", "Um local na memória", "Um operador", "Um compilador"),
                "Um local na memória"), TipoNivelPergunta.FACIL);

        perguntas.put(new Pergunta("O que é um loop?",
                Arrays.asList("Uma estrutura de repetição", "Um tipo de variável", "Uma exceção", "Um operador lógico"),
                "Uma estrutura de repetição"), TipoNivelPergunta.FACIL);

        perguntas.put(new Pergunta("Qual a função de um banco de dados?",
                Arrays.asList("Compilar código", "Armazenar dados", "Renderizar gráficos", "Enviar emails"),
                "Armazenar dados"), TipoNivelPergunta.FACIL);

        perguntas.put(new Pergunta("O que significa 'POO'?",
                Arrays.asList("Programação Orientada a Objetos", "Programa Online Operacional", "Processador Operacional Ótimo", "Plano Operacional de Objetos"),
                "Programação Orientada a Objetos"), TipoNivelPergunta.FACIL);

        perguntas.put(new Pergunta("O que é um array?",
                Arrays.asList("Um tipo de laço", "Uma lista de elementos", "Um compilador", "Uma exceção"),
                "Uma lista de elementos"), TipoNivelPergunta.FACIL);

        perguntas.put(new Pergunta("O que é um algoritmo?",
                Arrays.asList("Sequência de passos para resolver um problema", "Erro de sistema", "Software gráfico", "Banco de dados"),
                "Sequência de passos para resolver um problema"), TipoNivelPergunta.MEDIO);

        perguntas.put(new Pergunta("O que é uma função?",
                Arrays.asList("Um comando que repete código", "Um bloco de código que executa uma tarefa", "Uma variável especial", "Uma exceção"),
                "Um bloco de código que executa uma tarefa"), TipoNivelPergunta.MEDIO);

        perguntas.put(new Pergunta("O que significa API?",
                Arrays.asList("Área de Programação Interna", "Aplicação para Internet", "Interface de Programação de Aplicações", "Análise de Programa Integrado"),
                "Interface de Programação de Aplicações"), TipoNivelPergunta.MEDIO);

        perguntas.put(new Pergunta("O que é uma classe em POO?",
                Arrays.asList("Um tipo de dado simples", "Uma função matemática", "Uma estrutura que define objetos", "Um banco de dados"),
                "Uma estrutura que define objetos"), TipoNivelPergunta.DIFICIL);

        perguntas.put(new Pergunta("O que é encapsulamento?",
                Arrays.asList("Ocultar detalhes internos do objeto", "Executar código em paralelo", "Compartilhar dados livremente", "Conectar-se à internet"),
                "Ocultar detalhes internos do objeto"), TipoNivelPergunta.DIFICIL);

        return perguntas;
    }
}