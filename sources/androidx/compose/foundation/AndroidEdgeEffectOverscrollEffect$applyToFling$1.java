package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {688, 720}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, j00.c<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> cVar) {
        super(cVar);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo213applyToFlingBMRW4eQ(0L, null, this);
    }
}
