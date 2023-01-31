package oopsexample.constructor;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Elephant",1,1,4,40);
        Dog dog = new Dog("Simba", 1,1,"lab","black");
        dog.eat();
    }
}
