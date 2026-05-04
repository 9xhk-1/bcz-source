package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import c40.l2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
        final /* synthetic */ WindowInsetsAnimationController $animationController;
        final /* synthetic */ int $current;
        final /* synthetic */ float $flingAmount;
        final /* synthetic */ int $target;
        final /* synthetic */ boolean $targetShown;
        int label;
        final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i11, int i12, float f11, WindowInsetsAnimationController windowInsetsAnimationController, boolean z11, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$current = i11;
            this.$target = i12;
            this.$flingAmount = f11;
            this.$animationController = windowInsetsAnimationController;
            this.$targetShown = z11;
            this.this$0 = windowInsetsNestedScrollConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, this.this$0, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float e11 = l00.a.e(this.$target);
                Float e12 = l00.a.e(this.$flingAmount);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
                l<Animatable<Float, AnimationVector1D>, g2> lVar = new l<Animatable<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Animatable<Float, AnimationVector1D> animatable) {
                        WindowInsetsNestedScrollConnection.this.adjustInsets(animatable.getValue().floatValue());
                    }
                };
                this.label = 1;
                anonymousClass1 = this;
                if (Animatable.animateTo$default(Animatable$default, e11, null, e12, lVar, anonymousClass1, 2, null) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                anonymousClass1 = this;
            }
            anonymousClass1.$animationController.finish(anonymousClass1.$targetShown);
            anonymousClass1.this$0.animationController = null;
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i11, int i12, float f11, WindowInsetsAnimationController windowInsetsAnimationController, boolean z11, j00.c<? super WindowInsetsNestedScrollConnection$fling$3> cVar) {
        super(2, cVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i11;
        this.$target = i12;
        this.$flingAmount = f11;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, cVar);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l2 f11;
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        r0 r0Var = (r0) this.L$0;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
        f11 = c40.k.f(r0Var, null, null, new AnonymousClass1(this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, windowInsetsNestedScrollConnection, null), 3, null);
        windowInsetsNestedScrollConnection.animationJob = f11;
        return g2.f100423a;
    }
}
