package graphproj;


import graphproj.loader.Loader;
import graphproj.scene.xqbuilder.XQuerySceneBuilder;
import java.io.*;

public class App {
    public static void main(String[] args ) {
        Loader loader = new Loader();
        String filename = new File("C:\\SharedFolder\\Collada\\ManyObj.dae").toURI().toString();
        try {
            loader.loadScene(new XQuerySceneBuilder(filename));
        } catch(Exception ex) {

        }

    }
}
