package me.dio.desafioacademiadigital.model;

import java.time.LocalDateTime;

public class Matricula {

    private Long id;

    private Aluno aluno;

    private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
