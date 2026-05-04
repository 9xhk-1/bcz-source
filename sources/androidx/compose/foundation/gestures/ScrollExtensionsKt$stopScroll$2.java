package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$stopScroll$2 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
    int label;

    public ScrollExtensionsKt$stopScroll$2(c<? super ScrollExtensionsKt$stopScroll$2> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new ScrollExtensionsKt$stopScroll$2(cVar);
    }

    @Override // x00.p
    public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
        return ((ScrollExtensionsKt$stopScroll$2) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        return g2.f100423a;
    }
}
