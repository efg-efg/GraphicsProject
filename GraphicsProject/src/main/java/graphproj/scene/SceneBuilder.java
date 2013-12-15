package graphproj.scene;

/**
 * Created by alex on 14.12.13.
 */
public interface SceneBuilder {
    void buildScene() throws Exception;
    void buildModel() throws Exception;
    boolean canBuildModel();
    Scene getScene();
}
