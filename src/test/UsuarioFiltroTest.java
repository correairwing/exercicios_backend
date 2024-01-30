package test;

import exercicio.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class UsuarioFiltroTest {

    @Test
    public void testFiltrarMulheres() {
        List<Pessoa> usuarios = Arrays.asList(
                new Pessoa("Brenda", "F"),
                new Pessoa("Irwing", "M"),
                new Pessoa("Julia", "F"),
                new Pessoa("Adelle", "F"),
                new Pessoa("Nicolas", "M")
        );

        List<Pessoa> mulheres = UsuarioFiltro.filtrarMulheres(usuarios);

        assertTrue(mulheres.stream().allMatch(list -> list.getSexo().equalsIgnoreCase("F")),
                "A lista deve conter apenas mulheres");
    }
}

