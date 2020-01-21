package practiceofcore.hashmap;

public class MyMap<K, V> {
    private Entry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 16;

    private int size = 0;

    public MyMap() {
        this(INITIAL_CAPACITY);
    }

    public MyMap(int size) {
        this.buckets = new Entry[size];
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);

        int bucket = getHash(key) % getBucketSize();

        Entry<K, V> current = buckets[bucket];
        if (current == null) {
            buckets[bucket] = entry;
        }


    }
    public V get(K key) {
        return null;
    }
    private int getBucketSize() {
        return buckets.length;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

}
