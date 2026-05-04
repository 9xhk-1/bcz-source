package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import c40.l2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ Ref.FloatRef $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ Ref.FloatRef $endVelocity;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $hidden;
        final /* synthetic */ int $shown;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i11, float f11, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i12, int i13, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z11, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$current = i11;
            this.$flingAmount = f11;
            this.$spec = splineBasedFloatDecayAnimationSpec;
            this.$hidden = i12;
            this.$shown = i13;
            this.this$0 = windowInsetsNestedScrollConnection;
            this.$endVelocity = floatRef;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.this$0, this.$endVelocity, this.$animationController, this.$targetShown, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                float f11 = this.$current;
                float f12 = this.$flingAmount;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
                final int i12 = this.$hidden;
                final int i13 = this.$shown;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                final Ref.FloatRef floatRef = this.$endVelocity;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
                final boolean z11 = this.$targetShown;
                p<Float, Float, g2> pVar = new p<Float, Float, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(Float f13, Float f14) {
                        invoke(f13.floatValue(), f14.floatValue());
                        return g2.f100423a;
                    }

                    public final void invoke(float f13, float f14) {
                        l2 l2Var;
                        float f15 = i12;
                        if (f13 <= i13 && f15 <= f13) {
                            windowInsetsNestedScrollConnection.adjustInsets(f13);
                            return;
                        }
                        floatRef.element = f14;
                        windowInsetsAnimationController.finish(z11);
                        windowInsetsNestedScrollConnection.animationController = null;
                        l2Var = windowInsetsNestedScrollConnection.animationJob;
                        if (l2Var != null) {
                            l2Var.cancel(new WindowInsetsAnimationCancelledException());
                        }
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateDecay(f11, f12, splineBasedFloatDecayAnimationSpec, pVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i11, float f11, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i12, int i13, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z11, j00.c<? super WindowInsetsNestedScrollConnection$fling$2> cVar) {
        super(2, cVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i11;
        this.$flingAmount = f11;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i12;
        this.$shown = i13;
        this.$endVelocity = floatRef;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, cVar);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l2 f11;
        l2 l2Var;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            r0 r0Var = (r0) this.L$0;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            f11 = c40.k.f(r0Var, null, null, new AnonymousClass1(this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, windowInsetsNestedScrollConnection, this.$endVelocity, this.$animationController, this.$targetShown, null), 3, null);
            windowInsetsNestedScrollConnection.animationJob = f11;
            l2Var = this.this$0.animationJob;
            if (l2Var != null) {
                this.label = 1;
                if (l2Var.K0(this) == l11) {
                    return l11;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        this.this$0.animationJob = null;
        return g2.f100423a;
    }
}
