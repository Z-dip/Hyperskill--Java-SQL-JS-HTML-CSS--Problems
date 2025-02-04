import java.lang.reflect.Constructor;

/**
 * Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        Constructor[] constructors = clazz.getConstructors();

        for (Constructor construct : constructors) {
            Class[] parameter = construct.getParameterTypes();
            if (parameter.length == 0) {
                return true;
            }
        }
        return false;
    }
}
