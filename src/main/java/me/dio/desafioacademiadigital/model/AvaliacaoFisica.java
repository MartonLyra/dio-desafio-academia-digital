package me.dio.desafioacademiadigital.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data                   // Lombok
@NoArgsConstructor          // Lombok: para criar um construtor vazio
@AllArgsConstructor         // Lombok: para criar outro contrutor com todas as propriedades
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avaliacao")
    private Long id;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_aluno_id")           // Especifica qual o nome da coluna na presente tabela que fará relacionamento com Aluno.
    private Aluno aluno;


    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();


    private double peso;


    private double altura;

}
