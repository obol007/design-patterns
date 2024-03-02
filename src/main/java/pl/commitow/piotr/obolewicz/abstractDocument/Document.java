package pl.commitow.piotr.obolewicz.abstractDocument;

import java.util.Optional;

public interface Document {
    void put(String key, Object value);
    Object get(String key);
    <T> Optional<T> get(String key, Class<T> clazz);
}
