package org.example;

import org.example.Controller.AnimalController;
import org.example.Repository.AnimalRepository;
import org.example.Service.AnimalService;

public class Main {

    public static void main(String[] args) {

        AnimalRepository repository = new AnimalRepository();

        AnimalService service = new AnimalService(repository);

        AnimalController controller = new AnimalController(service);

        controller.demonstrarConceitos();

    }
}