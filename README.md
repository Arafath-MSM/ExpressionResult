# ExpressionResult
operand operator operand[ operator operand ...]


The following members are implemented in the ExpressionResult class and no others.

(a) The class ExpressionResult has two private fields: a String named expression and
an integer named result.

(b) The default constructor sends the String literal containing only the digit 0 (zero) to the
parameterized constructor.

(c) The parameterized constructor accepts one String expression as a formal parameter, saves the
parameter into the expression field, and sets the result field with the return value of evaluate
given expression as the actual parameter.

(d) The public static method named evaluate returns an int and evaluates the String expression
sent as a formal parameter. The returned value is the integer corresponding to the expression’s
simplified value.

Implementation details of the evaluate method follow:
i. Use the String.split method to parse the passed expression into a String array. The String-class
method split accepts a String parameter which must be a String literal with a single space. The
method will create a String array object with the expression’s operands and operator(s) as
elements.

ii. Iterate through the parsed String array elements in a loop to accumulate the integer result
based on the operators and operands.

A. Set the initial value of result to the first (index 0) element by calling Integer.parseInt()
with the first element (an operand) sent as the actual parameter.

B. Set the current operator based on the value of the array elements at an odd index.

C. Set the current operand to the array element’s integer value when the index is any
other value (i.e., not 0 and not odd).

D. Update the value of result by performing the operation indicated by the current
operator using result and the current operand as the inputs.

iii. Finally, the result is returned upon loop completion.
The following example illustrates how an expression is evaluated. Given the expression 1 + 4 *8,
an array of Strings is created with the five elements "1", "+", "4", "*", and "8". Then:
• result is initialized to 1
• operator is set to "+"
• operand is set to 4 and result is updated to 1 + 4 = 5
• operator is set to "*"
• operand is set to 8 and result is updated to 5 * 8 = 40

(e) A public String method toString accepts no parameters and returns the expression and result
fields formatted with an equals sign between them.
Some examples: "10 + 5 * 2 = 30", "4 * 1 + -2 ^ 3 = 8"
