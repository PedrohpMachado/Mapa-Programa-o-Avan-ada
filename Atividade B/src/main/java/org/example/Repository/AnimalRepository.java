package org.example.Repository;

import org.example.Model.Animal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class AnimalRepository {

    private final Map<Long, Animal> database = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(0);

    public Animal save(Animal animal) {
        if (animal.getId() == null) {
            animal.setId(idGenerator.incrementAndGet());
        }
        database.put(animal.getId(), animal);
        System.out.println("Salvando " + animal.getClass().getSimpleName() + " com ID " + animal.getId());
        return animal;
    }

    public Optional<Animal> findById(Long id) {
        System.out.println("Buscando animal com ID " + id);
        return Optional.ofNullable(database.get(id));
    }
}