package de.doubleslash.demo.coverage.module.three;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BazIT {

    @Test
    void testAnotherBazMethod() {
        Baz testee = new Baz();
        assertThat(testee.anotherBazMethod(), is("jacoco6"));
    }

}
