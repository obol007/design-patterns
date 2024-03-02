package pl.commitow.piotr.obolewicz.abstractDocument;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConcreteDocument implements Document {
    private final Map<String, Object> properties = new HashMap<>();

    @Override
    public void put(String key, Object value) {
        properties.put(key, value);
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Optional<T> get(String key, Class<T> clazz) {
        return Optional.ofNullable(clazz.cast(properties.get(key)));
    }
}
