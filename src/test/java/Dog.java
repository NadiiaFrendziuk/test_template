public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("sleep");

    }

    @Override
    public void eat() {
        System.out.println("eat");

    }
}
