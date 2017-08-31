/* get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 put(key, value)-Set or insert value if the key is not already present. 
 When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 
 Make a doubly linked list. Each time you access an element, delete it, and add it to the front.
 If capacity is reached delete the node from tail.
 Logic is keep a hashmap with key  and value will be a node.
 
 * 
 */
class Node {
int key;
int value;
Node pre;
Node next;

public Node(int key, int value) {
	this.key = key;
	this.value = value;
}
}
public class LRUCache {

HashMap<Integer, Node> map;
int capicity, count;
Node head, tail;

public LRUCache(int capacity) {
	this.capicity = capacity;
	map = new HashMap<>();
	head = new Node(0, 0);
	tail = new Node(0, 0);
	head.next = tail;
	tail.pre = head;
	head.pre = null;
	tail.next = null;
	count = 0;
}

public void deleteNode(Node node) {
	node.pre.next = node.next;
	node.next.pre = node.pre;
}

public void addToHead(Node node) {
	node.next = head.next;
	node.next.pre = node;
	node.pre = head;
	head.next = node;
}

public int get(int key) {
	if (map.get(key) != null) {
		Node node = map.get(key);
		int result = node.value;
		deleteNode(node);
		addToHead(node);
		return result;
	}
	return -1;
}

public void put(int key, int value) {
	if (map.get(key) != null) {
		Node node = map.get(key);
		node.value = value;
		deleteNode(node);
		addToHead(node);
	} else {
		Node node = new Node(key, value);
		map.put(key, node);
		if (count < capicity) {
			count++;
			addToHead(node);
		} else {
			map.remove(tail.pre.key);
			deleteNode(tail.pre);
			addToHead(node);
		}
	}
}
}