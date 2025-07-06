package org.example.Model;

public abstract class Animal {

    private Long id;
    private String nome;

    public Animal(String nome) {

        this.nome = nome;

    }

    public abstract void fazerSom();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
}