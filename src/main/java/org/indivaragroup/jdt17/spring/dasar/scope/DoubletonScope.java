package org.indivaragroup.jdt17.spring.dasar.scope;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class DoubletonScope implements Scope {

    private final Map<String, Object> objects = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (objects.size() >= 2) {
            int index = objects.size() % 2;
            return objects.values().toArray()[index];
        }
        Object object = objectFactory.getObject();
        objects.put(name + objects.size(), object);
        return object;
    }

    @Override
    public Object remove(String name) {
        return objects.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public @Nullable Object resolveContextualObject(String key) {
        return Scope.super.resolveContextualObject(key);
    }

    @Override
    public @Nullable String getConversationId() {
        return Scope.super.getConversationId();
    }

    // ... other methods
}
