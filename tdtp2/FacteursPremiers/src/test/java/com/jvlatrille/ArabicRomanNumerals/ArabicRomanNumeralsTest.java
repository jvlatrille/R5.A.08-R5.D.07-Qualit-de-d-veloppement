package com.jvlatrille.ArabicRomanNumerals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArabicRomanNumeralsTest {

    @Test @DisplayName("Hors domaine : 0 et 51 -> IllegalArgumentException")
    void hors_domaine() {
        // GIVEN
        int n0 = 0;
        int n51 = 51;
        // WHEN et THEN
        assertThrows(IllegalArgumentException.class, () -> ArabicRomanNumerals.convert(n0));
        assertThrows(IllegalArgumentException.class, () -> ArabicRomanNumerals.convert(n51));
    }

    @Test @DisplayName("Conversion connue : 1 -> I")
    void conversion_1() {
        // GIVEN
        int n = 1;
        // WHEN
        String resultat = ArabicRomanNumerals.convert(n);
        // THEN
        assertThat(resultat).isEqualTo("I");
    }

    @Test @DisplayName("Conversion connue : 4 -> IV")
    void conversion_4() {
        // GIVEN
        int n = 4;
        // WHEN
        String resultat = ArabicRomanNumerals.convert(n);
        // THEN
        assertThat(resultat).isEqualTo("IV");
    }

    @Test @DisplayName("Conversion connue : 9 -> IX")
    void conversion_9() {
        // GIVEN
        int n = 9;
        // WHEN
        String resultat = ArabicRomanNumerals.convert(n);
        // THEN
        assertThat(resultat).isEqualTo("IX");
    }

    @Test @DisplayName("Conversion connue : 39 -> XXXIX")
    void conversion_39() {
        // GIVEN
        int n = 39;
        // WHEN
        String resultat = ArabicRomanNumerals.convert(n);
        // THEN
        assertThat(resultat).isEqualTo("XXXIX");
    }

    @Test @DisplayName("Conversion connue : 50 -> L")
    void conversion_50() {
        // GIVEN
        int n = 50;
        // WHEN
        String resultat = ArabicRomanNumerals.convert(n);
        // THEN
        assertThat(resultat).isEqualTo("L");
    }
}
