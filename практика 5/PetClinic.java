import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    private final List<Pet> pets;
    public PetClinic() {
        pets = new ArrayList<>();
    }
    public void addPet(Pet pet) throws Exception {
        for (Pet p : pets) {
            if (p.getName().equals(pet.getName())) {
                throw new Exception("Питомец с таким именем уже есть в клинике!");
            }
        }
        pets.add(pet);
    }
    public void displayPets() {
        for (Pet pet : pets) {
            pet.displayInfo();
        }
    }
}
