package da0;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o0 extends b {
    public o0(String... patterns) {
        super(patterns);
    }

    @Override // da0.b, ca0.v
    public Predicate<String> h() {
        return new Predicate() { // from class: da0.l0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean isPresent;
                isPresent = o0.this.o((String) obj).isPresent();
                return isPresent;
            }
        };
    }

    @Override // ca0.v
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public ca0.y apply(final String className) {
        return (ca0.y) o(className).map(new Function() { // from class: da0.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ca0.y f11;
                f11 = ca0.y.f(o0.this.u(className, (Pattern) obj));
                return f11;
            }
        }).orElseGet(new Supplier() { // from class: da0.n0
            @Override // java.util.function.Supplier
            public final Object get() {
                ca0.y c11;
                c11 = ca0.y.c(o0.this.t(className));
                return c11;
            }
        });
    }

    public final String t(String className) {
        return String.format("Class name [%s] does not match any included pattern: %s", className, this.f47517c);
    }

    public String toString() {
        return String.format("%s that includes class names that match one of the following regular expressions: %s", getClass().getSimpleName(), this.f47517c);
    }

    public final String u(String className, Pattern pattern) {
        return String.format("Class name [%s] matches included pattern: '%s'", className, pattern);
    }
}
