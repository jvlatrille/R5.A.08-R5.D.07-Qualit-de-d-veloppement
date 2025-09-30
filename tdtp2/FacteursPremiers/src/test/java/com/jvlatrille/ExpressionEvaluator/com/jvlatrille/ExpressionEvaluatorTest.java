package com.jvlatrille.ExpressionEvaluator.com.jvlatrille;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionEvaluatorTest {
    @Test
    void trois_et_5_devraient_retourner_8() {
        // GIVEN
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        // WHEN
        int result = evaluator.evaluate("3, 5");
        // THEN
        assertEquals(8, result);
    }

    @Test
    void dix_6_6_devraient_retourner_22() {
        // GIVEN
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        // WHEN
        int result = evaluator.evaluate("10, 6, 6");
        // THEN
        assertEquals(22, result);
    }

    @Test
    void cinq_5_4_7_devrait_retrouner_21() {
        // GIVEN
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        // WHEN
        int result = evaluator.evaluate("5, 5, 4, 7");
        // THEN
        assertEquals(21, result);
    }

    @Test
    void vingt_devrait_retourner_20() {
        // GIVEN
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        // WHEN
        int result = evaluator.evaluate("20");
        // THEN
        assertEquals(20, result);
    }
}