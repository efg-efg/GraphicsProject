package graphproj.scene;

import java.util.*;

/**
 * Created by alex on 14.12.13.
 */
public class Scene implements Iterable<Model> {
    private List<Model> models = new ArrayList<Model>();
    public Scene() {

    }
    public void add(Model model) {
        models.add(model);
    }
    @Override
    public Iterator<Model> iterator() {
        return models.iterator();
    }
}
