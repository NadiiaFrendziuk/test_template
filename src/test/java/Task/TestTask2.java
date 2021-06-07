package Task;

import lesson1.Task1;
import lesson1.Task2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTask2 {
    @Test
    public void testRowCountExpected() {
        int expectedRowsCount = 5;
        Task2 i = new Task2();
        i.setRowCount(5);
        int actualRowCount = i.getRowCount();
        Assert.assertEquals(actualRowCount, expectedRowsCount, "Is a number of rows");
    }
    @Test
    public void testRowCountNegative() {
        int expectedRowsCount = 5;
        Task2 i = new Task2();
        i.setRowCount(-1);
        int actualRowCount = i.getRowCount();
        Assert.assertEquals(actualRowCount, expectedRowsCount, "Is a number of rows");
    }
    @Test
    public void testRowCountZero() {
        int expectedRowsCount = 5;
        Task2 i = new Task2();
        i.setRowCount(0);
        int actualRowCount = i.getRowCount();
        Assert.assertEquals(actualRowCount, expectedRowsCount, "Is a number of rows");
    }

    @DataProvider(name = "rows")
    public Object[][] dataProvider() {
        Object[][] arr = {{5, 2}, {5, 0}, {5, -2}};
        return arr;


    }
    @Test(dataProvider = "rows")
    public void verifyRowCount(int expected, int setRowCount){
        int expectedRowCount = expected;
        Task2 i = new Task2();
        i.setRowCount(setRowCount);
        int actualRowCount = i.getRowCount();
}
    }





