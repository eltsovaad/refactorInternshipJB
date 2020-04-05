import java.util.*;

class Test {
    static class Node {
        int id;
        String value;
        Collection<Node> children;

        Node(int id, String value, Collection<Node> children) {
            this.id = id;
            this.value = value;
            this.children = children;
        }
    }

    public static void main(String[] args) {
        Node deepChild = new Node(3, "a", Collections.emptyList());
        Node firstChild = new Node(8, "a", Collections.singletonList(deepChild));
        Node secondChild = new Node(-5, "b", Collections.emptyList());
        Node root = new Node(1, "r", Arrays.asList(firstChild, secondChild));

        printNodes(root);
        // Результат работы:
        // r: 1
        // b: -5
        // a: 3
    }

    private static void printNodes(Node root) {
        //Обход дерева в ширину с перезаписью всех значений id для каждого value
        //т.к. если найдется новый id с таким же value, то он будет либо на том же уровне, либо ниже
        if(root!=null) {
            HashMap<String, Integer> mapOfFoundNodes=new HashMap<>();
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            Node el;
            while (!queue.isEmpty()) {
                el = queue.poll();
                if (!el.children.isEmpty()) {
                    //Добавляем потомков в очередь
                    for (Node i : el.children) {
                        queue.offer(i);
                    }
                }
                //Добавляем в map значения
                mapOfFoundNodes.put(el.value, el.id);
            }
            for(Map.Entry<String,Integer> i: mapOfFoundNodes.entrySet()){
                System.out.print(i.getKey());
                System.out.print(": ");
                System.out.println(i.getValue());
            }
        }
    }
}