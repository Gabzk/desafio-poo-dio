package dev.estudo.desafio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria + "H, titulo='" + getTitulo() + '\'' + ", descricao='" + getDescricao() + '\'' +
                '}';
    }
}
