public class llist_6 {
    static class MyHashMap {
        private static final int SIZE = 10000;
        private Node[] nodes;

        private static class Node {
            int key;
            int value;
            Node next;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        public MyHashMap() {
            nodes = new Node[SIZE];
        }

        public void put(int key, int value) {
            int index = getIndex(key);
            Node newNode = new Node(key, value);
            if (nodes[index] == null) {
                nodes[index] = newNode;
            } else {
                Node prev = null;
                Node current = nodes[index];

                while (current != null) {
                    if (current.key == key) {
                        current.value = value;
                        return;
                    }
                    prev = current;
                    current = current.next;
                }
                prev.next = newNode;
            }
        }

        public int get(int key) {
            int index = getIndex(key);
            if (nodes[index] == null) {
                return -1;
            } else {
                Node current = nodes[index];
                while (current != null) {
                    if (current.key == key) {
                        return current.value;
                    }
                    current = current.next;
                }
                return -1;
            }
        }

        public void remove(int key) {
            int index = getIndex(key);
            if (nodes[index] == null) {
                return;
            } else {
                Node prev = null;
                Node current = nodes[index];
                while (current != null) {
                    if (current.key == key) {
                        if (prev == null) {
                            nodes[index] = current.next;
                        } else {
                            prev.next = current.next;
                        }
                        return;
                    }
                    prev = current;
                    current = current.next;
                }
            }
        }

        private int getIndex(int key) {
            return Integer.hashCode(key) % SIZE;
        }
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(3));
        myHashMap.put(2, 1);
        System.out.println(myHashMap.get(2));
        myHashMap.remove(2);
        System.out.println(myHashMap.get(2));
    }
}
