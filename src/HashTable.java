public class HashTable {
    private Node[] array = new Node[16];

    public Object put(int v, int k){
        Node temp = new Node();
        temp.value = v;
        temp.key = k;
        temp.hash = temp.key.hashCode()%16;
        if (array[temp.hash] != null){
            Node tempNode = array[temp.hash];
            while (tempNode != null){
                if (tempNode.key == k){
                    return tempNode.value;
                }
                tempNode = tempNode.next;
            }
            temp.next = array[temp.hash];
        }array[temp.hash] = temp;
        return null;
    }

    public Object remove(Integer key){
        int index = key.hashCode()%16;
        if (array[index] != null) {
            Node tempNode = array[index];
            if (tempNode.key == key && tempNode.next == null){
                array[index] = null;
                return tempNode.value;
            }
            if (tempNode.key == key && tempNode.next != null){
                array[index] = tempNode.next;
                return tempNode.value;
            }
            while (tempNode.next != null){
                if (tempNode.next.key == key){
                    Integer tmp = tempNode.next.value;
                    tempNode.next = tempNode.next.next;
                    return tmp;
                }
                tempNode = tempNode.next;
            }
        }
        return null;
    }

    public Object replays(Integer key, Integer v){
        int index = key.hashCode()%16;
        if (array[index] != null) {
            Node tempNode = array[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    Integer x = tempNode.value;
                    tempNode.value = v;
                    return x;
                }
                tempNode = tempNode.next;
            }
        } return null;
    }

    public Object get(Integer key){
        int index = key.hashCode()%16;
        if (array[index] != null) {
            Node tempNode = array[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    return tempNode.value;
                }
                tempNode = tempNode.next;
            }
        } return null;
    }
}
