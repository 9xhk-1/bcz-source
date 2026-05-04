package androidx.compose.runtime;

import c40.r0;
import c40.s0;
import j00.c;
import m80.k;
import m80.l;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;

    @k
    private static final Object ProduceAnotherFrame = new Object();

    @k
    private static final Object FramePending = new Object();

    @l
    public static final <R> Object withRunningRecomposer(@k q<? super r0, ? super Recomposer, ? super c<? super R>, ? extends Object> qVar, @k c<? super R> cVar) {
        return s0.g(new RecomposerKt$withRunningRecomposer$2(qVar, null), cVar);
    }
}
