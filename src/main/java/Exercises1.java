public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        int t = 1;
        for (int i = 1; i <= n; i++){
            t *= i;
        }
        return t;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        long i = 0;
        long j = 1;
        for (int k = 0; k < n; k++){
            long temp = i;
            i = j;
            j += temp;
        }
        return i;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        // TODO
        return null;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}