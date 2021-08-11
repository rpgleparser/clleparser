//package example.antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        LOG.info("Running the example...");

        CLLELexer lexer = new CLLELexer(CharStreams.fromString("100+2*6"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLLEParser parser = new CLLEParser(tokens);
        ParseTree parseTree = parser.expr();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyListener(), parseTree);
    }
}