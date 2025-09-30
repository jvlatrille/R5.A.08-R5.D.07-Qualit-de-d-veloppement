package com.jvlatrille.facteursPremiers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {
    @Test
    void un_retourne_vide() {
        // GIVEN
        int n = 1;
        // WHEN
        List<Integer> resultat = FacteursPremiers.generate(n);
        // THEN
        assertThat(resultat).isEmpty();
    }

    @Test
    void devrait_retourner_une_liste_contenant_2(){
        // GIVEN
        int n = 2;
        // WHEN
        List<Integer> resultat = FacteursPremiers.generate(n);
        // THEN
        assertThat(resultat).containsExactly(2);
    }

    @Test
    void devrait_retourner_une_liste_contenant_2_et_3(){
        // GIVEN
        int n = 6;
        // WHEN
        List<Integer> resultat = FacteursPremiers.generate(n);
        // THEN
        assertThat(resultat).containsExactly(2, 3);
    }

    @Test
    void devrait_retourner_une_liste_contenant_2_2_2(){
        // GIVEN
        int n = 8;
        // WHEN
        List<Integer> resultat = FacteursPremiers.generate(n);
        // THEN
        assertThat(resultat).containsExactly(2, 2, 2);
    }
}