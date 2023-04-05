public class factorial {
    public static void main(String[] args){
        for(int i=0; i<20; i++){
            System.out.printf("%d\n", getFactorial(i));
        }
    }
    // compute and return factorial
    // x! = x-1 * x-1 * x-1 * x-1 ...
    private static long getFactorial(int x){
        long factorial = x;

        if(x > 1)
            x--;

        while(x > 0){
            factorial *= x;
            x--;
        }
        return factorial;
    }
}

