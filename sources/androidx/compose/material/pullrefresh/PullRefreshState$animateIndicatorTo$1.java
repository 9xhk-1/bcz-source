package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PullRefreshState$animateIndicatorTo$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ PullRefreshState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements l<c<? super g2>, Object> {
        final /* synthetic */ float $offset;
        int label;
        final /* synthetic */ PullRefreshState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PullRefreshState pullRefreshState, float f11, c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.this$0 = pullRefreshState;
            this.$offset = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$offset, cVar);
        }

        @Override // x00.l
        public final Object invoke(c<? super g2> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f11;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                f11 = this.this$0.get_position();
                float f12 = this.$offset;
                final PullRefreshState pullRefreshState = this.this$0;
                p<Float, Float, g2> pVar = new p<Float, Float, g2>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState.animateIndicatorTo.1.1.1
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(Float f13, Float f14) {
                        invoke(f13.floatValue(), f14.floatValue());
                        return g2.f100423a;
                    }

                    public final void invoke(float f13, float f14) {
                        PullRefreshState.this.set_position(f13);
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animate$default(f11, f12, 0.0f, null, pVar, this, 12, null) == l11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshState$animateIndicatorTo$1(PullRefreshState pullRefreshState, float f11, c<? super PullRefreshState$animateIndicatorTo$1> cVar) {
        super(2, cVar);
        this.this$0 = pullRefreshState;
        this.$offset = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new PullRefreshState$animateIndicatorTo$1(this.this$0, this.$offset, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((PullRefreshState$animateIndicatorTo$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            mutatorMutex = this.this$0.mutatorMutex;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$offset, null);
            this.label = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, anonymousClass1, this, 1, null) == l11) {
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
