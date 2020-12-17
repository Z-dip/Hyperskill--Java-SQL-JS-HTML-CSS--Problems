import java.util.ArrayList;
import java.util.Arrays;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
       var arrayList = new ArrayList<String>();


        for (Field field: object.getClass().getDeclaredFields()) {
            int modifier = field.getModifiers();
            if (Modifier.isPublic(modifier)) {
                arrayList.add(field.getName());
            }
        }


        return arrayList.toArray(String[]::new);
    }

}
