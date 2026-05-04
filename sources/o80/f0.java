package o80;

import ba0.c2;
import java.util.Arrays;
import java.util.function.Function;
import org.junit.jupiter.api.condition.JRE;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f0 extends j<c0> {
    public f0() {
        super(c0.class, e1.f76573e, e1.f76574f, new Function() { // from class: o80.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((c0) obj).disabledReason();
            }
        });
    }

    @Override // o80.j
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public boolean O(c0 annotation) {
        JRE[] value = annotation.value();
        c2.e(value.length > 0, "You must declare at least one JRE in @DisabledOnJre");
        return Arrays.stream(value).noneMatch(new e0());
    }
}
