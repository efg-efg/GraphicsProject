package graphproj.scene.xqbuilder;

import net.sf.saxon.s9api.*;
import java.util.*;

/**
 * Created by alex on 14.12.13.
 */
class XQResXdmValue implements XQueryResult {
    private XdmValue queryResult;
    public XQResXdmValue(XdmValue queryResult) {
        this.queryResult = queryResult;
    }
    private class XdmItemStringIterator implements Iterator<String> {
        private Iterator<XdmItem> xdmItemIterator;
        public XdmItemStringIterator(Iterator<XdmItem> xdmItemIterator) {
            this.xdmItemIterator = xdmItemIterator;
        }
        @Override
        public boolean hasNext() {
            return xdmItemIterator.hasNext();
        }
        @Override
        public String next() {
            return xdmItemIterator.next().getStringValue();
        }
        @Override
        public void remove() {
            xdmItemIterator.remove();
        }
    }
    @Override
    public Iterator<String> iterator() {
        return new XdmItemStringIterator(queryResult.iterator());
    }
}
