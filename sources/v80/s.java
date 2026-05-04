package v80;

import ba0.c2;
import java.lang.Enum;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.8", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class s<E extends Enum<E>> {

    /* renamed from: c, reason: collision with root package name */
    public static final y90.e f93662c = y90.g.c(s.class);

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f93663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93664b;

    public s(Class<E> enumType, String enumDisplayName) {
        this.f93663a = enumType;
        this.f93664b = enumDisplayName;
    }

    public E c(final ca0.j configParams, String key, E defaultValue) {
        c2.r(configParams, "ConfigurationParameters must not be null");
        Objects.requireNonNull(configParams);
        return d(key, new Function() { // from class: v80.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ca0.j.this.get((String) obj);
            }
        }, defaultValue);
    }

    public E d(final String str, Function<String, Optional<String>> function, final E e11) {
        Optional<String> apply = function.apply(str);
        if (apply.isPresent()) {
            final String str2 = null;
            try {
                str2 = apply.get().trim().toUpperCase(Locale.ROOT);
                final E e12 = (E) Enum.valueOf(this.f93663a, str2);
                f93662c.j(new Supplier() { // from class: v80.p
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        String format;
                        format = String.format("Using %s '%s' set via the '%s' configuration parameter.", s.this.f93664b, e12, str);
                        return format;
                    }
                });
                return e12;
            } catch (Exception unused) {
                f93662c.f(new Supplier() { // from class: v80.q
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        String format;
                        format = String.format("Invalid %s '%s' set via the '%s' configuration parameter. Falling back to the %s default value.", s.this.f93664b, str2, str, e11.name());
                        return format;
                    }
                });
            }
        }
        return e11;
    }
}
