package com.projeto.atividadespring.tarefa.service;

import com.projeto.atividadespring.tarefa.model.Tarefa;
import com.projeto.atividadespring.tarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar(){
        return repository.findAll();
    }

    public Tarefa cadastrar(Tarefa tarefa){
        return repository.save(tarefa);
    }
}
