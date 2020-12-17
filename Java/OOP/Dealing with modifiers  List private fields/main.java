import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        var lists = new ArrayList<String>();


        for (Field field : object.getClass().getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isPrivate(modifiers)) {
                lists.add(field.getName());
            }
        }
        Collections.sort(lists);
        return lists;
    }

}
