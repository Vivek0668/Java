public class Expression {
    public static void main(String[] args) {
        String input = "1/3-1/2";
        String result = convertAndEvaluate(input);
        System.out.println("Result: " + result);  // Output should be "0.0"
    }

    public static double evaluateExpression(String expression) {
        double result = 0.0;
        int start = 0;
        int n = expression.length();

        for (int i = 0; i < n; i++) {
            // Check if the current character is an operator
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                if (i > start) { // Skip the first '+' or '-' which is part of the first number
                    String term = expression.substring(start, i);
                    result += Double.parseDouble(term);
                    start = i; // Move the start to the current operator
                }
            }
        }
        // Add the last term
        result += Double.parseDouble(expression.substring(start));

        return result;
    }

    public static String convertAndEvaluate(String x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '-' || x.charAt(i) == '+') {
                sb.append(x.charAt(i));
            }
            if (x.charAt(i) == '/') {
                double result = (double) (x.charAt(i - 1) - '0') / (x.charAt(i + 1) - '0');
                sb.append(result);
            }
        }
        // Now evaluate the final expression
        return Double.toString(evaluateExpression(sb.toString()));
    }
}


