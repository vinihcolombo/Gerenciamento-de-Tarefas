package com.example.tarefa.controllers;

import com.example.tarefa.models.TarefaModel;
import com.example.tarefa.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @PostMapping
    public TarefaModel salvar(@RequestBody TarefaModel tarefa) {
        return service.salvar(tarefa);
    }

    @GetMapping
    public List<TarefaModel> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public TarefaModel buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}