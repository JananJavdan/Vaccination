package intecbrussel.be.Vaccination;

import java.util.Map;

public class Cat extends Animal{
    private boolean hasLongNails;

    public Cat(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

    public Cat(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isVaccinated, isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    public boolean isHasLongNails() {
        return hasLongNails;
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }

//zorgt ervoor dat een animal clean gemaakt wordt. Indien je aan het werken bent met een cat, dog of monkey, zorg
//er dan voor dat de treatAnimal methode ook de hyperactivity, de longnails en de foulbreath problemen oplost. (op false zet)
    @Override
    public void treatAnimal() {
        setClean(true);
        setHasLongNails(false);
    }

// Deze method zal een dier vaccineren voor een bepaalde ziekte. Zet er de boolean dus voor op true
    @Override
    public boolean vaccinateAnimal(Disease disease) {
        Map<Disease, Boolean> vaccinationStatus = getIsVaccinated();
        if (vaccinationStatus != null){
            vaccinationStatus.put(disease, true);
            return true;
        }
        return false;
    }


   /* public boolean vaccinateAnimal(Disease disease) {
        Optional<Map<Disease, Boolean>>optionalVaccinationStatus =
                Optional.ofNullable(getIsVaccinated());
        return optionalVaccinationStatus.map(vaccinationStatus-> {
            vaccinationStatus.put(disease, true);
            return true;
        }).orElse(false);

    }*/

}
