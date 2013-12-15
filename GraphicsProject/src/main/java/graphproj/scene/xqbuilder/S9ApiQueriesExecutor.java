package graphproj.scene.xqbuilder;

import net.sf.saxon.s9api.*;

import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Created by alex on 14.12.13.
 */
class S9ApiQueriesExecutor  implements QueriesExecutor {
    private static volatile S9ApiQueriesExecutor instance;
    private Processor processor;
    private XQueryCompiler compiler;
    private S9ApiQueriesExecutor(String defaultXmlns) {
        processor = new Processor(false);
        compiler = processor.newXQueryCompiler();
        compiler.declareNamespace("", defaultXmlns);
    }
    private void setAllExternalVariables(XQueryEvaluator querEx,
                                         Iterator<Entry<String, String>> externVars) {
        while(externVars.hasNext()) {
            Entry<String, String> externVar = externVars.next();
            querEx.setExternalVariable(new QName(externVar.getKey()),
                    new XdmAtomicValue(externVar.getValue()));
        }

    }
    @Override
    public XQueryResult executeQuery(Query query) throws Exception {
        XQueryExecutable expr = compiler.compile(query.getQueryStringValue());
        XQueryEvaluator querEv = expr.load();
        setAllExternalVariables(querEv, query.getExternVars());
        return new XQResXdmValue(querEv.evaluate());

    }
    public static S9ApiQueriesExecutor getInstance(String xmlns) {
        if(instance == null ) {
            synchronized (S9ApiQueriesExecutor.class) {
                if(instance == null)
                    instance = new S9ApiQueriesExecutor(xmlns);
            }
        }
        return instance;
    }
}
/*
private static volatile Singleton instance;

    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
*/