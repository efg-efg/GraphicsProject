package graphproj.scene.xqbuilder;

import graphproj.scene.*;
import java.util.*;

/**
 * Created by alex on 14.12.13.
 */
public class XQuerySceneBuilder  implements SceneBuilder {
    private Scene scene;
    private Iterator<String> iterModelId;
    private Analyzer analyzer;
    private QueriesExecutor executor;
    private Command loadIdNames;
    private void fillCommands(String filename) {
        loadIdNames = new LoadIdNamesCommand(analyzer, executor, filename);
    }
    public XQuerySceneBuilder(String filename) {
        // !!!!!!! пространство имён по умолчанию
        executor = S9ApiQueriesExecutor.getInstance("http://www.collada.org/2005/11/COLLADASchema");
        analyzer = new Analyzer();
        fillCommands(filename);
    }
    @Override
    public void buildScene() throws Exception{
        scene = new Scene();
        List<String> lstModelId = loadIdNames.execute("");
        iterModelId = lstModelId.iterator();
    }
    @Override
    public void buildModel() throws Exception {
        String modelId = iterModelId.next();
        XQueryModel model = new XQueryModel(modelId);
        scene.add(model);

    }
    @Override
    public boolean canBuildModel() {
        return iterModelId.hasNext();
    }
    @Override
    public Scene getScene() {
        return scene;
    }
}
