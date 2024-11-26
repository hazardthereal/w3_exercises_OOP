public class Main {
    public static void main(String[] args) {
    // Source: https://www.w3resource.com/java-exercises/oop/index.php
    // 1. Exercise
        Person person = new Person("Daniel", 30);
        Person person2 = new Person("Julian", 70);

        System.out.println(person.getName() + " " + person.getAge());
        System.out.println(person2.getName() + " " + person2.getAge());
        System.out.println();
        System.out.println();
    // 2. Exercise
        Dog doggo = new Dog("Cody", "Cavalier King Charles Spaniel");
        Dog bigdoggo = new Dog("Big Boi", "Saint Bernard");

        System.out.println(doggo.getPetName() + " " + doggo.getBreed());
        System.out.println(bigdoggo.getPetName() + " " + bigdoggo.getBreed());

        doggo.setBreed("CKCS");
        System.out.println(doggo.getPetName() + " " + doggo.getBreed());
        System.out.println();
        System.out.println();
    // 3. Exercise
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 20);

        System.out.println("the area of r1: " + r1.getArea());
        System.out.println("the area of r2: " + r2.getArea());
        System.out.println();
        System.out.println("the perimeter of r1: " + r1.getPerimeter());
        System.out.println("the perimeter of r2: " + r2.getPerimeter());
        System.out.println();
        System.out.println();
    // 4. Exercise
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);

        System.out.printf("The area of c1: %.2f%n", c1.getArea());
        System.out.printf("The area of c2: %.2f%n", c2.getArea());
        System.out.println();
        System.out.printf("The perimeter of c1: %.2f%n", c1.getCircumference());
        System.out.printf("The perimeter of c2: %.2f%n", c2.getCircumference());

    }
}