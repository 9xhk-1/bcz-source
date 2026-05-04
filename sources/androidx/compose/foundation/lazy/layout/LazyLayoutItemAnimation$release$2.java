package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import c40.r0;
import com.jiongji.andriod.card.R;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {R.styleable.Theme_drawable_sound}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$release$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$release$2(LazyLayoutItemAnimation lazyLayoutItemAnimation, c<? super LazyLayoutItemAnimation$release$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyLayoutItemAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyLayoutItemAnimation$release$2(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyLayoutItemAnimation$release$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            animatable = this.this$0.visibilityAnimation;
            this.label = 1;
            if (animatable.stop(this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
