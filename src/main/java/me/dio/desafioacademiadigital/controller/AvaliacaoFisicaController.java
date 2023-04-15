package me.dio.desafioacademiadigital.controller;

import me.dio.desafioacademiadigital.model.AvaliacaoFisica;
import me.dio.desafioacademiadigital.model.dto.AvaliacaoFisicaDTO;
import me.dio.desafioacademiadigital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;


    @PostMapping("/create")
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
        return service.create(avaliacaoFisicaDTO);
    }
}
