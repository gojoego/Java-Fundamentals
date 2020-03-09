package labs_examples.testing.data_structures;

// create underlying array
// hash method to get index
// put (key, value)
// get (key)
// remove
// remove: public void remove (K key) {}
// get hash
// check if that index is mull
// return if
// check if first node is the one to be removed
    // if so check if linked list


import java.util.Arrays;

public class CustHashMap<K, V> {

    HashMapNode[] map = new HashMapNode[10];

    public int hash(K key) {
        int hashcode = key.hashCode();
        int index = Math.abs(hashcode % map.length);
        return index;

    }

    public void put(K key, V value) {
        int index = hash(key);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (map[index] == null) {
            map[index] = new HashMapNode(key, value);
            return;
        } else {
            // otherwise, there was a collision
            // we need iterate through the linked list at that index
            HashMapNode node = map[index];

            // traverse the linked list
            while (node.getNext() != null) {
                node = node.getNext();
            }

            // after we exit the while loop above, we'll be at the end of the linked list
            // this is where we can add the new Entry
            node.setNext(new HashMapNode(key, value));
        }

    }

    public V get(K key) {
        int index = hash(key);
        if (map[index] == null) {
            return null;
        }

        HashMapNode<K, V> test = map[index];

        while (test.getKey() != key) {

            if (test.getNext() == null) {
                return null;
            }
            test = test.getNext();
        }

        return test.getValue();
    }

    public void remove(K key) {
        if (get(key) == null) {
            return;
        }

        int index = hash(key);

        HashMapNode<K, V> test = map[index];

        if (test.getKey().equals(key) && test.getNext() != null) {
            map[index] = null;
            return;
        }
        while (test.getNext() != null){
            if (test.getNext().getKey() != key){
                test = test.getNext();
            }
        }
        if (test.getNext().getNext() != null){
            test.getNext() = test.getNext().getNext();
        }
        else {
            test.getNext() = null;
        }
    }

    public boolean contains(K key) {

        // call hash() method at key and set it equal to int index
        int index = hash(key);

        // if the value at map at index is equal to key, return true
        if (map[index].getKey().equals(key)) {
            return true;
        } else if (null != map[index].getNext()) {
            // the value at map at index is not equal to null
            // then iterator through the map
            // while the iterator is not equal to mull
            // and if the iterator key equals key, return true
            HashMapNode iterator = map[index].getNext();
            while (iterator != null){
                if (iterator.getKey().equals(key)){
                    return true;
                } else {
                    iterator = iterator.getNext();
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CustHashMap{" +
                "map=" + Arrays.toString(map) +
                '}';
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

    @Override
    public String toString() {
        return "HashMapNode{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
