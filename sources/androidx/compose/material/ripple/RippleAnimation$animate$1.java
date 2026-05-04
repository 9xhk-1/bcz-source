package androidx.compose.material.ripple;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {77, 79, 80}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
public final class RippleAnimation$animate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RippleAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, c<? super RippleAnimation$animate$1> cVar) {
        super(cVar);
        this.this$0 = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animate(this);
    }
}
