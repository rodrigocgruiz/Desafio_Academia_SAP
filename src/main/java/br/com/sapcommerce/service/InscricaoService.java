package br.com.sapcommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.sapcommerce.repository.InscricaoRepository;
import br.com.sapcommerce.dto.*;

@RestController
@RequestMapping("/api/inscricoes")
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @PostMapping
    public InscricaoDTO inscreverAluno(@RequestParam Long alunoId, @RequestParam Long cursoId) {
        Aluno aluno = alunoRepository.findById(alunoId).orElseThrow();
        Curso curso = cursoRepository.findById(cursoId).orElseThrow();
        Inscricao inscricao = new Inscricao();
        inscricao.setAluno(aluno);
        inscricao.setCurso(curso);
        inscricao.setDataInscricao(LocalDate.now());
        inscricaoRepository.save(inscricao);
        return new InscricaoDTO(inscricao);
    }
}

