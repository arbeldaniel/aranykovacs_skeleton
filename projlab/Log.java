package projlab;

import java.io.Console;
import java.io.PrintWriter;
import java.io.StringWriter;


//nincs commentezve
public class Log {
    private int depth;

    public void log(String testCase) {
        this.depth = 0;
        System.out.println("\n***************\n" +
                testCase +
                '\n');
    }

    public void foo() {
        System.out.print("foo\n");
    }

    public void printCall() {
        for (int i = 0; i < depth; ++i)
            System.out.print('\t');
        StackTraceElement[] call = Thread.currentThread().getStackTrace();
        System.out.println(call[2].getClassName() +
                "." +
                call[2].getMethodName() +
                "()");
        depth++;
    }

    public void returnCall() {
        depth--;
    }
}
