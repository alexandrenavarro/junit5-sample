package com.github.alexandrenavarro.junit5sample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomBDDTest extends AbstractBDDTest {

    @Test
    public void test() {
        given("given");

        Assertions.assertThat(true).isTrue();
        when("when");

        then("then");


    }
}
