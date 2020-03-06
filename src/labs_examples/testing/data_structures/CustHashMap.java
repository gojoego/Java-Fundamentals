package labs_examples.testing.data_structures;

public class CustHashMap<K, V> {

    HashMapNode[] map = new HashMapNode[10];


    public int hash(K key) {
        int hashcode = key.hashCode();
        int index = Math.abs(hashcode % map.length);
        return index;

    }

    public void put(K key, V value) {
        int index = hash(key);
        map[index] = new HashMapNode(key, value);
    }

    public V get(K key) {
        int index = hash(key);
        return (V) map[index];
    }

    public void remove(K key) {
        int index = hash(key);
        if (map[index].getKey().equals(key)) {
            map[index] = null;
        }
    }

    public boolean contains(K key) {
        int index = hash(key);
        if (map[index].getKey().equals(key)) {

            return true;
        }
        return false;
    }

}

class HashMapNode<K, V> {

    private K key;
    private V value;
    private HashMapNode next;

    public HashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public HashMapNode getNext() {
        return next;
    }

    public void setNext(HashMapNode next) {
        this.next = next;
    }
}
