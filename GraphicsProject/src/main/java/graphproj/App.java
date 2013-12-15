package graphproj;


import graphproj.loader.Loader;
import graphproj.scene.xqbuilder.XQuerySceneBuilder;
import graphproj.scene.*;
import java.io.*;

public class App {
    public static void main(String[] args ) {
        Loader loader = new Loader();
        String filename = new File("C:\\SharedFolder\\Collada\\ManyObj.dae").toURI().toString();
        boolean exists = new File("C:\\SharedFolder\\Collada\\ManyObj.dae").exists();
        try {
            Scene scene = loader.loadScene(new XQuerySceneBuilder(filename));
            for(Model model : scene)
                System.out.println(model.getModelId());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
