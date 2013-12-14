package graphproj.scene;

/**
 * Created by alex on 14.12.13.
 */
public interface SceneBuilder {
    void buildScene();
    void buildModel();
    boolean canbuildModel();
    Scene getScene();
}
