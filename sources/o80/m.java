package o80;

import ba0.c2;
import java.util.function.Function;
import org.junit.jupiter.api.condition.JRE;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m extends j<k> {
    public m() {
        super(k.class, e1.f76573e, e1.f76574f, new Function() { // from class: o80.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((k) obj).disabledReason();
            }
        });
    }

    @Override // o80.j
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public boolean O(k annotation) {
        JRE min = annotation.min();
        JRE max = annotation.max();
        c2.e((min == JRE.JAVA_8 && max == JRE.OTHER) ? false : true, "You must declare a non-default value for min or max in @DisabledForJreRange");
        c2.e(max.compareTo(min) >= 0, "@DisabledForJreRange.min must be less than or equal to @DisabledForJreRange.max");
        return !JRE.isCurrentVersionWithinRange(min, max);
    }
}
