package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import e40.i0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements x00.p<i0<? super Rect>, j00.c<? super g2>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, j00.c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> cVar) {
        super(2, cVar);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(i0 i0Var, View v11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Rect trackPipAnimationHintView$positionInWindow;
        if (i11 == i15 && i13 == i17 && i12 == i16 && i14 == i18) {
            return;
        }
        g0.o(v11, "v");
        trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(v11);
        i0Var.m(trackPipAnimationHintView$positionInWindow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(i0 i0Var, View view) {
        Rect trackPipAnimationHintView$positionInWindow;
        trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view);
        i0Var.m(trackPipAnimationHintView$positionInWindow);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, cVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // x00.p
    public final Object invoke(i0<? super Rect> i0Var, j00.c<? super g2> cVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View$OnAttachStateChangeListener, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Rect trackPipAnimationHintView$positionInWindow;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final i0 i0Var = (i0) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.t
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(i0.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.u
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(i0.this, view);
                }
            };
            final View view2 = this.$view;
            final ?? r32 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v11) {
                    Rect trackPipAnimationHintView$positionInWindow2;
                    g0.p(v11, "v");
                    i0<Rect> i0Var2 = i0Var;
                    trackPipAnimationHintView$positionInWindow2 = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view2);
                    i0Var2.m(trackPipAnimationHintView$positionInWindow2);
                    view2.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view2.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v11) {
                    g0.p(v11, "v");
                    v11.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    v11.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (this.$view.isAttachedToWindow()) {
                trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view);
                i0Var.m(trackPipAnimationHintView$positionInWindow);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r32);
            final View view3 = this.$view;
            x00.a<g2> aVar = new x00.a<g2>() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    view3.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view3.removeOnLayoutChangeListener(onLayoutChangeListener);
                    view3.removeOnAttachStateChangeListener(r32);
                }
            };
            this.label = 1;
            if (e40.g0.b(i0Var, aVar, this) == l11) {
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
