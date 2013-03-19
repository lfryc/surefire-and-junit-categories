package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Failing;
import category.Integration;
import category.Smoke;

public class MyIntegrationTest {


    @Category(Integration.class)
    @Test
    public void integrationTest() {
        System.out.println("integrationTest");
    }

    @Category(Smoke.class)
    @Test
    public void smokeTest() {
        System.out.println("smokeTest");
    }

    @Category({Integration.class,Failing.class})
    @Test
    public void failingTest() {
        System.out.println("failingTest");
    }
}
