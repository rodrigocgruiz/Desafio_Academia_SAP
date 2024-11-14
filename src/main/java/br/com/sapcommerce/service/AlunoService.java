package br.com.sapcommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.sapcommerce.dto.AlunoDTO;
import br.com.sapcommerce.repository.AlunoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    public AlunoDTO cadastrarAluno(@RequestBody AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setEmail(alunoDTO.getEmail());
        aluno.setDataCadastro(LocalDate.now());
        alunoRepository.save(aluno);
        return alunoDTO;
    }
}
