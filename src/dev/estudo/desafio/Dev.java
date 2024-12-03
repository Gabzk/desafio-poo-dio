package dev.estudo.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private final String nome;
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public Dev(String nome) {
        this.nome = nome;
    }

    public void InscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
        System.out.println("Você se inscreveu no bootcamp " + bootcamp.getNome());
    }

    public void progredir() {
        try {
            Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
            conteudo.ifPresent(this.conteudosConcluidos::add);
            conteudo.ifPresent(this.conteudosInscritos::remove);
            System.out.println("Você concluiu o conteúdo " + conteudo.map(Conteudo::getTitulo).orElse(""));
        } catch (Exception e) {
            System.err.println("Você não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
