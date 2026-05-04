package aa0;

import java.util.function.Function;
import org.junit.platform.commons.support.conversion.ConversionException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o implements l1 {
    public static /* synthetic */ ConversionException d(String str, Exception exc) {
        return new ConversionException("Failed to convert String \"" + str + "\" to type java.lang.Class", exc);
    }

    @Override // aa0.l1
    public boolean a(Class<?> targetType) {
        return targetType == Class.class;
    }

    @Override // aa0.l1
    public Object b(final String className, Class<?> targetType, ClassLoader classLoader) throws Exception {
        return ReflectionUtils.Y1(className, classLoader).j(new Function() { // from class: aa0.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return o.d(className, (Exception) obj);
            }
        });
    }

    @Override // aa0.l1
    public Object c(String source, Class<?> targetType) throws Exception {
        throw new UnsupportedOperationException("Invoke convert(String, Class<?>, ClassLoader) instead");
    }
}
