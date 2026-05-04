package o80;

import java.lang.annotation.Annotation;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c<A extends Annotation> implements p80.k {

    /* renamed from: b, reason: collision with root package name */
    public static final String f76565b = System.getProperty("os.arch");

    /* renamed from: c, reason: collision with root package name */
    public static final String f76566c = System.getProperty("os.name");

    /* renamed from: a, reason: collision with root package name */
    public final Class<A> f76567a;

    public c(Class<A> annotationType) {
        this.f76567a = annotationType;
    }

    public String M(boolean enabled, boolean osSpecified, boolean archSpecified) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(enabled ? "Enabled" : "Disabled");
        sb2.append(osSpecified ? " on operating system: " : " on architecture: ");
        if (osSpecified && archSpecified) {
            sb2.append(String.format("%s (%s)", f76566c, f76565b));
        } else if (osSpecified) {
            sb2.append(f76566c);
        } else {
            sb2.append(f76565b);
        }
        return sb2.toString();
    }

    public final p80.h N() {
        return p80.h.c(String.format("@%s is not present", this.f76567a.getSimpleName()));
    }

    public abstract p80.h O(A annotation);

    @Override // p80.k
    public p80.h h(p80.n context) {
        return (p80.h) org.junit.platform.commons.util.a.p(context.e(), this.f76567a).map(new Function() { // from class: o80.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.this.O((Annotation) obj);
            }
        }).orElseGet(new Supplier() { // from class: o80.b
            @Override // java.util.function.Supplier
            public final Object get() {
                p80.h N;
                N = c.this.N();
                return N;
            }
        });
    }
}
