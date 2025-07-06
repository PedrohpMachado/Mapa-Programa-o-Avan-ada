package org.example.Controller;

import org.example.Model.Animal;
import org.example.Service.AnimalService;

public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {

        this.animalService = animalService;

    }

    public void demonstrarConceitos() {

        Animal AnaMariaBraga = animalService.criarEGravarCachorro("Ana Maria Braga\n");

        animalService.demonstrarSomDoAnimal(AnaMariaBraga.getId());

    }
}