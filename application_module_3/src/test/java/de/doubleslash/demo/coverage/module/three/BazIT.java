package de.doubleslash.demo.coverage.module.three;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BazIT {

    @Test
    public void testAnotherBazMethod() {
        Baz testee = new Baz();
        assertThat(testee.anotherBazMethod(), is("jacoco6"));
    }

}
