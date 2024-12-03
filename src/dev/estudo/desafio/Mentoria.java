package dev.estudo.desafio;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Mentoria extends Conteudo{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + sdf.format(data) + ", titulo='" + getTitulo() + '\'' + ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP + 40d;
    }
}
