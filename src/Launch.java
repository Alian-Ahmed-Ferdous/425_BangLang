import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) throws FileNotFoundException {
        try{

            String filename = "test.txt";
            CharStream charStream = CharStreams.fromFileName(filename);
            banglangLexer banglangLexer = new banglangLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(banglangLexer);
            banglangParser banglangParser = new banglangParser(commonTokenStream);
            ParseTree tree = banglangParser.program();
            banglangLaunch visitor = new banglangLaunch();
            visitor.visit(tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
