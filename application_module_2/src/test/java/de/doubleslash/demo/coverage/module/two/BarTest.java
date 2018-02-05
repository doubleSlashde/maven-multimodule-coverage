package de.doubleslash.demo.coverage.module.two;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BarTest {

    @Test
    public void testConditionedBarMethod() {
        Bar testee = new Bar();
        assertThat(testee.conditionedBarMethod(true), is("6jacoco"));
    }

}
