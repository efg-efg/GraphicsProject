package graphproj.scene.xqbuilder;

import net.sf.saxon.s9api.*;

/**
 * Created by alex on 14.12.13.
 */
class S9ApiQueriesExecutor  implements QueriesExecutor {
    private Processor processor;
    private XQueryCompiler compiler;
    public S9ApiQueriesExecutor(String defaultXmlns) {
        processor = new Processor(false);
        compiler = processor.newXQueryCompiler();
        compiler.declareDefaultCollation(defaultXmlns);
    }
    @Override
    public XQueryResult executeQuery(Query query) {

    }
}
