package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import c40.s0;
import c40.x;
import c40.z;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,182:1\n85#2:183\n113#2,2:184\n85#2:186\n113#2,2:187\n225#3,8:189\n272#3,14:197\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n73#1:183\n73#1:184,2\n74#1:186\n74#1:187,2\n150#1:189,8\n150#1:197,14\n*E\n"})
/* loaded from: classes.dex */
public final class RippleAnimation {
    public static final int $stable = 8;

    @k
    private final Animatable<Float, AnimationVector1D> animatedAlpha;

    @k
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;

    @k
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;

    @k
    private final MutableState finishRequested$delegate;

    @k
    private final x<g2> finishSignalDeferred;

    @k
    private final MutableState finishedFadingIn$delegate;

    @l
    private Offset origin;
    private final float radius;

    @l
    private Float startRadius;

    @l
    private Offset targetCenter;

    public /* synthetic */ RippleAnimation(Offset offset, float f11, boolean z11, v vVar) {
        this(offset, f11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(c<? super g2> cVar) {
        Object g11 = s0.g(new RippleAnimation$fadeIn$2(this, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(c<? super g2> cVar) {
        Object g11 = s0.g(new RippleAnimation$fadeOut$2(this, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z11) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void setFinishedFadingIn(boolean z11) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r2.fadeOut(r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r7.i(r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.e.n(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.e.n(r7)
            goto L56
        L47:
            kotlin.e.n(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            c40.x<yz.g2> r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(j00.c):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m1869draw4WTKRHQ(@k DrawScope drawScope, long j11) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m1871getRippleStartRadiusuvyYCjk(drawScope.mo3060getSizeNHjbRc()));
        }
        if (this.origin == null) {
            this.origin = Offset.m2257boximpl(drawScope.mo3059getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m2257boximpl(OffsetKt.Offset(Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc()) / 2.0f, Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc()) / 2.0f));
        }
        float floatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f11 = this.startRadius;
        g0.m(f11);
        float lerp = MathHelpersKt.lerp(f11.floatValue(), this.radius, this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        g0.m(offset);
        float m2268getXimpl = Offset.m2268getXimpl(offset.m2278unboximpl());
        Offset offset2 = this.targetCenter;
        g0.m(offset2);
        float lerp2 = MathHelpersKt.lerp(m2268getXimpl, Offset.m2268getXimpl(offset2.m2278unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        g0.m(offset3);
        float m2269getYimpl = Offset.m2269getYimpl(offset3.m2278unboximpl());
        Offset offset4 = this.targetCenter;
        g0.m(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m2269getYimpl, Offset.m2269getYimpl(offset4.m2278unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(j11, Color.m2511getAlphaimpl(j11) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m3041drawCircleVaOC9Bg$default(drawScope, m2508copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float m2337getWidthimpl = Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc());
        float m2334getHeightimpl = Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc());
        int m2498getIntersectrtfAjoo = ClipOp.Companion.m2498getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2984clipRectN_I0leg(0.0f, 0.0f, m2337getWidthimpl, m2334getHeightimpl, m2498getIntersectrtfAjoo);
            DrawScope.m3041drawCircleVaOC9Bg$default(drawScope, m2508copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
        }
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.c0(g2.f100423a);
    }

    private RippleAnimation(Offset offset, float f11, boolean z11) {
        this.origin = offset;
        this.radius = f11;
        this.bounded = z11;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = z.a(null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }
}
