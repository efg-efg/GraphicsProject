package graphproj.scene.xqbuilder;

import java.util.*;

/**
 * Created by alex on 15.12.13.
 */
class LoadIdNamesCommand implements Command {
    private Analyzer analyzer;
    private QueriesExecutor executor;
    private Query loadIdNamesQuery;
    private void fillExternVars(String filename) {

    }
    private void fillQuery(String filename) {

    }
    public LoadIdNamesCommand(Analyzer analyzer, QueriesExecutor executor, String filename) {
        this.analyzer = analyzer;
        this.executor = executor;
        fillQuery(filename);
    }

    @Override
    public List<String> execute(String data) throws Exception {
        return analyzer.analyzeMultiple();
    }
}
