package androidx.compose.ui.util;

import android.os.Trace;
import kotlin.jvm.internal.d0;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(@k String str, @k a<? extends T> aVar) {
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
