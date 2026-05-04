package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b1 extends a1 {
    @o00.f
    public static final <R> R l(Object lock, x00.a<? extends R> block) {
        R invoke;
        kotlin.jvm.internal.g0.p(lock, "lock");
        kotlin.jvm.internal.g0.p(block, "block");
        synchronized (lock) {
            try {
                invoke = block.invoke();
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
}
