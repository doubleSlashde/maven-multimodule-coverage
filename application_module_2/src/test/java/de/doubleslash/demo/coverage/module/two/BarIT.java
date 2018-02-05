package de.doubleslash.demo.coverage.module.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BarIT {

    private Bar testee;

    @BeforeEach
    void setUp() {
        testee = new Bar();
    }

    @Test
    void testAnotherBarMethod() {
        assertThat(testee.anotherBarMethod(), is("jacoco5"));
    }

    @Test
    void testConditionedBarMethod() {
        assertThat(testee.conditionedBarMethod(false), is("jacoco"));
    }

}
