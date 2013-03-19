package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import category.Failing;
import category.Integration;
import category.NotFirefox;
import category.NotTomcat;
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

    @Category({Integration.class, NotTomcat.class})
    @Test
    public void notSupportedOnTomcat() {
        System.out.println("notSupportedOnTomcat");
    }

    @Category({Integration.class, NotFirefox.class})
    @Test
    public void notSupportedOnFirefox() {
        System.out.println("notSupportedOnFirefox");
    }
}
