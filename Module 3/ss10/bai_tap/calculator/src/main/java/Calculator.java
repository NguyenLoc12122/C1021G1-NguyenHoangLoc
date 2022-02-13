public class Calculator {
    public static float calculator(float first, char operator, float second) {
        switch (operator) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '%':
                return first % second;
            case '/':
                if (second != 0){
                    return first / second;
                } else {
                    throw new RuntimeException("Can't divide for 0");
                }
            default:
                throw new RuntimeException("Không chia được");
        }
    }
}
