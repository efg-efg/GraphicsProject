package graphproj.scene.xqbuilder;

import graphproj.scene.Model;

/**
 * Created by alex on 14.12.13.
 */
class XQueryModel implements Model {
    private String modelId;
    public XQueryModel(String modelId) {
        this.modelId = modelId;
    }
    @Override
    public String getModelId() {
        return modelId;
    }
}
