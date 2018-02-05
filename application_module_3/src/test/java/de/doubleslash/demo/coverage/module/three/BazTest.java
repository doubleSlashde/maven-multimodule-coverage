package de.doubleslash.demo.coverage.module.three;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BazTest {

    @Test
    void testBazMethod() {
        Baz testee = new Baz();
        assertThat(testee.bazMethod(), is(6));
    }

}
