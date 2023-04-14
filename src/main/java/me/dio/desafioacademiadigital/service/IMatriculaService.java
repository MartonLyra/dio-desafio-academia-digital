package me.dio.desafioacademiadigital.service;

import me.dio.desafioacademiadigital.model.Matricula;
import me.dio.desafioacademiadigital.model.dto.MatriculaDTO;

import java.util.List;

public interface IMatriculaService {

    /**
     * Cria uma Matrícula e salva no banco de dados.
     * @param matriculaDTO - formulário referente aos dados para criação da Matrícula no banco de dados.
     * @return - Matrícula recém-criada.
     */
    Matricula create(MatriculaDTO matriculaDTO);

    /**
     * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
     * @param id - id da Matrícula que será exibida.
     * @return - Matrícula de acordo com o Id fornecido.
     */
    Matricula get(Long id);

    /**
     * Retorna todas as Matrículas que estão no banco de dados.
     * @return - uma lista com todas as Matrículas que estão salvas no DB.
     */
    List<Matricula> getAll(String bairro);

    /**
     * Deleta uma Matrícula específica.
     * @param id - id da Matrícula que será removida.
     */
    void delete(Long id);


}
