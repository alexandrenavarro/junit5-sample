package com.github.alexandrenavarro.junit5sample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;

public abstract class AbstractBDDTest<String> {

    protected String given;
    protected String when;
    protected String then;

    @AfterEach
    public void afterEach() {
        Assertions.assertThat(given).isNotNull();
        Assertions.assertThat(when).isNotNull();
        Assertions.assertThat(then).isNotNull();
    }

    public void given(String s) {
        given = s;
    }

    public void when(String s) {
        when = s;
    }

    public void then(String s) {
        then = s;
    }

}
