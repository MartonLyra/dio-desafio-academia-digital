package me.dio.desafioacademiadigital.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data                   // Lombok
@NoArgsConstructor          // Lombok: para criar um construtor vazio
@AllArgsConstructor         // Lombok: para criar outro contrutor com todas as propriedades
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})      // Não queremos repetidas notificações no console de que o carregamento dos objetos relacionados são do tipo LAZY.
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private Long id;

    @Column(name = "nome_aluno")
    private String nome;

    @Column(name = "cpf_aluno", unique = true)
    private String cpf;

    @Column(name = "bairro_aluno")
    private String bairro;


    @Column(name = "dt_nascimento_aluno")
    private LocalDate dtNascimento;


    // OneToMany-mappedBy: ao fazer mapeamento, informar o atributo da classe mapeada (AvaliacaoFisica) que é do tipo da atual classe (Aluno).
    // OneToMany-fetch: se quer trazer as informações relacionadas quando esse objeto for carregado (FetchType.EAGER) ou apenas quando solicitado implicitamente (FetchType.LAZY).
    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
