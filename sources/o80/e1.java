package o80;

import ba0.c2;
import java.util.Arrays;
import java.util.function.Function;
import org.junit.jupiter.api.condition.JRE;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e1 extends j<c1> {

    /* renamed from: e, reason: collision with root package name */
    public static final String f76573e = "Enabled on JRE version: " + System.getProperty("java.version");

    /* renamed from: f, reason: collision with root package name */
    public static final String f76574f = "Disabled on JRE version: " + System.getProperty("java.version");

    public e1() {
        super(c1.class, f76573e, f76574f, new Function() { // from class: o80.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((c1) obj).disabledReason();
            }
        });
    }

    @Override // o80.j
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public boolean O(c1 annotation) {
        JRE[] value = annotation.value();
        c2.e(value.length > 0, "You must declare at least one JRE in @EnabledOnJre");
        return Arrays.stream(value).anyMatch(new e0());
    }
}
