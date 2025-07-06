package org.example.Model;

public class Cachorro extends Animal {


    public Cachorro(String nome) {

        super(nome);

    }


    @Override
    public void fazerSom() {

        System.out.println(getNome() + "Barulho: Au au");

    }
}