package ru.mirea.lab11.Task4;

public abstract class ExpressionParser implements TripleExpression {
    final TripleExpression first;
    final TripleExpression second;

    public ExpressionParser(TripleExpression first, TripleExpression second) {
        this.first = first;
        this.second = second;
    }

    public int evaluate(int x, int y, int z) throws Exception {
        return evaluate(first.evaluate(x, y, z), second.evaluate(x, y, z));
    }

    protected abstract int evaluate(int f, int s) throws Exception;
}
