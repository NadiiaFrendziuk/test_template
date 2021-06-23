public class Cat extends Animal{
    public Cat(String name) {
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
