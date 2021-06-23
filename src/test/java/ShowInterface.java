public class ShowInterface {
    public static void main(String[] args) {
        Dog d1 = new Dog("d1");
        Dog d2 = new Dog("d2");
        Cat c1 = new Cat("c1");
        Spider s1 = new Spider("s1");
        ImmortalPony ip1 = new ImmortalPony("ip1");

        d1.setName("d1");
        System.out.println(d1.getName());
        d2.eat();
    }
}
