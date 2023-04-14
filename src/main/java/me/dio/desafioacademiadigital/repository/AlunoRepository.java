package me.dio.desafioacademiadigital.repository;

import me.dio.desafioacademiadigital.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    /**
     *
     * @param dtNascimento: data de nascimento dos alunos
     * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
     */
    List<Aluno> findByDtNascimento(LocalDate dtNascimento);


}
