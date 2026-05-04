package androidx.core.os;

import android.os.Trace;
import kotlin.jvm.internal.d0;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TraceKt {
    @n(message = "Use androidx.tracing.Trace instead", replaceWith = @w0(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(@k String str, @k x00.a<? extends T> aVar) {
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            d0.d(1);
            Trace.endSection();
            d0.c(1);
        }
    }
}
