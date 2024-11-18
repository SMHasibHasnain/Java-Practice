public class EscapeSequences {
    public static void main(String[] args){

        //Print: Hello "World"! 

        //System.out.println("Hello "World"!"); ERROR   
        System.out.println("Hello \"World\"!"); //Done by Escape Sequence "\"

        //Print: I'm \CodeSinner
        //System.out.println("I'm \CodeSinner"); ERROR
        System.out.println("I'm \\CodeSinner"); //Done by using Escape Sequences

        //Print: CodeSinner's        Community
        System.out.println("CodeSinner's        Community"); //Normal Way
        System.out.println("CodeSinner's\t\tCommunity"); //Pro Way by Escape Sequences

        /*Print:
         * CodeSinner's
         * Blog
         */
        System.out.println("CodeSinner's\nBlog");
    }

}