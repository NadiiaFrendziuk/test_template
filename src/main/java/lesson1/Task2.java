package lesson1;


public class Task2 {

    public Task2() {
        this.rowCount = 10;
    }

    private int rowCount;

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        if (rowCount != 0) {
            this.rowCount = rowCount;
        }
    }
}






