package h40;

import c40.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y0 {
    @g2
    public static final <T> T b(@m80.k Object obj, @m80.k x00.a<? extends T> aVar) {
        T invoke;
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

    @g2
    public static /* synthetic */ void a() {
    }
}
