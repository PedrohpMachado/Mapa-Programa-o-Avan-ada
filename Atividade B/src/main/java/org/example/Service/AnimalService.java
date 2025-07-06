package org.example.Service;

import org.example.Model.Animal;
import org.example.Model.Cachorro;
import org.example.Repository.AnimalRepository;

public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {

        this.animalRepository = animalRepository;

    }

    public Animal criarEGravarCachorro(String nome) {

        System.out.println("Criando um novo cachorro com nome: " + nome);
        Cachorro novoCachorro = new Cachorro(nome);

        return animalRepository.save(novoCachorro);

    }

    public void demonstrarSomDoAnimal(Long id) {

        System.out.println("Animal com ID: " + id);
        animalRepository.findById(id).ifPresentOrElse(
                animal -> animal.fazerSom(),

                () -> System.out.println("Animal com ID " + id + " não encontrado.")

        );
    }
}