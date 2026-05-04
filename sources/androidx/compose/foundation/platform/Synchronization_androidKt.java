package androidx.compose.foundation.platform;

import kotlin.jvm.internal.d0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Synchronization_androidKt {
    @k
    public static final Object makeSynchronizedObject(@l Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m986synchronized(@k Object obj, @k a<? extends R> aVar) {
        R invoke;
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        return invoke;
    }

    public static /* synthetic */ void SynchronizedObject$annotations() {
    }
}
