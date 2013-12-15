package graphproj.loader;

import graphproj.scene.*;

/**
 * Created by alex on 14.12.13.
 */
public class Loader {
    public Loader() {}
    public Scene loadScene(SceneBuilder builder) throws Exception {
        builder.buildScene();
        while(builder.canBuildModel())
            builder.buildModel();
        return builder.getScene();
    }
}
