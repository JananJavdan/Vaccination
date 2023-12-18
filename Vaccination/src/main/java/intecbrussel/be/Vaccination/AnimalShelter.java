package intecbrussel.be.Vaccination;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalShelter {
    private List<Animal> animals;
    private int animalId;

    public AnimalShelter() {
        this.animals = new ArrayList<>();
        this.animalId = 1;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void printAnimals(){

    }
    // sorteert de dieren volgens hun natuurlijke volgorde, dit is volgens hun animalNumber.
    public void sortAnimals(){
        animals.sort(Comparator.comparing(Animal::getAnimalNumber));
    }
    //sorteert de dieren op naam
    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }
    // sorteert de dieren op leeftijd
    public void sortAnimalsByAge(){
        animals.sort(Comparator.comparing(Animal::getAge));
    }
    //print alle dieren af die niet gevaccineert zijn voor een opgegeven ziekte
    public void printAnimalsNotVaccinated(Disease disease){
        List<Animal> notVaccinated = animals.stream().filter(animal -> animal.getIsVaccinated().getOrDefault(disease, false)).collect(Collectors.toList());
        for (Animal animal : notVaccinated){
            System.out.println(animal.getName()+" is not vaccinated "+disease.name());
        }
    }
    //zoek dier op dierennummer
    public Animal findAnimal(int animalNumber){
        return animals.stream().filter(animal -> animal.getAnimalNumber()==animalNumber).findFirst().orElse(null);
    }
    //zoek dier op dierennaam
    public Animal findAnimal(String name){
        return animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
    // behandel opgegeven dier
    public void treatAnimal(int animalNumber){
        Animal animal = findAnimal(animalNumber);
        if (animal != null){
            animal.treatAnimal();
        }else {
            System.out.println("animal met number "+animalNumber+"not found");
        }
    }
    //behandel opgegeven dier
    public void treatAnimal(String name){
        Animal animal = findAnimal(name);
        if (animal != null){
            animal.treatAnimal();
        }else {
            System.out.println("animal met name "+name+ "not found");
        }

    }
    //behandel alle dieren
    public void treatAllAnimals(){

    }
    //geef het oudste dier terug
    public Animal findOldestAnimal(){
        return null;
    }
    // geef het aantal dieren terug
    public int countAnimals(){
        return 0;
    }
    //voeg een dier toe aan de lijst van animals
    public void addAnimal(){

    }


}
