// Do not remove imports
import java.lang.reflect.*;
import java.util.Set;
import java.util.Scanner;

class ListParameterInspector {
    // Do not change the method
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String methodName = scanner.next();

        ListParameterInspector inspector = new ListParameterInspector();
        inspector.printParameterType(new TestClass(), methodName);
    }

    public void printParameterType(TestClass obj, String methodName) throws Exception {
        // Add implementation here
        Method method = TestClass.class.getDeclaredMethod(methodName);
        ParameterizedType parameterizedType = (ParameterizedType) method.getGenericReturnType();
        WildcardType wildcardType = (WildcardType) parameterizedType.getActualTypeArguments()[0];
        for (Type type : wildcardType.getUpperBounds()) {
            System.out.println(type.getTypeName());
        }
    }

}
