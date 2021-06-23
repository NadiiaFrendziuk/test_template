public class ImmortalPony extends Animal implements existable {
    public ImmortalPony(String name) {
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

    @Override
    public void meet(Animal animal) {

    }
}
