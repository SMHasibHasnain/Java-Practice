public class SpecialForLoop {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 8;
        myArray[2] = 4;
        myArray[3] = 7;
        myArray[4] = 9;

        /* 
         * Special Way In Java Array.
         * We can find a specific array element in this proccess.
         */

        for(int check:myArray) {
            if(check==7) {
                System.out.println(check + " Has Been Found!");
            } 
        }

        //Let's dive into deep...
        System.out.println("\nAdvance Lookup:"); 

        int i = 0;

        for(int check:myArray) {
            System.out.print("[INDEX " + i + "] " + "Searching 7...");
            if(check==7) {
                System.out.println( check + " Has Been Found!");
            } else {
                System.out.println("Not Found!");
            }
            i++;
        }

        /*
         * In this method, loop stay running till each elements -
         * isnt explored.
         * If, targeted element already found at the very first, still
         * loop keep itself running;
        */

    }
}
