package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import com.jiongji.andriod.card.R;
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
@d(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", f = "TransformableState.kt", i = {}, l = {R.styleable.Theme_drawable_tab_friends}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TransformableStateKt$animateBy$3 extends SuspendLambda implements p<TransformScope, c<? super g2>, Object> {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ Ref.ObjectRef<AnimationData> $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$3(Ref.ObjectRef<AnimationData> objectRef, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, c<? super TransformableStateKt$animateBy$3> cVar) {
        super(2, cVar);
        this.$previousState = objectRef;
        this.$targetState = animationData;
        this.$animationSpec = delegatingAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.$previousState, this.$targetState, this.$animationSpec, cVar);
        transformableStateKt$animateBy$3.L$0 = obj;
        return transformableStateKt$animateBy$3;
    }

    @Override // x00.p
    public final Object invoke(TransformScope transformScope, c<? super g2> cVar) {
        return ((TransformableStateKt$animateBy$3) create(transformScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimationData animationData;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationDataConverter animationDataConverter = AnimationDataConverter.INSTANCE;
            AnimationData animationData2 = this.$previousState.element;
            animationData = TransformableStateKt.ZeroAnimationVelocity;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(animationDataConverter, animationData2, animationData, 0L, 0L, false, 56, null);
            AnimationData animationData3 = this.$targetState;
            DelegatingAnimationSpec delegatingAnimationSpec = this.$animationSpec;
            final Ref.ObjectRef<AnimationData> objectRef = this.$previousState;
            l<AnimationScope<AnimationData, AnimationVector4D>, g2> lVar = new l<AnimationScope<AnimationData, AnimationVector4D>, g2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    invoke2(animationScope);
                    return g2.f100423a;
                }

                /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object] */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    float zoom = objectRef.element.getZoom() == 0.0f ? 1.0f : animationScope.getValue().getZoom() / objectRef.element.getZoom();
                    transformScope.mo413transformByd4ec7I(zoom, Offset.m2272minusMKHz9U(animationScope.getValue().m403getOffsetF1C5BW0(), objectRef.element.m403getOffsetF1C5BW0()), animationScope.getValue().getDegrees() - objectRef.element.getDegrees());
                    objectRef.element = animationScope.getValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, animationData3, delegatingAnimationSpec, false, lVar, this, 4, null) == l11) {
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
