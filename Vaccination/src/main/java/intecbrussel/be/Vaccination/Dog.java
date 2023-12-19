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

//zorgt ervoor dat een animal clean gemaakt wordt. Indien je aan het werken bent met een cat, dog of monkey, zorg er dan
//voor dat de treatAnimal methode ook de hyperactivity, de longnails en de foulbreath problemen oplost. (op false zet)
    @Override
    public void treatAnimal() {
        setClean(true);
        setHasFoulBreath(false);

    }

//Deze method zal een dier vaccineren voor een bepaalde ziekte. Zet er de boolean dus voor op true
    @Override
    public boolean vaccinateAnimal(Disease disease) {
        Map<Disease, Boolean> vaccinationStatus = getIsVaccinated();
        if (vaccinationStatus != null){
            vaccinationStatus.put(disease, true);
            return true;
        }
        return false;
    }
}
