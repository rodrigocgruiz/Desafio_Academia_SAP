package br.com.sapcommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.sapcommerce.dto.CursoDTO;
import br.com.sapcommerce.repository.CursoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public CursoDTO cadastrarCurso(@RequestBody CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setNome(cursoDTO.getNome());
        curso.setDescricao(cursoDTO.getDescricao());
        curso.setDataCriacao(LocalDate.now());
        cursoRepository.save(curso);
        return cursoDTO;
    }

}
