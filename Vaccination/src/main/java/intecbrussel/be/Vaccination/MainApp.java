package intecbrussel.be.Vaccination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter();


       // for (int i = 1; i < 10; i++) {

            Map<Disease, Boolean> dogDisease = new HashMap<>();
            dogDisease.put(Disease.FLUE, true);
            Dog dog1 = new Dog(dogDisease,true, 3, "dog1", 1, false);
            Dog dog2 = new Dog(dogDisease, true, 4, "dog2", 2, false);
            Dog dog3 = new Dog(dogDisease, true, 5, "dog3", 3, false);
            animalShelter.addAnimal(dog1);
            animalShelter.addAnimal(dog2);
            animalShelter.addAnimal(dog3);

            Map<Disease, Boolean> catDisease = new HashMap<>();
            catDisease.put(Disease.POLIO, true);
            Cat cat1 = new Cat(catDisease, true, 8, "cat1", 4, false);
            Cat cat2 = new Cat(catDisease, true, 4, "cat2", 5, false);
            Cat cat3 = new Cat(catDisease, true, 9, "cat3", 6, false);
            animalShelter.addAnimal(cat1);
            animalShelter.addAnimal(cat2);
            animalShelter.addAnimal(cat3);

            Map<Disease, Boolean> monkeyDisease = new HashMap<>();
            dogDisease.put(Disease.CHICKENPOCKS, true);
            Monkey monkey1 = new Monkey(monkeyDisease, false, 10, "monkey1", 7, true);
            Monkey monkey2 = new Monkey(monkeyDisease, true, 5, "monkey2", 8, false);
            Monkey monkey3 = new Monkey(monkeyDisease, false, 2, "monkey3", 9, true);
            Monkey monkey4 = new Monkey(monkeyDisease, false, 6, "monkey4", 10, true);
            animalShelter.addAnimal(monkey1);
            animalShelter.addAnimal(monkey2);
            animalShelter.addAnimal(monkey3);
            animalShelter.addAnimal(monkey4);




        System.out.println("sorted animal: ");
        animalShelter.sortAnimals();
        animalShelter.printAnimals();


        System.out.println("sorted animal by age: ");
        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimals();

        System.out.println("sorted animal by name: ");
        animalShelter.sortAnimalsByName();
        animalShelter.printAnimals();

        System.out.println("find animal by number: ");
        animalShelter.findAnimal("cat");
        animalShelter.findAnimal(3);

        System.out.println("find oldest animal: ");
        animalShelter.findOldestAnimal();
        animalShelter.printAnimals();

        System.out.println("find treat all animals: ");
        animalShelter.treatAllAnimals();
        animalShelter.printAnimals();

        System.out.println("find treat animal by name: ");
        animalShelter.treatAnimal("dog1");
        animalShelter.treatAnimal("monkey4");
        animalShelter.treatAnimal("cat3");
        animalShelter.printAnimals();

        System.out.println("find treat animal by number: ");
        animalShelter.treatAnimal(5);
        animalShelter.printAnimals();

        System.out.println("print animal is not vaccinated: ");
        animalShelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        animalShelter.printAnimalsNotVaccinated(Disease.FLUE);

        System.out.println("print count animal: ");
        animalShelter.countAnimals();


    }
}

