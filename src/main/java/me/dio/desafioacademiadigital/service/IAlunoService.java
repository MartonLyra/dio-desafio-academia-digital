package me.dio.desafioacademiadigital.service;

import me.dio.desafioacademiadigital.model.Aluno;
import me.dio.desafioacademiadigital.model.AvaliacaoFisica;
import me.dio.desafioacademiadigital.model.dto.AlunoDTO;
import me.dio.desafioacademiadigital.model.dto.AlunoUpdateDTO;

import java.util.List;

public interface IAlunoService {


    /**
     * Retorna os Alunos que estão no banco de dados filtrados pela data de nascimento.
     * @return Uma lista os Alunos que estão salvas no DB.
     */
    List<Aluno> getAll(String dataDeNascimento);

}
