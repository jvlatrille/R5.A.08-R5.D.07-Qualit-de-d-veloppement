package com.jvlatrille.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static com.jvlatrille.calculator.Calculator.*;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    void ensembleChiffres_7679() {
        assertThat(ensembleChiffres(7679)).containsExactlyInAnyOrder(6,7,9);
    }

    @Test
    void ensembleChiffres_moins_11() {
        assertThat(ensembleChiffres(-11)).containsExactlyInAnyOrder(1);
    }

    @Test
    void ensembleChiffres_zero() {
        assertThat(ensembleChiffres(0)).containsExactlyInAnyOrder(0);
    }

    @Test
    void add_devrait_lever_si_overflow() {
        assertThatThrownBy(() -> add(Integer.MAX_VALUE, 1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Overflow");
    }

    @Test
    void divide_devrait_lever_si_diviseur_zero() {
        assertThatThrownBy(() -> divide(10, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("zéro");
    }

}
