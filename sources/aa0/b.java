package aa0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.commons.support.conversion.ConversionException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.11", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List<l1> f2480a = Collections.unmodifiableList(Arrays.asList(new k(), new m(), new k1(), new o(), new y(), new b1(), new x(), new i()));

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T b(String str, Class<T> cls, ClassLoader classLoader) {
        String typeName;
        String typeName2;
        String typeName3;
        if (str == 0) {
            if (!cls.isPrimitive()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot convert null to primitive value of type ");
            typeName3 = cls.getTypeName();
            sb2.append(typeName3);
            throw new ConversionException(sb2.toString());
        }
        if (String.class.equals(cls)) {
            return str;
        }
        final Class<?> c11 = c(cls);
        Optional<l1> findFirst = f2480a.stream().filter(new Predicate() { // from class: aa0.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean a11;
                a11 = ((l1) obj).a(c11);
                return a11;
            }
        }).findFirst();
        if (!findFirst.isPresent()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No built-in converter for source type java.lang.String and target type ");
            typeName = cls.getTypeName();
            sb3.append(typeName);
            throw new ConversionException(sb3.toString());
        }
        if (classLoader == null) {
            try {
                classLoader = ba0.m.b();
            } catch (Exception e11) {
                if (e11 instanceof ConversionException) {
                    throw ((ConversionException) e11);
                }
                typeName2 = cls.getTypeName();
                throw new ConversionException(String.format("Failed to convert String \"%s\" to type %s", str, typeName2), e11);
            }
        }
        return (T) findFirst.get().b(str, c11, classLoader);
    }

    public static Class<?> c(Class<?> targetType) {
        Class<?> J0 = ReflectionUtils.J0(targetType);
        return J0 != null ? J0 : targetType;
    }
}
