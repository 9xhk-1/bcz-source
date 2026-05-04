package az;

import io.ktor.util.converters.DataConversionException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConversionServiceJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversionServiceJvm.kt\nio/ktor/util/converters/ConversionServiceJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n1310#2,2:63\n*S KotlinDebug\n*F\n+ 1 ConversionServiceJvm.kt\nio/ktor/util/converters/ConversionServiceJvmKt\n*L\n19#1:63,2\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    public static final Object a(String str, h10.d<?> dVar) {
        if (g0.g(dVar, o0.d(Integer.class))) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (g0.g(dVar, o0.d(Float.class))) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (g0.g(dVar, o0.d(Double.class))) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (g0.g(dVar, o0.d(Long.class))) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (g0.g(dVar, o0.d(Short.class))) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (g0.g(dVar, o0.d(Boolean.class))) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (g0.g(dVar, o0.d(String.class))) {
            return str;
        }
        if (g0.g(dVar, o0.d(Character.class))) {
            return Character.valueOf(str.charAt(0));
        }
        if (g0.g(dVar, o0.d(BigDecimal.class))) {
            return new BigDecimal(str);
        }
        if (g0.g(dVar, o0.d(BigInteger.class))) {
            return new BigInteger(str);
        }
        if (g0.g(dVar, o0.d(UUID.class))) {
            return UUID.fromString(str);
        }
        return null;
    }

    @l
    public static final Object b(@k String value, @k h10.d<?> klass) {
        g0.p(value, "value");
        g0.p(klass, "klass");
        Object a11 = a(value, klass);
        if (a11 != null) {
            return a11;
        }
        Object obj = null;
        if (!w00.b.d(klass).isEnum()) {
            return null;
        }
        Object[] enumConstants = w00.b.d(klass).getEnumConstants();
        if (enumConstants != null) {
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                Object obj2 = enumConstants[i11];
                g0.n(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (g0.g(((Enum) obj2).name(), value)) {
                    obj = obj2;
                    break;
                }
                i11++;
            }
            if (obj != null) {
                return obj;
            }
        }
        throw new DataConversionException("Value " + value + " is not a enum member name of " + klass);
    }

    @l
    public static final List<String> c(@k Object value) {
        g0.p(value, "value");
        if (value instanceof Enum) {
            return a00.g0.l(((Enum) value).name());
        }
        if (value instanceof Integer) {
            return a00.g0.l(((Integer) value).toString());
        }
        if (value instanceof Float) {
            return a00.g0.l(((Float) value).toString());
        }
        if (value instanceof Double) {
            return a00.g0.l(((Double) value).toString());
        }
        if (value instanceof Long) {
            return a00.g0.l(((Long) value).toString());
        }
        if (value instanceof Boolean) {
            return a00.g0.l(((Boolean) value).toString());
        }
        if (value instanceof Short) {
            return a00.g0.l(((Short) value).toString());
        }
        if (value instanceof String) {
            return a00.g0.l(((String) value).toString());
        }
        if (value instanceof Character) {
            return a00.g0.l(((Character) value).toString());
        }
        if (value instanceof BigDecimal) {
            return a00.g0.l(((BigDecimal) value).toString());
        }
        if (value instanceof BigInteger) {
            return a00.g0.l(((BigInteger) value).toString());
        }
        if (value instanceof UUID) {
            return a00.g0.l(((UUID) value).toString());
        }
        return null;
    }
}
