package graphproj.scene.xqbuilder;

/**
 * Created by alex on 15.12.13.
 */
class StringAnalyzerPart implements AnalyzerPart {
    @Override
    public String analyze(String data) {
        return data.trim();
    }
}
