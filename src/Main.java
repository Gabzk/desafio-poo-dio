import dev.estudo.desafio.Bootcamp;
import dev.estudo.desafio.Curso;
import dev.estudo.desafio.Dev;
import dev.estudo.desafio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Dev dev = new Dev("Gabriel");

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição do curso de Java");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");

        try {
            mentoria.setData(LocalDate.parse("10/10/2022", formatter));
        } catch (Exception e) {
            System.out.println("Erro ao converter data");
        }

        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Java Developer",
                "Descrição Bootcamp Java Developer",
                Set.of(curso, mentoria)
        );

        dev.InscreverBootcamp(bootcamp);
        dev.progredir();
        dev.progredir();
        System.out.println("XP: " + dev.calcularTotalXp());

    }
}