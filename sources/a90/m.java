package a90;

import ba0.e4;
import java.lang.reflect.AnnotatedElement;
import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m implements p80.k {

    /* renamed from: a, reason: collision with root package name */
    public static final p80.h f2410a = p80.h.c("@Disabled is not present");

    public final p80.h M(AnnotatedElement element, org.junit.jupiter.api.m1 annotation) {
        String value = annotation.value();
        if (!e4.h(value)) {
            value = element + " is @Disabled";
        }
        return p80.h.a(value);
    }

    @Override // p80.k
    public p80.h h(p80.n context) {
        final AnnotatedElement orElse = context.e().orElse(null);
        return (p80.h) org.junit.platform.commons.util.a.m(orElse, org.junit.jupiter.api.m1.class).map(new Function() { // from class: a90.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                p80.h M;
                M = m.this.M(orElse, (org.junit.jupiter.api.m1) obj);
                return M;
            }
        }).orElse(f2410a);
    }
}
