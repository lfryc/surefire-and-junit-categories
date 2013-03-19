package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Failing;
import category.Integration;
import category.Smoke;

public class MyIntegrationTest {

    @Test
    @Category(Integration.class)
    public void integrationTest() {
        System.out.println("integrationTest");
    }

    @Test
    @Category(Smoke.class)
    public void smokeTest() {
        System.out.println("smokeTest");
    }

    @Category({ Integration.class, Failing.class })
    @Test
    public void failingTest() {
        System.out.println("failingTest");
    }
}
