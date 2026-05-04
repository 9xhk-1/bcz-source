package x80;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f97786a = Pattern.compile("(.+)\\((.*)\\)");

    public Optional<Method> b(final String methodSpecPart, Class<?> clazz) {
        Matcher matcher = f97786a.matcher(methodSpecPart);
        ba0.c2.f(matcher.matches(), new Supplier() { // from class: x80.z0
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Method [%s] does not match pattern [%s]", methodSpecPart, a1.f97786a);
                return format;
            }
        });
        return ReflectionUtils.h0(clazz, matcher.group(1), matcher.group(2));
    }
}
