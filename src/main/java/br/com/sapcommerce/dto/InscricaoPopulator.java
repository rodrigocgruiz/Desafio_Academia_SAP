package br.com.sapcommerce.dto;

import org.springframework.beans.BeanUtils;
import br.com.sapcommerce.entity.AlunoEntity;
import br.com.sapcommerce.entity.CursoEntity;

public class InscricaoPopulator {
	
    
	public void AlunoDTO(AlunoEntity aluno) {
		BeanUtils.copyProperties(aluno, this);
	}
	
	public void CursoDTO(CursoEntity curso) {
		BeanUtils.copyProperties(curso, this);
		
	}
}


