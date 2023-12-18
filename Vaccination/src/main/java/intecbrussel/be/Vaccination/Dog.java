package intecbrussel.be.Vaccination;

import java.util.Map;

public class Dog extends Animal{
    private boolean hasFoulBreath;

    public Dog(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    public Dog(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {

    }

    @Override
    public boolean vaccinateAnimal(Disease disease) {
        return false;
    }
}
