import java.util.Stack;

public class ExpressionParser {
	Stack stack=new Stack<>();
    public int parse(String str){
    String[] tokenList = str.split(" ");
    for (String symbol : tokenList) {
        if (!ParserUtil.isOperator(symbol)) {
            Expression numberExpression = new NumberExpression(symbol);
            stack.push(numberExpression);
            System.out.println(String.format("Pushed to stack: %d", numberExpression.interpret()));
        } else  if (ParserUtil.isOperator(symbol)) {
            Expression firstExpression = (Expression) stack.pop();
            Expression secondExpression = (Expression) stack.pop();
            System.out.println(String.format("Popped operands %d and %d",
                    firstExpression.interpret(), secondExpression.interpret()));
            Expression operator = ParserUtil.getExpressionObject(firstExpression, secondExpression, symbol);
            System.out.println(String.format("Applying Operator: %s", operator));
            int result = operator.interpret();
            NumberExpression resultExpression = new NumberExpression(result);
            stack.push(resultExpression);
            System.out.println(String.format("Pushed result to stack: %d", resultExpression.interpret()));
        }
    }
   int result= ((Expression) stack.pop()).interpret();
    return result;
}
}
