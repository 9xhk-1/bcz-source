package n10;

import a00.r0;
import java.util.Set;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    public static final boolean a(@m80.k d dVar, @m80.k p10.b classDescriptor) {
        g0.p(dVar, "<this>");
        g0.p(classDescriptor, "classDescriptor");
        if (!q20.h.x(classDescriptor)) {
            return false;
        }
        Set<n20.b> b11 = dVar.b();
        n20.b n11 = u20.e.n(classDescriptor);
        return r0.a2(b11, n11 != null ? n11.e() : null);
    }
}
