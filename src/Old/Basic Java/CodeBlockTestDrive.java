class CodeBlock {
    static int studentNumber;

    static {
        studentNumber = 0; //Proccess only on creating first object
    }
    {
        studentNumber++; //Proccess while creating each objects
    }
}

public class CodeBlockTestDrive {
    public static void main(String[] args) {
        CodeBlock myobj1 = new CodeBlock();
        CodeBlock myobj2 = new CodeBlock();
        CodeBlock myobj3 = new CodeBlock();
        CodeBlock myobj4 = new CodeBlock();
        CodeBlock myobj5 = new CodeBlock();
        System.out.println(CodeBlock.studentNumber); //Output 5
    }
}
