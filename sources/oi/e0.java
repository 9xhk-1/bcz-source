package oi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e0 {
    public static final void d(List<? extends pi.w> list) {
        final x00.p pVar = new x00.p() { // from class: oi.c0
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                int e11;
                e11 = e0.e((pi.w) obj, (pi.w) obj2);
                return Integer.valueOf(e11);
            }
        };
        Collections.sort(list, new Comparator() { // from class: oi.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f11;
                f11 = e0.f(x00.p.this, obj, obj2);
                return f11;
            }
        });
    }

    public static final int e(pi.w wVar, pi.w wVar2) {
        return g0.t(wVar.a(), wVar2.a());
    }

    public static final int f(x00.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }
}
