package integration.tests;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import category.Failing;
import category.FailingOnMyFaces;
import category.JavaEEOnly;
import category.NoPhantomJS;
import category.Smoke;

@RunWith(Arquillian.class)
public class MyIntegrationTest {

    @Test
    public void integrationTest() {
        System.out.println("integrationTest");
    }

    @Test
    @Category(Smoke.class)
    public void smokeTest() {
        System.out.println("smokeTest");
    }

    @Category(Failing.class )
    @Test
    public void failingTest() {
        System.out.println("failingTest");
    }

    @Category(FailingOnMyFaces.class )
    @Test
    public void failingOnMyFaces() {
        System.out.println("failingOnMyFaces");
    }

    @Category(JavaEEOnly.class)
    @Test
    public void javaEEOnly() {
        System.out.println("javaEEOnly");
    }

    @Category(NoPhantomJS.class)
    @Test
    public void notSupportedOnPhantom() {
        System.out.println("notSupportedOnPhantom");
    }
}
