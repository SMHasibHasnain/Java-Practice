public class OrderOfOperation {
    
    public static void main(String[] args) {
        
        /* B (Bracket) => O () => D (Divided) => M (Multiply) => A(Addition) => S(Subtraction) 
         * Also, calculation starts from left side on same operators.
        */

        int m = 5 + 10 - 2 * 3 + 7 / 2; //12

        int n = 5 * 5 * 3 / 2 * 2; //74

    
        System.out.println(m); 
        System.out.println(n); 

    }

}
