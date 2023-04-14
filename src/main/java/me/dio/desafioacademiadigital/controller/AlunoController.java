package me.dio.desafioacademiadigital.controller;

import jakarta.validation.Valid;
import me.dio.desafioacademiadigital.model.Aluno;
import me.dio.desafioacademiadigital.model.AvaliacaoFisica;
import me.dio.desafioacademiadigital.model.dto.AlunoDTO;
import me.dio.desafioacademiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dtNascimento", required = false)
                              String dataDeNacimento) {
        return service.getAll(dataDeNacimento);
    }

    @PostMapping("create")
    public Aluno create(@Valid @RequestBody AlunoDTO alunoDTO) {
        return service.create(alunoDTO);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }




}