package intecbrussel.be.Vaccination;

import java.util.*;
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
        for (Animal animal : animals){
            System.out.println("Name: "+animal.getName()+" | "+" Age: "+animal.getAge()+" | "+" Animal number: "+animal.getAnimalNumber()+" | "+" is clean ? "+animal.getIsVaccinated());
        }
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
    public Optional<Animal> findAnimal(int animalNumber) {
        setAnimalId(9);
       return animals.stream().filter(animal -> animal.getAnimalNumber()==animalNumber).findFirst();

        }

    //zoek dier op dierennaam
    public Optional<Animal> findAnimal(String name){

        return animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).findFirst();

        //return animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
    // behandel opgegeven dier
    public void treatAnimal(int animalNumber){
        Optional<Animal> optionalAnimal = findAnimal(animalNumber);
        if (optionalAnimal.isPresent()){
            Animal animal = optionalAnimal.get();
            animal.treatAnimal();
            System.out.println("Name: "+animal.getName()+" | "+" Age: "+animal.getAge()+" | "+" Animal number: "+animal.getAnimalNumber()+" | "+" is clean ? "+animal.getIsVaccinated());
        }else {
            System.out.println("animal met number "+animalNumber+"not found");
        }
    }
    //behandel opgegeven dier
    public void treatAnimal(String name){
        Optional<Animal> optionalAnimal = findAnimal(name);
        if (optionalAnimal.isPresent()){
            Animal animal = optionalAnimal.get();
            animal.treatAnimal();
            System.out.println("Name: "+animal.getName()+" | "+" Age: "+animal.getAge()+" | "+" Animal number: "+animal.getAnimalNumber()+" | "+" is clean ? "+animal.getIsVaccinated());
        }else {
            System.out.println("animal met name "+name+ "not found");
        }

    }
    //behandel alle dieren
    public void treatAllAnimals(){
        for (Animal animal : animals){
            animal.treatAnimal();
            System.out.println("Name: "+animal.getName()+" | "+" Age: "+animal.getAge()+" | "+" Animal number: "+animal.getAnimalNumber()+" | "+" is clean ? "+animal.getIsVaccinated());
        }

    }
    //geef het oudste dier terug
    public Animal findOldestAnimal() throws NoSuchElementException {
        if (animals.isEmpty()) {
            throw new NoSuchElementException("No animal found in this list");
        }
            Animal oldestAnimal = animals.get(0);
        for (Animal animal : animals){
            if (animal.getAge() > oldestAnimal.getAge()){
                oldestAnimal = animal;
                System.out.println("Name: "+animal.getName()+" | "+" Age: "+animal.getAge()+" | "+" Animal number: "+animal.getAnimalNumber()+" | "+" is clean ? "+animal.getIsVaccinated());
            }
        }
        return oldestAnimal;

    }

    // geef het aantal dieren terug
    public int countAnimals(){
        return animals.size();

    }

    //voeg een dier toe aan de lijst van animals
    public void addAnimal(Animal animal) throws IllegalArgumentException{
        if (animal != null){
            animal.setAnimalNumber(animalId);//toewijzen de nummer animal
            animals.add(animal);//add de animal to de list
            animalId++;//verhoog de animal id
        }else {
            throw new IllegalArgumentException("Can not add null animal to de list");
        }

    }

}
