package lesson1;

public class Task1 {

    public Task1() {
        this.min = 5;
    }

    private int min;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min != 0){
        this.min = min;
        }
    }
}
