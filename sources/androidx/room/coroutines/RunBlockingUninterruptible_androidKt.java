package androidx.room.coroutines;

import c40.j;
import c40.r0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class RunBlockingUninterruptible_androidKt {
    public static final <T> T runBlockingUninterruptible(@k p<? super r0, ? super j00.c<? super T>, ? extends Object> block) {
        Object b11;
        g0.p(block, "block");
        Thread.interrupted();
        b11 = j.b(null, new RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(block, null), 1, null);
        return (T) b11;
    }
}
