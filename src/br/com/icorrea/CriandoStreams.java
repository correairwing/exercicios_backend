package br.com.icorrea;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Irwing", "Correa", "Teste").stream();

        Stream<String> set = Set.of("Irwing", "Correa", "Teste").stream();

        Map<String, String> map = Map.of("Irwing", "Correa");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "1234");
    }
}
