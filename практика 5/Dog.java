public class Dog extends Pet {
    private final String breed;
    public Dog(String name, int age, String breed) {
        super(name, age, PetType.DOG);
        this.breed = breed;
    }
    @Override
    public void displayInfo() {
        System.out.println("Имя: " + getName() + ", Возраст: " + getAge() + ", Тип: " + getType());
        System.out.println("Порода: " + breed);
    }
}
