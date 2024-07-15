package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser nulo ou vazio");
        }
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia");
        }
        this.descricao = descricao;
    }
}

