package androidx.compose.runtime.internal;

import kotlin.jvm.internal.d0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(@k String str, @k a<? extends T> aVar) {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection(str);
        try {
            T invoke = aVar.invoke();
            d0.d(1);
            trace.endSection(beginSection);
            d0.c(1);
            return invoke;
        } catch (Throwable th2) {
            d0.d(1);
            Trace.INSTANCE.endSection(beginSection);
            d0.c(1);
            throw th2;
        }
    }
}
