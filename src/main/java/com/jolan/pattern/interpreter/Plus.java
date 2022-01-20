package com.jolan.pattern.interpreter;

/**
 * 加法表达式类
 */
public class Plus extends AbstractExpression {
    //加号左边的表达式
    private AbstractExpression left;
    //加号右边的表达式
    private AbstractExpression right ;
    @Override
    public int interpret(Context context) {
        //将左边表达式的结果和右边表达式的结果相加
        return left.interpret(context) + right.interpret(context);
    }

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
