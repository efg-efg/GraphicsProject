package graphproj.scene.xqbuilder;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by alex on 14.12.13.
 */
class Query {
    private String strQuery;
    private Map<String, String> externVars;
    public Query(Map<String, String> externVars, String strQuery) {
        this.externVars = externVars;
        this.strQuery = strQuery;
    }
    public String getQueryStringValue() {
        return strQuery;
    }
    public Iterator<Entry<String, String>> getExternVars() {
        return externVars.entrySet().iterator();
    }
    public void setExternVarValue(String varName, String varValue) {
        externVars.put(varName, varValue);
    }
    public void setAllExternVars(Map<String, String> externVars) {
        this.externVars = externVars;
    }

}
