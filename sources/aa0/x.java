package aa0;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import org.junit.platform.commons.support.conversion.ConversionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Function<String, ?>> f2492a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(File.class, new Function() { // from class: aa0.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new File((String) obj);
            }
        });
        hashMap.put(Charset.class, new Function() { // from class: aa0.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Charset.forName((String) obj);
            }
        });
        hashMap.put(a90.r0.a(), new Function() { // from class: aa0.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.d((String) obj);
            }
        });
        hashMap.put(URI.class, new Function() { // from class: aa0.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return URI.create((String) obj);
            }
        });
        hashMap.put(URL.class, new Function() { // from class: aa0.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                URL f11;
                f11 = x.f((String) obj);
                return f11;
            }
        });
        hashMap.put(Currency.class, new Function() { // from class: aa0.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Currency.getInstance((String) obj);
            }
        });
        hashMap.put(Locale.class, new Function() { // from class: aa0.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Locale((String) obj);
            }
        });
        hashMap.put(UUID.class, new Function() { // from class: aa0.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return UUID.fromString((String) obj);
            }
        });
        f2492a = Collections.unmodifiableMap(hashMap);
    }

    public static /* synthetic */ Object d(String str) {
        Path path;
        path = Paths.get(str, new String[0]);
        return path;
    }

    public static URL f(String url) {
        try {
            return URI.create(url).toURL();
        } catch (MalformedURLException e11) {
            throw new ConversionException("Failed to convert String \"" + url + "\" to type java.net.URL", e11);
        }
    }

    @Override // aa0.l1
    public boolean a(Class<?> targetType) {
        return f2492a.containsKey(targetType);
    }

    @Override // aa0.l1
    public Object c(String source, Class<?> targetType) throws Exception {
        return f2492a.get(targetType).apply(source);
    }
}
