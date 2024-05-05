import java.util.*;
public class dft {

    private static Map<Character, List<Character>> graf = new HashMap<>();

    private static void dft(Character node, Set<Character> visited) {
        if (!visited.contains(node)) {
            System.out.print(node + " ");
            visited.add(node);

            List<Character> neighbors = graf.get(node);
            for (Character neighbor : neighbors) {
                dft(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph();

        System.out.println("Output:");
        Set<Character> visited = new HashSet<>();
        dft('A', visited);
    }
    private static void Graph() {
        graf.put('A', Arrays.asList('B', 'D', 'E'));
        graf.put('B', Arrays.asList('E'));
        graf.put('D', Arrays.asList('G'));
        graf.put('E', Arrays.asList('F', 'H'));
        graf.put('G', Arrays.asList('H'));
        graf.put('H', Arrays.asList('I'));
        graf.put('I', Arrays.asList('F'));
        graf.put('F', Arrays.asList('C', 'H'));
        graf.put('C', new ArrayList<>());
 }
}