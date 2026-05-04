package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,197:1\n113#2:198\n113#2:199\n113#2:200\n113#2:201\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n147#1:198\n148#1:199\n149#1:200\n150#1:201\n*E\n"})
/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShapeKt {
    @k
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(@k CornerSize cornerSize) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f11, float f12, float f13, float f14, int i11, Object obj) {
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
        return AbsoluteRoundedCornerShape(f11, f12, f13, f14);
    }

    @k
    /* renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m1007AbsoluteRoundedCornerShape0680j_4(float f11) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m1011CornerSize0680j_4(f11));
    }

    @k
    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m1008AbsoluteRoundedCornerShapea9UjIt4(float f11, float f12, float f13, float f14) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m1011CornerSize0680j_4(f11), CornerSizeKt.m1011CornerSize0680j_4(f12), CornerSizeKt.m1011CornerSize0680j_4(f13), CornerSizeKt.m1011CornerSize0680j_4(f14));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m1009AbsoluteRoundedCornerShapea9UjIt4$default(float f11, float f12, float f13, float f14, int i11, Object obj) {
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
        return m1008AbsoluteRoundedCornerShapea9UjIt4(f11, f12, f13, f14);
    }

    @k
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f11) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f11));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i11, int i12, int i13, int i14, int i15, Object obj) {
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
        return AbsoluteRoundedCornerShape(i11, i12, i13, i14);
    }

    @k
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i11) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i11));
    }

    @k
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f11, float f12, float f13, float f14) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12), CornerSizeKt.CornerSize(f13), CornerSizeKt.CornerSize(f14));
    }

    @k
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(@IntRange(from = 0, to = 100) int i11, @IntRange(from = 0, to = 100) int i12, @IntRange(from = 0, to = 100) int i13, @IntRange(from = 0, to = 100) int i14) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13), CornerSizeKt.CornerSize(i14));
    }
}
