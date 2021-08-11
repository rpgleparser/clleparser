//package example.antlr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener extends CLLEBaseListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyListener.class);

    @Override
    public void enterExpr(CLLEParser.ExprContext ctx) {
        LOG.info(ctx.getText());
    }
}