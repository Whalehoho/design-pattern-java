package prototype;

import java.util.HashMap;
import java.util.Map;

// Prototype Registry
public class PrototypeRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public void registerPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        Prototype prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}

