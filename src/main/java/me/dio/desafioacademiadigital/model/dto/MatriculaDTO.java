package me.dio.desafioacademiadigital.model.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaDTO {

    @NotNull(message = "Favor especificar o id do aluno corretamente")
    @Positive(message = "O id do aluno precisa ser positivo")
    private Long alunoId;
}
