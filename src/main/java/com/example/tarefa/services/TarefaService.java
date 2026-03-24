package com.example.tarefa.services;

import com.example.tarefa.models.TarefaModel;
import com.example.tarefa.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public TarefaModel salvar(TarefaModel tarefa) {
        return repository.save(tarefa);
    }

    public List<TarefaModel> listar() {
        return repository.findAll();
    }

    public TarefaModel buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}