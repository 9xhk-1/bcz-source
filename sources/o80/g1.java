package o80;

import ba0.c2;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;
import org.junit.jupiter.api.condition.OS;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g1 extends c<f1> {
    public g1() {
        super(f1.class);
    }

    @Override // o80.c
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public p80.h O(f1 annotation) {
        boolean z11 = false;
        boolean z12 = annotation.value().length > 0;
        boolean z13 = annotation.architectures().length > 0;
        c2.e(z12 || z13, "You must declare at least one OS or architecture in @EnabledOnOs");
        if (R(annotation) && Q(annotation)) {
            z11 = true;
        }
        String M = M(z11, z12, z13);
        return z11 ? p80.h.c(M) : p80.h.b(M, annotation.disabledReason());
    }

    public final boolean Q(f1 annotation) {
        String[] architectures = annotation.architectures();
        if (architectures.length == 0) {
            return true;
        }
        Stream stream = Arrays.stream(architectures);
        String str = c.f76565b;
        Objects.requireNonNull(str);
        return stream.anyMatch(new h0(str));
    }

    public final boolean R(f1 annotation) {
        OS[] value = annotation.value();
        if (value.length == 0) {
            return true;
        }
        return Arrays.stream(value).anyMatch(new i0());
    }
}
