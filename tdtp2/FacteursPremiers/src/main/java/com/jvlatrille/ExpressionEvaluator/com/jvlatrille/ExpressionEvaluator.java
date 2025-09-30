package com.jvlatrille.ExpressionEvaluator.com.jvlatrille;

public class ExpressionEvaluator {

    public int evaluate(String expression) {
        int sum = 0;
        for (String part : expression.replace(",", "+").replace("\"", " ").split("\\+")) {
            part = part.trim();
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}
