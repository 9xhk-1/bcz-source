package androidx.compose.ui.platform;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Synchronization_androidKt {
    @m80.k
    public static final Object makeSynchronizedObject(@m80.l Object obj) {
        return obj == null ? new Object() : obj;
    }

    public static /* synthetic */ Object makeSynchronizedObject$default(Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        return obj == null ? new Object() : obj;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m4301synchronized(@m80.k Object obj, @m80.k x00.a<? extends R> aVar) {
        R invoke;
        synchronized (obj) {
            try {
                invoke = aVar.invoke();
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.d0.d(1);
                kotlin.jvm.internal.d0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.d0.c(1);
        return invoke;
    }

    public static /* synthetic */ void SynchronizedObject$annotations() {
    }
}
