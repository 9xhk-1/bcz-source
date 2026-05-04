package aa0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Function<String, ?>> f2489a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.class, new Function() { // from class: aa0.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Byte.decode((String) obj);
            }
        });
        hashMap.put(Short.class, new Function() { // from class: aa0.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Short.decode((String) obj);
            }
        });
        hashMap.put(Integer.class, new Function() { // from class: aa0.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.decode((String) obj);
            }
        });
        hashMap.put(Long.class, new Function() { // from class: aa0.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.decode((String) obj);
            }
        });
        hashMap.put(Float.class, new Function() { // from class: aa0.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Float.valueOf((String) obj);
            }
        });
        hashMap.put(Double.class, new Function() { // from class: aa0.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf((String) obj);
            }
        });
        hashMap.put(BigInteger.class, new Function() { // from class: aa0.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new BigInteger((String) obj);
            }
        });
        hashMap.put(BigDecimal.class, new j1());
        f2489a = Collections.unmodifiableMap(hashMap);
    }

    @Override // aa0.l1
    public boolean a(Class<?> targetType) {
        return f2489a.containsKey(targetType);
    }

    @Override // aa0.l1
    public Object c(String source, Class<?> targetType) {
        return f2489a.get(targetType).apply(source.replace("_", ""));
    }
}
