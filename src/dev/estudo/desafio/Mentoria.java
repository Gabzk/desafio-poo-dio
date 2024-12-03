package dev.estudo.desafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Mentoria extends Conteudo {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data.format(FORMATTER) + ", titulo='" + getTitulo() + '\'' + ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP + 40d;
    }
}
