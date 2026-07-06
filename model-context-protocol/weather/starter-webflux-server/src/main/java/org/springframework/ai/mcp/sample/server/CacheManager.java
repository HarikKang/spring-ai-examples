package org.springframework.ai.mcp.sample.server;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    private static Map<String, Object> cache = new HashMap<>();

    public static void put(String key, Object value) {
        cache.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public static <T> T get(String key) {
        return (T) cache.get(key);
    }

    public static boolean contains(String key) {
        return cache.containsKey(key);
    }

    public static void clear() {
        cache.clear();
    }

    public static int size() {
        return cache.size();
    }
}
