package androidx.compose.runtime.internal;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class Trace {
    public static final int $stable = 0;

    @k
    public static final Trace INSTANCE = new Trace();

    private Trace() {
    }

    @l
    public final Object beginSection(@k String str) {
        android.os.Trace.beginSection(str);
        return null;
    }

    public final void endSection(@l Object obj) {
        android.os.Trace.endSection();
    }
}
