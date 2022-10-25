package algorithm.datastructure;

public class HashTable {

    private int size = 10000;

    public HashTable() {

    }

    public HashTable (int size) {
        this.size = size;
    }

    public  int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }
}
