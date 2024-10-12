public abstract class Pet {
    private final String name;
    private final int age;
    private final PetType type;
    public Pet(String name, int age, PetType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public PetType getType() {
        return type;
    }
    public int getAge() {
        return age;
    }

    public abstract void displayInfo();
}
