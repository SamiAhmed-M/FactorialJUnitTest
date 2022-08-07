public class Factorial {
    public int evaluate(int num){
        if (num == 0 || num == 1)
            return 1;
        return num * evaluate(num-1);
    }
}
