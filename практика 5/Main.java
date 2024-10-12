public class Main {
    public static void main(String[] args) {
        PetClinic clinic = new PetClinic();

        try {
            Dog dog1 = new Dog("Бобик", 3, "Шершавая");
            Cat cat1 = new Cat("Мурка", 2, "Черный");
            clinic.addPet(dog1);
            clinic.addPet(cat1);
            Dog dog2 = new Dog("Бобик", 5, "Лабрадор");
            clinic.addPet(dog2);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            Cat cat2 = new Cat("Гарри", 2, "Рыжий");
            clinic.addPet(cat2);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        clinic.displayPets();
    }
}
