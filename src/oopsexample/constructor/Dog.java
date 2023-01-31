package oopsexample.constructor;

public class Dog extends Animal{
private String bread;
private String color;

    public Dog(String name, int size, int weight, String bread, String color) {
        super(name, 1, 1, size, weight);
        this.bread = bread;
        this.color = color;
    }
    public void eat(){
        System.out.println("dog.eat()");
        super.eat();
    }
}
