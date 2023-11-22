import java.util.Scanner;
import java.util.StringTokenizer;

class ExpressionResult
{

    private String expression; //stores the expression
    private int result; //stores the result of evaluating the expression

    //default constructor
    public ExpressionResult()
    {
        this("0"); // initializes the expression field to the String "0"
    }

    //parameterized constructor
    public ExpressionResult(String expression)  ////initializes the expression field to the value of the parameter and then evaluates the expression.
    {
        this.expression = expression;
        this.result = evaluate(expression);
    }

    public int evaluate(String expression)
    {
        StringTokenizer tokenizer = new StringTokenizer(expression, " ");  //sequence of characters that is separated from other sequences of characters by delimiters
        int result = Integer.parseInt(tokenizer.nextToken());
        char operator;
        int operand;
        while (tokenizer.hasMoreTokens())
        {
            operator = tokenizer.nextToken().charAt(0);
            operand = Integer.parseInt(tokenizer.nextToken());
            switch (operator)
            {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    result /= operand;
                    break;
                case '^':
                    result = (int) Math.pow(result, operand);
                    break;
            }
        }
        return result;
    }

    public String toString()
    {
        return expression + " = " + result;
    }
}




public class main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String expression;

        while (true)
        {
            System.out.print("Enter an expression (X to quit): ");  // Repeatedly prompt the user
            expression = scanner.nextLine();

            if (expression.equals("X"))
            {
                break;      // If we press X ,breakout the loop
            }

            ExpressionResult result = new ExpressionResult(expression);     // Create & assign reference, object as ExpressionResult

            System.out.println(result);     // Print the value from object's toString() method
        }
    }
}
