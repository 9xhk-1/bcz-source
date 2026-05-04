package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n60#2:435\n70#2:438\n53#2,3:441\n53#2,3:445\n53#2,3:449\n53#2,3:453\n53#2,3:457\n53#2,3:461\n53#2,3:465\n22#3:436\n22#3:439\n123#4:437\n123#4:440\n363#4:468\n52#5:444\n49#5:448\n68#5:452\n66#5:456\n60#5:460\n58#5:464\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n296#1:435\n301#1:438\n307#1:441,3\n312#1:445,3\n317#1:449,3\n325#1:453,3\n329#1:457,3\n333#1:461,3\n337#1:465,3\n296#1:436\n301#1:439\n296#1:437\n301#1:440\n341#1:468\n312#1:444\n317#1:448\n325#1:452\n329#1:456\n333#1:460\n337#1:464\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class DpSize {
    private final long packedValue;

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m5204constructorimpl(0);
    private static final long Unspecified = m5204constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m5222getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m5223getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m5201boximpl(long j11) {
        return new DpSize(j11);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m5202component1D9Ej5fM(long j11) {
        return m5213getWidthD9Ej5fM(j11);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m5203component2D9Ej5fM(long j11) {
        return m5211getHeightD9Ej5fM(j11);
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m5205copyDwJknco(long j11, float f11, float f12) {
        return m5204constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m5206copyDwJknco$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = m5213getWidthD9Ej5fM(j11);
        }
        if ((i11 & 2) != 0) {
            f12 = m5211getHeightD9Ej5fM(j11);
        }
        return m5205copyDwJknco(j11, f11, f12);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m5208divGh9hcWk(long j11, int i11) {
        float f11 = i11;
        float m5115constructorimpl = Dp.m5115constructorimpl(m5213getWidthD9Ej5fM(j11) / f11);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5211getHeightD9Ej5fM(j11) / f11);
        return m5204constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (Float.floatToRawIntBits(m5115constructorimpl2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5209equalsimpl(long j11, Object obj) {
        return (obj instanceof DpSize) && j11 == ((DpSize) obj).m5221unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5210equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m5211getHeightD9Ej5fM(long j11) {
        return Dp.m5115constructorimpl(Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m5213getWidthD9Ej5fM(long j11) {
        return Dp.m5115constructorimpl(Float.intBitsToFloat((int) (j11 >> 32)));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5215hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m5216minuse_xh8Ic(long j11, long j12) {
        float m5115constructorimpl = Dp.m5115constructorimpl(m5213getWidthD9Ej5fM(j11) - m5213getWidthD9Ej5fM(j12));
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5211getHeightD9Ej5fM(j11) - m5211getHeightD9Ej5fM(j12));
        return m5204constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m5115constructorimpl2)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m5217pluse_xh8Ic(long j11, long j12) {
        float m5115constructorimpl = Dp.m5115constructorimpl(m5213getWidthD9Ej5fM(j11) + m5213getWidthD9Ej5fM(j12));
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5211getHeightD9Ej5fM(j11) + m5211getHeightD9Ej5fM(j12));
        return m5204constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (4294967295L & Float.floatToRawIntBits(m5115constructorimpl2)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m5219timesGh9hcWk(long j11, int i11) {
        float f11 = i11;
        float m5115constructorimpl = Dp.m5115constructorimpl(m5213getWidthD9Ej5fM(j11) * f11);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5211getHeightD9Ej5fM(j11) * f11);
        return m5204constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (Float.floatToRawIntBits(m5115constructorimpl2) & 4294967295L));
    }

    @Stable
    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5220toStringimpl(long j11) {
        if (j11 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "DpSize.Unspecified";
        }
        return ((Object) Dp.m5126toStringimpl(m5213getWidthD9Ej5fM(j11))) + " x " + ((Object) Dp.m5126toStringimpl(m5211getHeightD9Ej5fM(j11)));
    }

    public boolean equals(Object obj) {
        return m5209equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5215hashCodeimpl(this.packedValue);
    }

    @Stable
    @k
    public String toString() {
        return m5220toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5221unboximpl() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m5207divGh9hcWk(long j11, float f11) {
        float m5115constructorimpl = Dp.m5115constructorimpl(m5213getWidthD9Ej5fM(j11) / f11);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5211getHeightD9Ej5fM(j11) / f11);
        return m5204constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (Float.floatToRawIntBits(m5115constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m5218timesGh9hcWk(long j11, float f11) {
        float m5115constructorimpl = Dp.m5115constructorimpl(m5213getWidthD9Ej5fM(j11) * f11);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(m5211getHeightD9Ej5fM(j11) * f11);
        return m5204constructorimpl((Float.floatToRawIntBits(m5115constructorimpl) << 32) | (Float.floatToRawIntBits(m5115constructorimpl2) & 4294967295L));
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5212getHeightD9Ej5fM$annotations() {
    }

    @v0
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5214getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5204constructorimpl(long j11) {
        return j11;
    }
}
