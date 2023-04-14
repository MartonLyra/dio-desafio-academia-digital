package me.dio.desafioacademiadigital.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AlunoTest {

    @Test
    void testLombok() {

        // Testando framework Lombok:
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Marton Lyra");
        aluno1.setCpf("12345678901");

        Assertions.assertEquals("Marton Lyra", aluno1.getNome());
        Assertions.assertEquals("12345678901", aluno1.getCpf());

        Aluno aluno2 = new Aluno();
        Assertions.assertNotEquals(aluno1, aluno2);

        Assertions.assertNotEquals(aluno1.hashCode(), aluno2.hashCode());

        System.out.println("Aluno.toString(): " + aluno1);
    }

}
