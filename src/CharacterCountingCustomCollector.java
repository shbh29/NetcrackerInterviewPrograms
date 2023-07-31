import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

public class CharacterCountingCustomCollector {
    static class CharacterCountingCollector {
        Map<Character, Integer> cmap = new HashMap();
        void add(char c) {
            if (cmap.containsKey(c)) {
                cmap.put(c, cmap.get(c) + 1);
            } else {
                cmap.put(c, 1);
            }
        }
        static CharacterCountingCollector merge(CharacterCountingCollector one, CharacterCountingCollector other) {
            CharacterCountingCollector current = new CharacterCountingCollector();
            one.cmap.entrySet().stream().forEach(eset -> {
                if (current.cmap.containsKey(eset.getKey())) {
                    current.cmap.put(eset.getKey(), current.cmap.get(eset.getKey()) + eset.getValue());
                }
            });
            other.cmap.entrySet().stream().forEach(eset -> {
                if (current.cmap.containsKey(eset.getKey())) {
                    current.cmap.put(eset.getKey(), current.cmap.get(eset.getKey()) + eset.getValue());
                }
            });
            return current;
        }
        Map<Character, Integer> getMap() {
            return cmap;
        }
    }
    public static void main(String[] args) {
        String str = "java hungggry";
        Map<Character, Integer> cmap = str.chars()
                .mapToObj(e -> (char)e)
                .collect(Collector.of(
                        CharacterCountingCollector::new, //Supplier
                        CharacterCountingCollector::add,  //Accumulator
                        CharacterCountingCollector::merge,  //Combiner in Parallel processing
                        CharacterCountingCollector::getMap  //Finisher
                ));

        System.out.println(cmap);
    }
}
