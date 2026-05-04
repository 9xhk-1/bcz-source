package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbsoluteCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,202:1\n113#2:203\n113#2:204\n113#2:205\n113#2:206\n*S KotlinDebug\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShapeKt\n*L\n152#1:203\n153#1:204\n154#1:205\n155#1:206\n*E\n"})
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShapeKt {
    @k
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(@k CornerSize cornerSize) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f14 = 0.0f;
        }
        return AbsoluteCutCornerShape(f11, f12, f13, f14);
    }

    @k
    /* renamed from: AbsoluteCutCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m1003AbsoluteCutCornerShape0680j_4(float f11) {
        return AbsoluteCutCornerShape(CornerSizeKt.m1011CornerSize0680j_4(f11));
    }

    @k
    /* renamed from: AbsoluteCutCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteCutCornerShape m1004AbsoluteCutCornerShapea9UjIt4(float f11, float f12, float f13, float f14) {
        return new AbsoluteCutCornerShape(CornerSizeKt.m1011CornerSize0680j_4(f11), CornerSizeKt.m1011CornerSize0680j_4(f12), CornerSizeKt.m1011CornerSize0680j_4(f13), CornerSizeKt.m1011CornerSize0680j_4(f14));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteCutCornerShape m1005AbsoluteCutCornerShapea9UjIt4$default(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(0);
        }
        return m1004AbsoluteCutCornerShapea9UjIt4(f11, f12, f13, f14);
    }

    @k
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f11) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f11));
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = 0;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return AbsoluteCutCornerShape(i11, i12, i13, i14);
    }

    @k
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i11) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i11));
    }

    @k
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f11, float f12, float f13, float f14) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12), CornerSizeKt.CornerSize(f13), CornerSizeKt.CornerSize(f14));
    }

    @k
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(@IntRange(from = 0, to = 100) int i11, @IntRange(from = 0, to = 100) int i12, @IntRange(from = 0, to = 100) int i13, @IntRange(from = 0, to = 100) int i14) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13), CornerSizeKt.CornerSize(i14));
    }
}
