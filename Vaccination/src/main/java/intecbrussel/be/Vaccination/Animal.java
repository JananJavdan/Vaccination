package intecbrussel.be.Vaccination;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable{
    //attributes
    private  Map<Disease, Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    public Animal() {
        this.isVaccinated = new HashMap<>();
        Map<Disease, Boolean> map = new HashMap<>();
        map.put(Disease.HEPATITISA, true);
        map.put(Disease.FLUE, true);
        map.put(Disease.POLIO, true);
        map.put(Disease.CHICKENPOCKS, true);
    }
   //constructor
    public Animal(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber) {
        this.isVaccinated = isVaccinated;
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    //getter en setter
    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }


}
