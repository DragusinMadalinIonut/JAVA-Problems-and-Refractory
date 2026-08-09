package com.speechify;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CompletableFuture;

/**
 * A Least Recently Used (LRU) cache is a type of cache that evicts the 'least recently used items'
 * when there is a need to constrain its size.
 *
 * For this particular implementation, the size constraint is set at CacheLimits.maxItemsCount.
 * An item is considered accessed whenever `get`, or `set` methods are called with its key.
 *
 * This LRU cache will achieve size constraint by checking the cache size at the time of each new insertion.
 * In the case where the cache has reached its limit, the item least recently accessed will be removed.
 * This removal process will not happen on a separate thread but in the caller's thread,
 * thus potentially blocking their return for a cleanup when deemed necessary.
 *
 * Use the provided in `src/test/java/LruCacheTest.java` to validate your
 * implementation.
 *
 * You may:
 *  - Read online API references for Java standard library or JVM collections.
 * You must not:
 *  - Read guides about how to code an LRU cache.
 */
public interface LRUCache<T> {
    T get(String key);
    void set(String key, T value);
}

/*

Since i can read APi references for JAva's standard library and I can see tests built
for an implemented LRUCache , i opt to reverse engineer the code via the tests I have
 */

public  void getShouldReturnValueForExistingKey() {
        LRUCache<String> lruCache = createLRUCache(new CacheLimits(10));
        lruCache.set("foo", "bar");
        assertEquals("bar", lruCache.get("foo"));
    }
public void createLRUCache1() {
       return  this.maxItemsCount = maxItemsCount;
    }
/*@Test
public void itemIsConsideredAccessedWhenGetIsCalled() {
    LRUCache<String> lruCache = createLRUCache(new CacheLimits(2));
    lruCache.set("1key", "1value");
    lruCache.set("2key", "2value");

    lruCache.get("1key");
    lruCache.set("3key", "3value");

    assertEquals("1value", lruCache.get("1key"));
}*/
    public V get(K key) {
    Node node = map.get(key);

    if (node == null) {
        return null;
    }

    // Move node to the front (or back, depending on implementation)
    remove(node);
    addToFront(node);

    return node.value;
}



```java
@Test
public void getShouldReturnValueForRecreatedKeyAfterItWasPreviouslyRemoved() {
    LRUCache<String> lruCache = createLRUCache(new CacheLimits(1));

    lruCache.set("1key", "1value");
    lruCache.remove("1key");
    lruCache.set("1key", "newValue");

    assertEquals("newValue", lruCache.get("1key"));
}
```

    public void getShouldReturnValueForRecreatedKeyAfterItWasPreviouslyRemoved() {
        LRUCache<String> lruCache = createLRUCache(new CacheLimits(1));

    }