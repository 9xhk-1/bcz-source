package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements p<TransformScope, c<? super g2>, Object> {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref.LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref.LongRef longRef, long j11, AnimationSpec<Offset> animationSpec, c<? super TransformableStateKt$animatePanBy$2> cVar) {
        super(2, cVar);
        this.$previous = longRef;
        this.$offset = j11;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, cVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // x00.p
    public final Object invoke(TransformScope transformScope, c<? super g2> cVar) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m2257boximpl(this.$previous.element), null, 0L, 0L, false, 60, null);
            Offset m2257boximpl = Offset.m2257boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final Ref.LongRef longRef = this.$previous;
            l<AnimationScope<Offset, AnimationVector2D>, g2> lVar = new l<AnimationScope<Offset, AnimationVector2D>, g2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    invoke2(animationScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    TransformScope.m527transformByd4ec7I$default(transformScope, 0.0f, Offset.m2272minusMKHz9U(animationScope.getValue().m2278unboximpl(), Ref.LongRef.this.element), 0.0f, 5, null);
                    Ref.LongRef.this.element = animationScope.getValue().m2278unboximpl();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, m2257boximpl, animationSpec, false, lVar, this, 4, null) == l11) {
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
