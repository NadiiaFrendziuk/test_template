package Task;


import lesson1.Task5;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask5 {

    @Test
    public void shouldReturn_ReverseString() {
        Task5 stringUtilities = new Task5();

        String actualResult = stringUtilities.reverse("Hello!");
        String expectedResult = "!olleH";

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnTrue_ForPalindromes() {
        Task5 stringUtilities = new Task5();

        boolean actualResult = stringUtilities.isPalindrome("racecar");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void shouldReturnFalse_ForNotPalindromes() {
        Task5 stringUtilities = new Task5();

        boolean actualResult = stringUtilities.isPalindrome("hello");
        Assert.assertFalse(actualResult);
    }


}
