package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Utils_jvmKt {
    public static final int identityHashCode(@l Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(@k Composer composer, @k p<? super Composer, ? super Integer, g2> pVar) {
        g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((p) x0.q(pVar, 2)).invoke(composer, 1);
    }
}
