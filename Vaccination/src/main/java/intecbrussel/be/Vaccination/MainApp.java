package intecbrussel.be.Vaccination;


import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        AnimalShelter animalShelter = new AnimalShelter();


            Map<Disease, Boolean> dogDisease = new HashMap<>();
            dogDisease.put(Disease.FLUE, true);
            dogDisease.put(Disease.CHICKENPOCKS, false);
            dogDisease.put(Disease.POLIO, false);
            dogDisease.put(Disease.HEPATITISA, true);
            Dog dog1 = new Dog(dogDisease,true, 3, "Max dog1", 1, false);
            Dog dog2 = new Dog(dogDisease, true, 4, "Paty dog2", 2, false);
            Dog dog3 = new Dog(dogDisease, true, 5, "Lucy dog3", 3, false);
            animalShelter.addAnimal(dog1);
            animalShelter.addAnimal(dog2);
            animalShelter.addAnimal(dog3);
        System.out.println("-----------------------------------------------------------------------------------------");

            Map<Disease, Boolean> catDisease = new HashMap<>();
            catDisease.put(Disease.HEPATITISA, true);
            catDisease.put(Disease.POLIO, true);
            catDisease.put(Disease.FLUE, true);
            catDisease.put(Disease.CHICKENPOCKS, true);
            Cat cat1 = new Cat(catDisease, true, 8, "Sasi cat1", 4, false);
            Cat cat2 = new Cat(catDisease, true, 4, "Mishi cat2", 5, false);
            Cat cat3 = new Cat(catDisease, true, 9, "Shosho cat3", 6, false);
            animalShelter.addAnimal(cat1);
            animalShelter.addAnimal(cat2);
            animalShelter.addAnimal(cat3);
        System.out.println("-----------------------------------------------------------------------------------------");
            Map<Disease, Boolean> monkeyDisease = new HashMap<>();
            monkeyDisease.put(Disease.FLUE, true);
            monkeyDisease.put(Disease.POLIO, false);
            monkeyDisease.put(Disease.CHICKENPOCKS, true);
            monkeyDisease.put(Disease.HEPATITISA, true);
            Monkey monkey1 = new Monkey(monkeyDisease, true, 10, "Masi monkey1", 7, false);
            Monkey monkey2 = new Monkey(monkeyDisease, true, 5, "Fufu monkey2", 8, false);
            Monkey monkey3 = new Monkey(monkeyDisease, true, 2, "Soska monkey3", 9, false);
            Monkey monkey4 = new Monkey(monkeyDisease, true, 6, "Mishi monkey4", 10, false);
            animalShelter.addAnimal(monkey1);
            animalShelter.addAnimal(monkey2);
            animalShelter.addAnimal(monkey3);
            animalShelter.addAnimal(monkey4);


        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("sorted animal: ");
        animalShelter.sortAnimals();
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("sorted animal by age: ");
        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("sorted animal by name: ");
        animalShelter.sortAnimalsByName();
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("find animal by number: ");
        animalShelter.findAnimal(+cat2.getAnimalNumber()+ dog1.getAnimalNumber());
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("find animal by name: ");
        animalShelter.findAnimal(cat2.getName());
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("find oldest animal: ");
        animalShelter.findOldestAnimal();
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("find treat all animals: ");
        animalShelter.treatAllAnimals();
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("find treat animal by name: ");
        animalShelter.treatAnimal(monkey4.getName());
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("find treat animal by number: ");
        animalShelter.treatAnimal(animalShelter.getAnimalId());
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("print animal is not vaccinated: ");
        animalShelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        animalShelter.printAnimalsNotVaccinated(Disease.FLUE);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("print count animal: ");
        animalShelter.countAnimals();
        animalShelter.printAnimals();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("add animal: ");
        animalShelter.addAnimal(dog1);
        animalShelter.printAnimals();


    }
}

