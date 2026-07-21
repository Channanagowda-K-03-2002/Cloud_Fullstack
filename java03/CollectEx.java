package java03;
import java.util.ArrayList;
import java.util.Stack;
class StackEx {
    StackEx(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.remove(0);
        System.out.println("Stack: " + stack);
}
}

class QueueEx {
    QueueEx(){
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.poll();
        queue.offer(4);
        queue.peek();
        queue.element();
        queue.size();
        queue.isEmpty();
        queue.contains(2);
        queue.toArray();
        queue.iterator();
        //queue.clear();
        System.out.println("Queue: " + queue);
    }
}

class mapEx {
    mapEx(){
        java.util.Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.remove(2);
        map.get(1);
        map.size();
        map.isEmpty();
        map.containsKey(3);
        map.containsValue("Three");
        map.keySet();
        map.values();
        map.entrySet();
        //map.clear();
        System.out.println("Map: " + map);
    }
}

class setEx {
    setEx(){
        java.util.Set<Integer> set = new java.util.HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);
        set.size();
        set.isEmpty();
        set.contains(3);
        set.toArray();
        set.iterator();
        //set.clear();

        System.out.println("Set: " + set);
    }
}

public class CollectEx {

    public void reverse(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        CollectEx collectEx = new CollectEx();
        // StackEx stackEx = new StackEx();
        // QueueEx queueEx = new QueueEx();
        // mapEx mapEx = new mapEx();
        //setEx setEx = new setEx();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original List: " + list);
        collectEx.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
