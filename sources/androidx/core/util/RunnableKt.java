package androidx.core.util;

import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class RunnableKt {
    @k
    public static final Runnable asRunnable(@k j00.c<? super g2> cVar) {
        return new ContinuationRunnable(cVar);
    }
}
