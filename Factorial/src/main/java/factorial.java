public class factorial {

    public int factorialRecursion(int num) {
        if (num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    public int factorial(int num) {
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
