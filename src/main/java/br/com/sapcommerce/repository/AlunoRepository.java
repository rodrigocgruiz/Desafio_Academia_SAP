package br.com.sapcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sapcommerce.entity.AlunoEntity;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

}
