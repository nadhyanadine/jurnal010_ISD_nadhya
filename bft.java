import java.util.*;

public class bft {
    private Map<Character, List<Character>> list;

    public bft() {
        this.list = new HashMap<>();
        Graph();
    }

    private void Graph() {
        list.put('A', Arrays.asList('B', 'E', 'D'));
        list.put('B', Arrays.asList('E'));
        list.put('D', Arrays.asList('G'));
        list.put('E', Arrays.asList('H', 'F'));
        list.put('G', Arrays.asList('H'));
        list.put('H', Arrays.asList('I'));
        list.put('I', Arrays.asList('F'));
        list.put('F', Arrays.asList('H', 'C'));
        list.put('C', Arrays.asList('B'));
    }

    public void bft(char bft) {
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();

        queue.offer(bft);
        visited.add(bft);

        while (!queue.isEmpty()) {
            char vertex = queue.poll();
            System.out.print(vertex + " ");

            List<Character> neighbors = list.get(vertex);
            if (neighbors != null) {
                for (char neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        bft graph = new bft();

        System.out.println("Output:");
        graph.bft('A');
    }
}