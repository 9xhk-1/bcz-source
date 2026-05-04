package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@DrawScopeMarker
@u0({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,164:1\n57#2:165\n61#2:168\n57#2:174\n61#2:177\n60#3:166\n70#3:169\n53#3,3:171\n60#3:175\n70#3:178\n22#4:167\n22#4:176\n22#4:179\n30#5:170\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransform\n*L\n80#1:165\n80#1:168\n111#1:174\n112#1:177\n80#1:166\n80#1:169\n80#1:171,3\n111#1:175\n112#1:178\n80#1:167\n111#1:176\n112#1:179\n80#1:170\n*E\n"})
/* loaded from: classes.dex */
public interface DrawTransform {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m3122getCenterF1C5BW0(@k DrawTransform drawTransform) {
            return DrawTransform.super.mo2985getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m3116clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i12 & 2) != 0) {
            i11 = ClipOp.Companion.m2498getIntersectrtfAjoo();
        }
        drawTransform.mo2983clipPathmtrdDE(path, i11);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m3117clipRectN_I0leg$default(DrawTransform drawTransform, float f11, float f12, float f13, float f14, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i12 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i12 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i12 & 4) != 0) {
            f13 = Float.intBitsToFloat((int) (drawTransform.mo2986getSizeNHjbRc() >> 32));
        }
        if ((i12 & 8) != 0) {
            f14 = Float.intBitsToFloat((int) (drawTransform.mo2986getSizeNHjbRc() & 4294967295L));
        }
        if ((i12 & 16) != 0) {
            i11 = ClipOp.Companion.m2498getIntersectrtfAjoo();
        }
        drawTransform.mo2984clipRectN_I0leg(f11, f12, f13, f14, i11);
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m3118rotateUv8p0NA$default(DrawTransform drawTransform, float f11, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i11 & 2) != 0) {
            j11 = drawTransform.mo2985getCenterF1C5BW0();
        }
        drawTransform.mo2987rotateUv8p0NA(f11, j11);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m3119scale0AR0LA0$default(DrawTransform drawTransform, float f11, float f12, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i11 & 4) != 0) {
            j11 = drawTransform.mo2985getCenterF1C5BW0();
        }
        drawTransform.mo2988scale0AR0LA0(f11, f12, j11);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f11, float f12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        drawTransform.translate(f11, f12);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo2983clipPathmtrdDE(@k Path path, int i11);

    /* renamed from: clipRect-N_I0leg */
    void mo2984clipRectN_I0leg(float f11, float f12, float f13, float f14, int i11);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo2985getCenterF1C5BW0() {
        float f11 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (mo2986getSizeNHjbRc() >> 32)) / f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo2986getSizeNHjbRc() & 4294967295L)) / f11;
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: getSize-NH-jbRc */
    long mo2986getSizeNHjbRc();

    void inset(float f11, float f12, float f13, float f14);

    /* renamed from: rotate-Uv8p0NA */
    void mo2987rotateUv8p0NA(float f11, long j11);

    /* renamed from: scale-0AR0LA0 */
    void mo2988scale0AR0LA0(float f11, float f12, long j11);

    /* renamed from: transform-58bKbWc */
    void mo2989transform58bKbWc(@k float[] fArr);

    void translate(float f11, float f12);
}
