package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        if (bootcamp == null) {
            throw new IllegalArgumentException("Bootcamp não pode ser nulo");
        }
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return new LinkedHashSet<>(conteudosInscritos);
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        if (conteudosInscritos == null) {
            throw new IllegalArgumentException("Conteúdos inscritos não pode ser nulo");
        }
        this.conteudosInscritos = new LinkedHashSet<>(conteudosInscritos);
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return new LinkedHashSet<>(conteudosConcluidos);
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        if (conteudosConcluidos == null) {
            throw new IllegalArgumentException("Conteúdos concluídos não pode ser nulo");
        }
        this.conteudosConcluidos = new LinkedHashSet<>(conteudosConcluidos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

