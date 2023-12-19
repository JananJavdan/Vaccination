package intecbrussel.be.Vaccination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter();


        for (int i = 1; i < 10; i++) {

            //  Animal(true, 6, "cat", 3);
            Dog dog = new Dog(Map< Disease.FLUE, false >, 3, "dog", 5, false);
            Cat cat = new Cat(Map< Disease.POLIO, false >, 8, "cat", 3, true);
            Monkey monkey = new Monkey(Map< Disease.HEPATITISA, false >, 9, "monkey", 2, true);
        }
        Map<Disease, Boolean> map = new HashMap<>();
        map.put(Disease.HEPATITISA, true);
        map.put(Disease.FLUE, true);
        map.put(Disease.POLIO, true);
        map.put(Disease.CHICKENPOCKS, true);

        List<Animal> animalList = new ArrayList<>();
        // animalList.add(3, "cat");
        animalList.add(1, animalShelter.findAnimal("dog"));
        animalList.add(5, animalShelter.findAnimal("cat"));
        animalList.add(2, animalShelter.findAnimal("monkey"));


        animalShelter.sortAnimals();
        animalShelter.printAnimals();

        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimals();

        animalShelter.sortAnimalsByName();
        animalShelter.printAnimals();

        animalShelter.findAnimal("cat");
        animalShelter.findAnimal(3);

        animalShelter.findOldestAnimal();
        animalShelter.printAnimals();

        animalShelter.treatAllAnimals();
        animalShelter.printAnimals();

        animalShelter.treatAnimal("dog");
        animalShelter.printAnimals();

        animalShelter.treatAnimal(5);
        animalShelter.printAnimals();

        animalShelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        animalShelter.printAnimalsNotVaccinated(Disease.FLUE);
        animalShelter.printAnimals();

        animalShelter.countAnimals();


    }
}

