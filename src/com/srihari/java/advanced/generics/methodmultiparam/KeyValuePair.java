package com.srihari.java.advanced.generics.methodmultiparam;

// Just an example showing that, we can have multiple generic parameters at class level as well
public class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
