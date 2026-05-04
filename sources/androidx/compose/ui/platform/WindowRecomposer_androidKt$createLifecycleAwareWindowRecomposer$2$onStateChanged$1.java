package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import c40.l2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {388}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref.ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef<MotionDurationScaleImpl> objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, j00.c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> cVar) {
        super(2, cVar);
        this.$systemDurationScaleSettingConsumer = objectRef;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, cVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [c40.l2] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        l2 l2Var;
        l2 l2Var2;
        kotlinx.coroutines.flow.m0 animationScaleFlowFor;
        l2 f11;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                kotlin.e.n(obj);
                c40.r0 r0Var = (c40.r0) this.L$0;
                try {
                    MotionDurationScaleImpl motionDurationScaleImpl = this.$systemDurationScaleSettingConsumer.element;
                    if (motionDurationScaleImpl != null) {
                        animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                        motionDurationScaleImpl.setScaleFactor(((Number) animationScaleFlowFor.getValue()).floatValue());
                        f11 = c40.k.f(r0Var, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(animationScaleFlowFor, motionDurationScaleImpl, null), 3, null);
                        l2Var2 = f11;
                    } else {
                        l2Var2 = null;
                    }
                    Recomposer recomposer = this.$recomposer;
                    this.L$0 = l2Var2;
                    this.label = 1;
                    r12 = l2Var2;
                    if (recomposer.runRecomposeAndApplyChanges(this) == l11) {
                        return l11;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    l2Var = null;
                    if (l2Var != null) {
                        l2.a.b(l2Var, null, 1, null);
                    }
                    this.$source.getLifecycle().removeObserver(this.$self);
                    throw th2;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l2 l2Var3 = (l2) this.L$0;
                kotlin.e.n(obj);
                r12 = l2Var3;
            }
            if (r12 != 0) {
                l2.a.b(r12, null, 1, null);
            }
            this.$source.getLifecycle().removeObserver(this.$self);
            return g2.f100423a;
        } catch (Throwable th4) {
            th2 = th4;
            l2Var = r12;
        }
    }
}
