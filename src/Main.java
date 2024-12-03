import dev.estudo.desafio.*;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição do curso de Java");
        curso.setCargaHoraria(36);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        try {
            mentoria.setData(sdf.parse("20/05/2023"));
        } catch (Exception e) {
            System.out.println("Erro ao converter data");
        }


    }
}