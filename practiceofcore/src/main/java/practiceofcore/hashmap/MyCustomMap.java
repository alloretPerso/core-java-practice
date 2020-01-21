package practiceofcore.hashmap;

public class MyCustomMap<K, V> {
    private Entry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 16;

    private int size = 0;

    public MyCustomMap() {
        this(INITIAL_CAPACITY);
    }

    public MyCustomMap(int size) {
        this.buckets = new Entry[size];
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);

        int bucket = getHash(key) % getBucketSize();

        Entry<K, V> current = buckets[bucket];
        if (current == null) {
            buckets[bucket] = entry;
            size++;
        }else {
            while (current.next != null) {
                if (current.key.equals(key)){
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)){
                current.value = value;
            } else {
                current.next = entry;
                size++;
            }
        }
    }

    public V get(K key) {
        return null;
    }

    private int getBucketSize() {
        return buckets.length;
    }

    public int getSize() {
        return size;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

}
