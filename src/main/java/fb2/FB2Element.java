package fb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hav on 23.08.16.
 */
public abstract class FB2Element {

    private Map<String, String> attrs = new HashMap<>();

    private List<FB2Element> children = new ArrayList<>();

    public abstract String getName();

    public List<FB2Element> getChildren() {
        return children;
    }

    public Map<String, String> getAttrs() {
        return attrs;
    }
}
