import java.lang.reflect.*;
import java.util.ArrayList;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {

        var annosList = new ArrayList<String>();

        for (Field field: object.getClass().getDeclaredFields()) {
            if (field.getDeclaredAnnotations().length > 0) {
                annosList.add(field.getName());
            }
        }
        return annosList.toArray(String[]::new);

        //   return AnnotationsUtil.getFieldsContainingAnnotations(object);


    }

}
