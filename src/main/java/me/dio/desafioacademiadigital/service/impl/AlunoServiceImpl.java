package me.dio.desafioacademiadigital.service.impl;


import me.dio.desafioacademiadigital.infra.DateTimeUtils;
import me.dio.desafioacademiadigital.model.Aluno;
import me.dio.desafioacademiadigital.model.AvaliacaoFisica;
import me.dio.desafioacademiadigital.model.dto.AlunoDTO;
import me.dio.desafioacademiadigital.model.dto.AlunoUpdateDTO;
import me.dio.desafioacademiadigital.repository.AlunoRepository;
import me.dio.desafioacademiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {


    @Autowired
    private AlunoRepository repository = null;

    @Override
    public Aluno create(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setBairro(alunoDTO.getBairro());
        aluno.setDtNascimento(alunoDTO.getDtNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Aluno> getAll(String dtNascimento) {
        if(dtNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = DateTimeUtils.convertStringToLocalDate(dtNascimento);
            return repository.findByDtNascimento(localDate);
        }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDTO alunoUpdateDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    // Retorna todas as avalizações físicas do aluno:
    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();

    }



}
