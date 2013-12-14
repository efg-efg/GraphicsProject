package graphproj.scene.xqbuilder;

import java.util.*;

/**
 * Created by alex on 14.12.13.
 */
class Analyzer {
    public Analyzer() {

    }
    public <T> List<T> analyzeContainer(XQueryResult result, AnalyzerPart analyzerPart) {
        List<T> contValues = new ArrayList<T>();
        for(String strRes : result) {
            T resAnalizer = analyzerPart.analyze(strRes);
            contValues.add(resAnalizer);
        }
        return contValues;
    }
    public <T> T analyzeSingle(XQueryResult result, AnalyzerPart analyzerPart) {
        Iterator<String> iter = result.iterator();
        String strRes = new String();
        if(iter.hasNext())
            strRes = iter.next();
        return analyzerPart.analyze(strRes);
    }
}
