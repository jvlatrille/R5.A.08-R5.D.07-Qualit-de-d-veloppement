package com.jvlatrille.personnage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.jvlatrille.personnage.Personnage.Orientation;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonnageTest {

    @Test @DisplayName("Orientation initiale = NORD")
    void orientation_initiale() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.getOrientation();
        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test @DisplayName("tourner(0) -> NORD (identité)")
    void tourner_zero() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(0);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
        assertThat(p.getOrientation()).isEqualTo(Orientation.NORD);
    }

    @Test @DisplayName("tourner(1) -> EST")
    void tourner_un() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(1);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.EST);
    }

    @Test @DisplayName("tourner(2) -> SUD")
    void tourner_deux() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(2);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.SUD);
    }

    @Test @DisplayName("tourner(3) -> OUEST")
    void tourner_trois() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(3);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.OUEST);
    }

    @Test @DisplayName("tourner(4) -> NORD (boucle complète)")
    void tourner_quatre() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(4);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test @DisplayName("tourner(5) -> EST (modulo 4)")
    void tourner_cinq() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(5);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.EST);
    }

    @Test @DisplayName("tourner(8) -> NORD (multiple de 4)")
    void tourner_huit() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(8);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.NORD);
    }

    @Test @DisplayName("tourner(13) -> EST (grand n)")
    void tourner_treize() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        Orientation orientation = p.tourner(13);
        // THEN
        assertThat(orientation).isEqualTo(Orientation.EST);
    }

    @Test @DisplayName("fois négatif -> IllegalArgumentException")
    void tourner_negatif() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN & THEN
        assertThrows(IllegalArgumentException.class, () -> p.tourner(-1));
    }

    @Test @DisplayName("L'état est bien muté à chaque appel")
    void mutation_etat() {
        // GIVEN
        Personnage p = new Personnage();
        // WHEN
        p.tourner(1); // EST
        // THEN
        assertThat(p.getOrientation()).isEqualTo(Orientation.EST);
        // WHEN
        p.tourner(1); // SUD
        // THEN
        assertThat(p.getOrientation()).isEqualTo(Orientation.SUD);
        // WHEN
        p.tourner(2); // OUEST -> NORD
        // THEN
        assertThat(p.getOrientation()).isEqualTo(Orientation.NORD);
    }
}
