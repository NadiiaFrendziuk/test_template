package person;

import org.testng.Assert;
import org.testng.annotations.*;
import server.Person;

public class TestPerson {
    Person p;

    @BeforeMethod
    public void setUp(){
        Person p = new Person();
        System.out.println("SetUp");
    }
    @Test()
    @Parameters({"age"})
     public void verifySetAge(@Optional("15") String setAge) {
        System.out.println("Parameter "+setAge );
        int expectedAge = 15;
        p.setAge(Integer.parseInt(setAge));
        int actualAge = p.getAge();
       Assert.assertEquals(actualAge, expectedAge, "Isn't equal");

    }

//    @Test(dataProvider = "ages")
//    public void verifySetAge(int expected, int setAge){
//        int expectedAge = 10;
//        Person p = new Person();
//        p.setAge(0);
//        int actualAge = p.getAge();
//        Assert.assertEquals(actualAge, expectedAge, "Isn't equal");
//
//    }
//    @DataProvider (name = "ages")
//    public Object[][] dataProvider(){
//        Object[][] arr = {{10,0},{12,12},{10,-18},{100,100},{10,105}};
//        return arr;
//    }
//    @Test
//    public void setAgePositive(){
//        int expectedAge = 12;
//        Person p = new Person();
//        p.setAge(12);
//        int actualAge = p.getAge();
//        Assert.assertEquals(actualAge, expectedAge, "Isn't equal");

//    }
//    @Test
//    public void setAgeOld(){
//        int expectedAge = 10;
//        Person p = new Person();
//        p.setAge(-18);
//        int actualAge = p.getAge();
//        Assert.assertEquals(actualAge, expectedAge, "Isn't equal");
//
//    }
//    @Test
//    public void setAgeNegative(){
//        int expectedAge = 10;
//        Person p = new Person();
//        p.setAge(9999);
//        int actualAge = p.getAge();
//        Assert.assertEquals(actualAge, expectedAge, "Isn't equal");
//
//    }
}
