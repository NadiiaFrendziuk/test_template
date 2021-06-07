package Task;

import lesson1.Task1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTask1 {
    @Test
    public void setMinExpected(){
        int expectedMin = 2;
        Task1 t = new Task1();
        t.setMin(2);

        int actualMin = t.getMin();

        Assert.assertEquals(actualMin, expectedMin, "Is a min value");

    }
    @Test
    public void setMinNegative(){
        int expectedMin = 2;
        Task1 t = new Task1();
        t.setMin(-2);

        int actualMin = t.getMin();

        Assert.assertEquals(actualMin, expectedMin, "Is a min value");

    }

        @Test
          public void setMinZero(){
            int expectedMin = 2;
            Task1 t = new Task1();
            t.setMin(0);

            int actualMin = t.getMin();

            Assert.assertEquals(actualMin, expectedMin, "Is a min value");

        }

    @DataProvider(name = "mins")
    public Object[][] dataProvider() {
        Object[][] arr = {{2, 2}, {2, 0}, {2, -2}};
        return arr;


    }
    @Test(dataProvider = "mins")
    public void verifySetMin(int expected, int setMin){
        int expectedMin = expected;
        Task1 t = new Task1();
        t.setMin(setMin);

       int actualMin = t.getMin();

        Assert.assertEquals(actualMin, expectedMin, "Is a min value");

    }
    @Test()
    @Parameters({"min"})
    public void verifyMinValue(@Optional("2") String setMin) {
        System.out.println("Parameter "+setMin );
        int expectedMin = 4;
        Task1 t = new Task1();
        t.setMin(Integer.parseInt(setMin));
        int actualMin = t.getMin();
        Assert.assertEquals(actualMin, expectedMin, "Is a min value");

    }

}
