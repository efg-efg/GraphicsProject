package graphproj.loader;

import graphproj.scene.*;

/**
 * Created by alex on 14.12.13.
 */
public class Loader {
    Scene load(SceneBuilder builder) {
        builder.buildScene();
        while(builder.canbuildModel())
            builder.buildModel();
        return builder.getScene();
    }
}
