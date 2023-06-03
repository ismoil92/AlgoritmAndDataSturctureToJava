import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        for (int i = 0; i < 32; i++) {
            hashTable.put( i + 1, i);
        }
        System.out.println(hashTable.get(30));
        hashTable.replays(30, 2318);

        System.out.println(hashTable.get(30));
        hashTable.remove(30);
        System.out.println(hashTable.get(30));
    }
}