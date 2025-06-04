package controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Pergunta;
import service.AvaliacaoService;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {
	
	private final AvaliacaoService avaliacaoService;
	
    public AvaliacaoController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }
    
    @GetMapping("/perguntas")
    public ResponseEntity<List<Pergunta>> listarPerguntas() {
        return ResponseEntity.ok(avaliacaoService.gerarPerguntas());
    }
    /*
    @PostMapping("/resposta")
    public ResponseEntity<ResultadoDTO> responder(@RequestBody RespostaDTO respostaDTO) {
    	return ResponseEntity.ok(avaliacaoService.avaliarResposta(respostaDTO));
    } 
*/

}
