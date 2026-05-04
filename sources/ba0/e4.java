package ba0;

import ba0.e4;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6522a = a();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f6523b = Pattern.compile("\\s");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f6524a;

        public a(String value) {
            this.f6524a = value;
        }

        @Override // ba0.e4.b
        public <T> T a(Function<String, ? extends T> onePartMapper, BiFunction<String, String, ? extends T> twoPartsMapper) {
            return onePartMapper.apply(this.f6524a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public interface b {
        static /* synthetic */ Object c(Supplier supplier, String str) {
            throw ((RuntimeException) supplier.get());
        }

        <T> T a(Function<String, ? extends T> onePartMapper, BiFunction<String, String, ? extends T> twoPartsMapper);

        default <T> T b(final Supplier<? extends RuntimeException> supplier, BiFunction<String, String, ? extends T> biFunction) {
            return (T) a(new Function() { // from class: ba0.f4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return e4.b.c(supplier, (String) obj);
                }
            }, biFunction);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f6525a;

        /* renamed from: b, reason: collision with root package name */
        public final String f6526b;

        public c(String first, String second) {
            this.f6525a = first;
            this.f6526b = second;
        }

        @Override // ba0.e4.b
        public <T> T a(Function<String, ? extends T> onePartMapper, BiFunction<String, String, ? extends T> twoPartsMapper) {
            return twoPartsMapper.apply(this.f6525a, this.f6526b);
        }
    }

    public static Pattern a() {
        try {
            return Pattern.compile("\\p{Cntrl}", 256);
        } catch (IllegalArgumentException unused) {
            return Pattern.compile("\\p{Cntrl}");
        }
    }

    public static boolean b(String str) {
        return str != null && str.codePoints().anyMatch(new IntPredicate() { // from class: ba0.d4
            @Override // java.util.function.IntPredicate
            public final boolean test(int i11) {
                return Character.isISOControl(i11);
            }
        });
    }

    public static boolean c(String str) {
        return str != null && str.codePoints().anyMatch(new IntPredicate() { // from class: ba0.c4
            @Override // java.util.function.IntPredicate
            public final boolean test(int i11) {
                return Character.isWhitespace(i11);
            }
        });
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + EmailAutoCompleteEditText.f17091d + Integer.toHexString(System.identityHashCode(obj));
    }

    public static boolean e(String str) {
        return !b(str);
    }

    public static boolean f(String str) {
        return !c(str);
    }

    public static boolean g(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean h(String str) {
        return !g(str);
    }

    public static String i(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String obj2 = obj.toString();
                return obj2 != null ? obj2 : "null";
            }
            if (obj.getClass().getComponentType().isPrimitive()) {
                if (obj instanceof boolean[]) {
                    return Arrays.toString((boolean[]) obj);
                }
                if (obj instanceof char[]) {
                    return Arrays.toString((char[]) obj);
                }
                if (obj instanceof short[]) {
                    return Arrays.toString((short[]) obj);
                }
                if (obj instanceof byte[]) {
                    return Arrays.toString((byte[]) obj);
                }
                if (obj instanceof int[]) {
                    return Arrays.toString((int[]) obj);
                }
                if (obj instanceof long[]) {
                    return Arrays.toString((long[]) obj);
                }
                if (obj instanceof float[]) {
                    return Arrays.toString((float[]) obj);
                }
                if (obj instanceof double[]) {
                    return Arrays.toString((double[]) obj);
                }
            }
            return Arrays.deepToString((Object[]) obj);
        } catch (Throwable th2) {
            h4.a(th2);
            return d(obj);
        }
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static String j(String str, String replacement) {
        c2.r(replacement, "replacement must not be null");
        if (str == null) {
            return null;
        }
        return f6522a.matcher(str).replaceAll(replacement);
    }

    @API(since = "1.4", status = API.Status.INTERNAL)
    public static String k(String str, String replacement) {
        c2.r(replacement, "replacement must not be null");
        if (str == null) {
            return null;
        }
        return f6523b.matcher(str).replaceAll(replacement);
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static b l(char separator, String value) {
        c2.r(value, "value must not be null");
        return m(value, value.indexOf(separator), 1);
    }

    public static b m(String value, int index, int length) {
        return index == -1 ? new a(value) : new c(value.substring(0, index), value.substring(index + length));
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static b n(String separator, String value) {
        c2.r(separator, "separator must not be null");
        c2.r(value, "value must not be null");
        return m(value, value.indexOf(separator), separator.length());
    }
}
