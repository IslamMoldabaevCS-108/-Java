public class Cat extends Pet {
    private final String color;

    public Cat(String name, int age, String color) {
        super(name, age, PetType.CAT);
        this.color = color;
    }
    @Override
    public void displayInfo() {
        System.out.println("Имя: " + getName() + ", Возраст: " + getAge() + ", Тип: " + getType());
        System.out.println("Цвет: " + color);
    }
}
