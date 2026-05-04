package da0;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b0 extends b {
    public b0(String... patterns) {
        super(patterns);
    }

    public static /* synthetic */ boolean p(b0 b0Var, String str) {
        return !b0Var.o(str).isPresent();
    }

    @Override // da0.b, ca0.v
    public Predicate<String> h() {
        return new Predicate() { // from class: da0.a0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return b0.p(b0.this, (String) obj);
            }
        };
    }

    @Override // ca0.v
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public ca0.y apply(final String className) {
        return (ca0.y) o(className).map(new Function() { // from class: da0.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ca0.y c11;
                c11 = ca0.y.c(b0.this.t(className, (Pattern) obj));
                return c11;
            }
        }).orElseGet(new Supplier() { // from class: da0.z
            @Override // java.util.function.Supplier
            public final Object get() {
                ca0.y f11;
                f11 = ca0.y.f(b0.this.u(className));
                return f11;
            }
        });
    }

    public final String t(String className, Pattern pattern) {
        return String.format("Class name [%s] matches excluded pattern: '%s'", className, pattern);
    }

    public String toString() {
        return String.format("%s that excludes class names that match one of the following regular expressions: %s", getClass().getSimpleName(), this.f47517c);
    }

    public final String u(String className) {
        return String.format("Class name [%s] does not match any excluded pattern: %s", className, this.f47517c);
    }
}
