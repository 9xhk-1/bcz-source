package kk;

import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Map<ik.b, l<?>> f66803a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map<ik.b, l<?>> f66804b = new HashMap();

    public l<?> a(ik.b bVar, boolean z11) {
        return c(z11).get(bVar);
    }

    @VisibleForTesting
    public Map<ik.b, l<?>> b() {
        return Collections.unmodifiableMap(this.f66803a);
    }

    public final Map<ik.b, l<?>> c(boolean z11) {
        return z11 ? this.f66804b : this.f66803a;
    }

    public void d(ik.b bVar, l<?> lVar) {
        c(lVar.q()).put(bVar, lVar);
    }

    public void e(ik.b bVar, l<?> lVar) {
        Map<ik.b, l<?>> c11 = c(lVar.q());
        if (lVar.equals(c11.get(bVar))) {
            c11.remove(bVar);
        }
    }
}
