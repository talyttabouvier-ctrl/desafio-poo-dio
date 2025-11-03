package model;

/**
 * Classe abstrata que representa um conteúdo genérico.
 * Definimos o comportamento comum (título, descrição)
 * e um método abstrato calcularXp() que as subclasses devem implementar.
 */
public abstract class Conteudo {
    // valor base de XP para qualquer conteúdo
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // cada tipo de conteúdo define como calcular seu XP
    public abstract double calcularXp();

    // getters e setters (encapsulamento)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{titulo='" + titulo + "', descricao='" + descricao + "'}";
    }
}
