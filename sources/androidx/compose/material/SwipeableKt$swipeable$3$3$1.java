package androidx.compose.material;

import a00.l1;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.r0;
import j00.c;
import java.util.Map;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,881:1\n1#2:882\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeableKt$swipeable$3$3$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ Density $density;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ p<T, T, ThresholdConfig> $thresholds;
    final /* synthetic */ float $velocityThreshold;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableKt$swipeable$3$3$1(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, p<? super T, ? super T, ? extends ThresholdConfig> pVar, float f11, c<? super SwipeableKt$swipeable$3$3$1> cVar) {
        super(2, cVar);
        this.$state = swipeableState;
        this.$anchors = map;
        this.$resistance = resistanceConfig;
        this.$density = density;
        this.$thresholds = pVar;
        this.$velocityThreshold = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new SwipeableKt$swipeable$3$3$1(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((SwipeableKt$swipeable$3$3$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Map anchors$material_release = this.$state.getAnchors$material_release();
            this.$state.setAnchors$material_release(this.$anchors);
            this.$state.setResistance$material_release(this.$resistance);
            SwipeableState<T> swipeableState = this.$state;
            final Map<Float, T> map = this.$anchors;
            final p<T, T, ThresholdConfig> pVar = this.$thresholds;
            final Density density = this.$density;
            swipeableState.setThresholds$material_release(new p<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3$3$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Float invoke(Float f11, Float f12) {
                    return invoke(f11.floatValue(), f12.floatValue());
                }

                public final Float invoke(float f11, float f12) {
                    return Float.valueOf(pVar.invoke(l1.K(map, Float.valueOf(f11)), l1.K(map, Float.valueOf(f12))).computeThreshold(density, f11, f12));
                }
            });
            this.$state.setVelocityThreshold$material_release(this.$density.mo377toPx0680j_4(this.$velocityThreshold));
            SwipeableState<T> swipeableState2 = this.$state;
            Object obj2 = this.$anchors;
            this.label = 1;
            if (swipeableState2.processNewAnchors$material_release(anchors$material_release, obj2, this) == l11) {
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
