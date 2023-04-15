package me.dio.desafioacademiadigital.service.impl;

import me.dio.desafioacademiadigital.model.Aluno;
import me.dio.desafioacademiadigital.model.AvaliacaoFisica;
import me.dio.desafioacademiadigital.model.dto.AvaliacaoFisicaDTO;
import me.dio.desafioacademiadigital.model.dto.AvaliacaoFisicaUpdateDTO;
import me.dio.desafioacademiadigital.repository.AlunoRepository;
import me.dio.desafioacademiadigital.repository.AvaliacaoFisicaRepository;
import me.dio.desafioacademiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;


    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisicaDTO) {

        Optional<Aluno> optAluno = alunoRepository.findById(avaliacaoFisicaDTO.getAlunoId());

        // Se não encontrar um aluno:
        if (!optAluno.isPresent())
        {
            System.out.println("Nenhum aluno foi encontrado com id=" + avaliacaoFisicaDTO.getAlunoId());
            return null;
        }

        Aluno aluno = optAluno.get();
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setAltura(avaliacaoFisicaDTO.getAltura());
        avaliacaoFisica.setPeso(avaliacaoFisicaDTO.getPeso());

        // Salvando avaliação em banco de dados:
        avaliacaoFisicaRepository.save(avaliacaoFisica);
        return avaliacaoFisica;


        // Atenção: como boa prática, o certo é retornar uma view apenas com os campos desejados.
        //   Isso porque, caso exista algum campo sigiloso como um token ou senha, não queremos esse dado retornado ao front-end.
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO avaliacaoFisicaUpdateDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
