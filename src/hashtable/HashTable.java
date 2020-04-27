package hashtable;

public class HashTable<K, V> {

    private int DEFAULT_CAPACITY = 10;

    private Entry<K,V>[] table;

    public HashTable(){
        this.table = new Entry[DEFAULT_CAPACITY];
    }

    public HashTable(int capacity){
        this.table = new Entry[capacity];
    }

    public void put(K key, V value) {
        int index = hash(key);

        // 位置未被引用，创建哨兵节点
        if (table[index] == null) {
            table[index] = new Entry<>(null, null, null);
        }

        Entry<K,V> en = table[index];

        if(en.next == null){
            en.next = new Entry<>(key, value, null);
        }else {
            while (en.next != null){
                en = en.next;
                if(en.key == key) {
                    en.value = value;
                    return;
                }
            }
            en.next = new Entry<>(key, value, null);
        }
    }

    public V get(K key) {
        int index = hash(key);
        Entry<K,V> item = table[index];
        if(item == null) {
            return null;
        }
        Entry<K,V> temp = item.next;
        while (temp != null){
            if(key == temp.key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public void delete(K key){
        int index = hash(key);
        Entry<K,V> item = table[index];
        if(item == null || item.next == null) {
            return;
        }
        Entry<K,V> p = null;
        Entry<K,V> temp = item;

        do {
            p = temp;
            temp = temp.next;
            if(key == temp.key) {
                p.next = temp.next;
                return;
            }
        }while (temp.next != null);
    }


    private int hash(Object key) {
        int h;
        return (key == null) ? 0 : ((h = key.hashCode()) ^ (h >>> 16)) % table.length;
    }
}
