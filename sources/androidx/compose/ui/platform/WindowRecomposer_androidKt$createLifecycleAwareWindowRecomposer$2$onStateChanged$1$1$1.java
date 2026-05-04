package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.m0<Float> $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(kotlinx.coroutines.flow.m0<Float> m0Var, MotionDurationScaleImpl motionDurationScaleImpl, j00.c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1> cVar) {
        super(2, cVar);
        this.$durationScaleStateFlow = m0Var;
        this.$it = motionDurationScaleImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.$durationScaleStateFlow, this.$it, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            kotlinx.coroutines.flow.m0<Float> m0Var = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            kotlinx.coroutines.flow.j<? super Float> jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, j00.c cVar) {
                    return emit(((Number) obj2).floatValue(), (j00.c<? super g2>) cVar);
                }

                public final Object emit(float f11, j00.c<? super g2> cVar) {
                    MotionDurationScaleImpl.this.setScaleFactor(f11);
                    return g2.f100423a;
                }
            };
            this.label = 1;
            if (m0Var.collect(jVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
