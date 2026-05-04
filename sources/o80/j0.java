package o80;

import ba0.c2;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;
import org.junit.jupiter.api.condition.OS;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j0 extends c<g0> {
    public j0() {
        super(g0.class);
    }

    @Override // o80.c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public p80.h O(g0 annotation) {
        boolean z11 = annotation.value().length > 0;
        boolean z12 = annotation.architectures().length > 0;
        c2.e(z11 || z12, "You must declare at least one OS or architecture in @DisabledOnOs");
        boolean z13 = R(annotation) || Q(annotation);
        String M = M(z13, z11, z12);
        return z13 ? p80.h.c(M) : p80.h.b(M, annotation.disabledReason());
    }

    public final boolean Q(g0 annotation) {
        String[] architectures = annotation.architectures();
        if (architectures.length == 0) {
            return false;
        }
        Stream stream = Arrays.stream(architectures);
        String str = c.f76565b;
        Objects.requireNonNull(str);
        return stream.noneMatch(new h0(str));
    }

    public final boolean R(g0 annotation) {
        OS[] value = annotation.value();
        if (value.length == 0) {
            return false;
        }
        return Arrays.stream(value).noneMatch(new i0());
    }
}
