import syntaxtree.*;
import java.util.*;
import visitor.*;

public class Main {
    public static void main(String [] args) {
        try {
            Node root = new MiniJavaParser(System.in).Goal();
            GJDepthFirst gjdepthfirst = new GJDepthFirst();
            root.accept(gjdepthfirst, null);
            System.out.println("Program parsed successfully");
            // gjdepthfirst.storing=0;
            // root.accept(gjdepthfirst,null);

        }
        catch (ParseException e) {
            System.out.println(e.toString());
        }
}
}