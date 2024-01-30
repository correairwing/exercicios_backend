package test;

import exercicio.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioFiltro {
    public static List<Pessoa> filtrarMulheres(List<Pessoa> usuarios) {
        return usuarios.stream()
                .filter(u -> u.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());
    }
}
