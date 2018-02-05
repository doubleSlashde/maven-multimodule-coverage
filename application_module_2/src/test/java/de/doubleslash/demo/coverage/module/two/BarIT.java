package de.doubleslash.demo.coverage.module.two;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BarIT {

    private Bar testee;

    @Before
    public void setUp() {
        testee = new Bar();
    }

    @Test
    public void testAnotherBarMethod() {
        assertThat(testee.anotherBarMethod(), is("jacoco5"));
    }

    @Test
    public void testConditionedBarMethod() {
        assertThat(testee.conditionedBarMethod(false), is("jacoco"));
    }

}
