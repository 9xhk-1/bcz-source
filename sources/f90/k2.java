package f90;

import java.lang.reflect.Method;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k2 implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f51385a = d.c(null);

    @Override // f90.e
    public Stream<? extends d> a(p80.n context) {
        final Method a02 = context.a0();
        ba0.c2.f(org.junit.jupiter.api.a2.a(a02) > 0, new Supplier() { // from class: f90.j2
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("@NullSource cannot provide a null argument to method [%s]: the method does not declare any formal parameters.", a02.toGenericString());
                return format;
            }
        });
        return Stream.of(f51385a);
    }
}
