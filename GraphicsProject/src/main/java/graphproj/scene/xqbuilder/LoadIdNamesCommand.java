package graphproj.scene.xqbuilder;

import java.util.*;

/**
 * Created by alex on 15.12.13.
 */
class LoadIdNamesCommand implements Command {
    private Analyzer analyzer;
    private QueriesExecutor executor;
    private Query loadIdNamesQuery;
    private Map<String, String> fillExternVars(String filename) {
        Map<String, String> externVars = new TreeMap<String, String>();
        externVars.put("inputDocument", filename);
        return externVars;
    }
    private void fillQuery(String filename) {
        String strQuery = "declare variable $inputDocument external; for $data in doc($inputDocument)/COLLADA/library_geometries" +
                "/geometry return $data/string(@id)";
        Map<String, String> externVars = fillExternVars(filename);
        loadIdNamesQuery = new Query(externVars, strQuery);
    }
    public LoadIdNamesCommand(Analyzer analyzer, QueriesExecutor executor, String filename) {
        this.analyzer = analyzer;
        this.executor = executor;
        fillQuery(filename);
    }

    @Override
    public List<String> execute(String data) throws Exception {
        return analyzer.analyzeMultiple(executor.executeQuery(loadIdNamesQuery), new StringAnalyzerPart());
    }
}
