package com.krnchik.tasks.easyJava;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ToCamelCaseTest {

    ToCamelCase camelCase;

    @Before
    public void setUp() {
        camelCase = new ToCamelCase();
    }

    @Test
    public void toCamelCase() {
        assertThat(camelCase.toCamelCase("a-beautiful-rose")).isEqualTo("aBeautifulRose");
        assertThat(camelCase.toCamelCase("A-beautiful-rose")).isEqualTo("ABeautifulRose");
        assertThat(camelCase.toCamelCase("a_beautiful_rose")).isEqualTo("aBeautifulRose");
        assertThat(camelCase.toCamelCase("a_beautiful-rose")).isEqualTo("aBeautifulRose");
        assertThat(camelCase.toCamelCase("A_beautiful-rose")).isEqualTo("ABeautifulRose");
        assertThat(camelCase.toCamelCase("beautiful")).isEqualTo("beautiful");
    }
}