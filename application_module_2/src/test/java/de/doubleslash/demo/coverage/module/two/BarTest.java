package de.doubleslash.demo.coverage.module.two;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BarTest {

    @Test
    void testConditionedBarMethod() {
        Bar testee = new Bar();
        assertThat(testee.conditionedBarMethod(true), is("6jacoco"));
    }

}
