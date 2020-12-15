import java.util.*;
import java.util.stream.Collectors;


class CollectorPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<Boolean, List<String>> palindromeOrNo = Arrays.stream(words)
                // write your collector here
                .collect(Collectors.partitioningBy(e -> e.equals(new StringBuilder(e).reverse().toString()))
                );

        palindromeOrNo = new LinkedHashMap<>(palindromeOrNo);

        System.out.println(palindromeOrNo);
    }
}
