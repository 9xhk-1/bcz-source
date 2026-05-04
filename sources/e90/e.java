package e90;

import org.apiguardian.api.API;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.platform.commons.support.conversion.ConversionException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f49610a = new e();

    @Override // e90.b
    public final Object a(Object source, p80.t context) {
        Class<?> type;
        type = context.b().getType();
        return b(source, type, context);
    }

    public final Object b(Object source, Class<?> targetType, p80.t context) {
        String typeName;
        String typeName2;
        Class declaringClass;
        String typeName3;
        if (source == null) {
            if (!targetType.isPrimitive()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot convert null to primitive value of type ");
            typeName3 = targetType.getTypeName();
            sb2.append(typeName3);
            throw new ArgumentConversionException(sb2.toString());
        }
        if (ReflectionUtils.Q0(source, targetType)) {
            return source;
        }
        if (!(source instanceof String)) {
            typeName = source.getClass().getTypeName();
            typeName2 = targetType.getTypeName();
            throw new ArgumentConversionException(String.format("No built-in converter for source type %s and target type %s", typeName, typeName2));
        }
        declaringClass = context.c().getDeclaringClass();
        try {
            return aa0.b.b((String) source, targetType, ba0.m.a(declaringClass));
        } catch (ConversionException e11) {
            throw new ArgumentConversionException(e11.getMessage(), e11);
        }
    }
}
