abstract class Animal {

    public abstract void makeSound();
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Собака говорит: Гав-гав!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Кошка говорит: Мяу!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Cat();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
