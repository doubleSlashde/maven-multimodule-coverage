package de.doubleslash.demo.coverage.module.three;

public class Baz {

    private int i = 6;
    private String s = "jacoco";

    public int bazMethod() {
        return i;
    }

    public String anotherBazMethod() {
        return s + String.valueOf(i);
    }

}
