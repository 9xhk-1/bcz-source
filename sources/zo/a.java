package zo;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {
    public static String a(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        sb2.append('#');
        sb2.append(constructor.getDeclaringClass().getSimpleName());
        sb2.append('(');
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            if (i11 > 0) {
                sb2.append(j2.O);
            }
            sb2.append(parameterTypes[i11].getSimpleName());
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static RuntimeException b(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static void c(Field field) throws JsonIOException {
        try {
            field.setAccessible(true);
        } catch (Exception e11) {
            throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e11);
        }
    }

    public static String d(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e11) {
            return "Failed making constructor '" + a(constructor) + "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e11.getMessage();
        }
    }
}
