import java.util.*;

class SetUtils {

    /**
     * @return symmetric difference between set1 and set2
     */
    public static Set<String> symmetricDifference(Set<String> set1, Set<String> set2) {
        // write your code here
        Set<String> symetrics = new TreeSet<>(set1);
        Set<String> containing = new HashSet<>();
        for (String isInOrNah : symetrics) {
            if (!(set2.contains(isInOrNah))) {
                containing.add(isInOrNah);
            }
        }
        symetrics.removeAll(symetrics);
        symetrics.addAll(set2);
        for (String isInOrNah : symetrics) {
            if (!(set1.contains(isInOrNah))) {
                containing.add(isInOrNah);
            }
        }

        return containing;
    }

}

/* Do not change the code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strSet1 = scanner.nextLine();
        String strSet2 = scanner.nextLine();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        if (!Objects.equals(strSet1, "empty")) {
            Collections.addAll(set1, strSet1.split("\\s+"));
        }

        if (!Objects.equals(strSet2, "empty")) {
            Collections.addAll(set2, strSet2.split("\\s+"));
        }

        Set<String> resultSet = SetUtils.symmetricDifference(set1, set2);

        System.out.println(String.join(" ", resultSet));
    }
}
