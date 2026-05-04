package androidx.compose.material;

import c40.r0;
import e3.a;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {a.f48454z}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultFloatingActionButtonElevation$elevation$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    int label;
    final /* synthetic */ DefaultFloatingActionButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$1$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation, c<? super DefaultFloatingActionButtonElevation$elevation$1$1> cVar) {
        super(2, cVar);
        this.$animatable = floatingActionButtonElevationAnimatable;
        this.this$0 = defaultFloatingActionButtonElevation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DefaultFloatingActionButtonElevation$elevation$1$1(this.$animatable, this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f11;
        float f12;
        float f13;
        float f14;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            f11 = this.this$0.defaultElevation;
            f12 = this.this$0.pressedElevation;
            f13 = this.this$0.hoveredElevation;
            f14 = this.this$0.focusedElevation;
            this.label = 1;
            if (floatingActionButtonElevationAnimatable.m1687updateElevationlDy3nrA(f11, f12, f13, f14, this) == l11) {
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
