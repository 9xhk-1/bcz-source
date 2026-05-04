package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,164:1\n37#1:165\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n46#1:165\n*E\n"})
/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(@k DrawTransform drawTransform, float f11, float f12) {
        drawTransform.inset(f11, f12, f11, f12);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        drawTransform.inset(f11, f12, f11, f12);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m3125rotateRad0AR0LA0(@k DrawTransform drawTransform, float f11, long j11) {
        drawTransform.mo2987rotateUv8p0NA(DegreesKt.degrees(f11), j11);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m3126rotateRad0AR0LA0$default(DrawTransform drawTransform, float f11, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = drawTransform.mo2985getCenterF1C5BW0();
        }
        drawTransform.mo2987rotateUv8p0NA(DegreesKt.degrees(f11), j11);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m3127scale0AR0LA0(@k DrawTransform drawTransform, float f11, long j11) {
        drawTransform.mo2988scale0AR0LA0(f11, f11, j11);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m3128scale0AR0LA0$default(DrawTransform drawTransform, float f11, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = drawTransform.mo2985getCenterF1C5BW0();
        }
        drawTransform.mo2988scale0AR0LA0(f11, f11, j11);
    }

    public static final void inset(@k DrawTransform drawTransform, float f11) {
        drawTransform.inset(f11, f11, f11, f11);
    }
}
