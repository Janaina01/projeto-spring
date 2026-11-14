package com.projeto.atividadespring.tarefa.repository;

import com.projeto.atividadespring.tarefa.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Long> {

}
