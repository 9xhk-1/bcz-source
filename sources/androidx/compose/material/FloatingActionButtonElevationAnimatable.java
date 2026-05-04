package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FloatingActionButtonElevationAnimatable {

    @k
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;

    @l
    private Interaction lastTargetInteraction;
    private float pressedElevation;

    @l
    private Interaction targetInteraction;

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f11, float f12, float f13, float f14, v vVar) {
        this(f11, f12, f13, f14);
    }

    /* renamed from: calculateTarget-u2uoSUM, reason: not valid java name */
    private final float m1686calculateTargetu2uoSUM(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object snapElevation(j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.e.n(r5)
            androidx.compose.foundation.interaction.Interaction r5 = r4.targetInteraction
            float r5 = r4.m1686calculateTargetu2uoSUM(r5)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r4.animatable
            java.lang.Object r2 = r2.getTargetValue()
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2
            float r2 = r2.m5129unboximpl()
            boolean r2 = androidx.compose.ui.unit.Dp.m5120equalsimpl0(r2, r5)
            if (r2 != 0) goto L70
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r4.animatable     // Catch: java.lang.Throwable -> L69
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.m5113boximpl(r5)     // Catch: java.lang.Throwable -> L69
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L69
            r0.label = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r2.snapTo(r5, r0)     // Catch: java.lang.Throwable -> L69
            if (r5 != r1) goto L63
            return r1
        L63:
            r0 = r4
        L64:
            androidx.compose.foundation.interaction.Interaction r5 = r0.targetInteraction
            r0.lastTargetInteraction = r5
            goto L70
        L69:
            r5 = move-exception
            r0 = r4
        L6b:
            androidx.compose.foundation.interaction.Interaction r1 = r0.targetInteraction
            r0.lastTargetInteraction = r1
            throw r5
        L70:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.snapElevation(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateElevation(@m80.l androidx.compose.foundation.interaction.Interaction r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r7 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.e.n(r7)
            float r7 = r5.m1686calculateTargetu2uoSUM(r6)
            r5.targetInteraction = r6
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r5.animatable     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.getTargetValue()     // Catch: java.lang.Throwable -> L67
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2     // Catch: java.lang.Throwable -> L67
            float r2 = r2.m5129unboximpl()     // Catch: java.lang.Throwable -> L67
            boolean r2 = androidx.compose.ui.unit.Dp.m5120equalsimpl0(r2, r7)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L6a
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r5.animatable     // Catch: java.lang.Throwable -> L67
            androidx.compose.foundation.interaction.Interaction r4 = r5.lastTargetInteraction     // Catch: java.lang.Throwable -> L67
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L67
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L67
            r0.label = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = androidx.compose.material.ElevationKt.m1664animateElevationrAjV9yQ(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L67
            if (r7 != r1) goto L6a
            return r1
        L67:
            r7 = move-exception
            r0 = r5
            goto L70
        L6a:
            r0 = r5
        L6b:
            r0.lastTargetInteraction = r6
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L70:
            r0.lastTargetInteraction = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.animateElevation(androidx.compose.foundation.interaction.Interaction, j00.c):java.lang.Object");
    }

    @k
    public final State<Dp> asState() {
        return this.animatable.asState();
    }

    @l
    /* renamed from: updateElevation-lDy3nrA, reason: not valid java name */
    public final Object m1687updateElevationlDy3nrA(float f11, float f12, float f13, float f14, @k c<? super g2> cVar) {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
        Object snapElevation = snapElevation(cVar);
        return snapElevation == b.l() ? snapElevation : g2.f100423a;
    }

    private FloatingActionButtonElevationAnimatable(float f11, float f12, float f13, float f14) {
        this.defaultElevation = f11;
        this.pressedElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
        this.animatable = new Animatable<>(Dp.m5113boximpl(this.defaultElevation), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }
}
