package graphproj.scene.xqbuilder;

import graphproj.scene.*;

/**
 * Created by alex on 14.12.13.
 */
public class XQuerySceneBuilder  implements SceneBuilder {
    private Command command;
    private Analyzer analyzer;
    private QueriesExecutor executor;
    public XQuerySceneBuilder(String filename) {
        executor = new S9ApiQueriesExecutor("http://www.collada.org/2005/11/COLLADASchema");
    }
    @Override
    public void buildScene() {

    }
    @Override
    public void buildModel() {

    }
    @Override
    public boolean canBuildModel() {
        return true;
    }
    @Override
    public Scene getScene() {
        return new Scene();
    }
}
