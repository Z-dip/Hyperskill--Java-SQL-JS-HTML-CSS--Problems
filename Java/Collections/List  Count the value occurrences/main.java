import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        int counterList1 = 0;
        int counterList2 = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(elem)) {
                counterList1++;
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).equals(elem)) {
                counterList2++;
            }
        }
        return counterList1 == counterList2;
    }
}
