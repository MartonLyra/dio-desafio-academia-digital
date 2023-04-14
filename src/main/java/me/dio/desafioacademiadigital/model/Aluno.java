package me.dio.desafioacademiadigital.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Long id;

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDateTime dataDeNascimento;

    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
