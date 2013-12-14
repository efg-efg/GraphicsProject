package graphproj.scene.xqbuilder;

/**
 * Created by alex on 14.12.13.
 */
interface Command {
    <OutType> OutType execute(String data);
}
