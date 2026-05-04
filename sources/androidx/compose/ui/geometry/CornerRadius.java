package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,188:1\n48#1:193\n53#1:196\n48#1:231\n53#1:234\n48#1:236\n48#1:239\n53#1:242\n60#2:189\n70#2:191\n60#2:194\n70#2:197\n53#2,3:199\n60#2:202\n70#2:204\n60#2:205\n70#2:207\n53#2,3:209\n60#2:212\n70#2:214\n53#2,3:216\n60#2:219\n70#2:221\n53#2,3:222\n60#2:225\n70#2:227\n53#2,3:228\n60#2:232\n70#2:235\n60#2:237\n60#2:240\n70#2:243\n22#3:190\n22#3:192\n22#3:195\n22#3:198\n22#3:203\n22#3:206\n22#3:208\n22#3:213\n22#3:215\n22#3:220\n22#3:226\n22#3:233\n22#3:238\n22#3:241\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n55#1:193\n57#1:196\n158#1:231\n158#1:234\n159#1:236\n161#1:239\n161#1:242\n48#1:189\n53#1:191\n55#1:194\n57#1:197\n64#1:199,3\n63#1:202\n63#1:204\n111#1:205\n112#1:207\n110#1:209,3\n127#1:212\n128#1:214\n126#1:216,3\n142#1:219\n142#1:221\n142#1:222,3\n154#1:225\n154#1:227\n154#1:228,3\n158#1:232\n158#1:235\n159#1:237\n161#1:240\n161#1:243\n48#1:190\n53#1:192\n55#1:195\n57#1:198\n63#1:203\n111#1:206\n112#1:208\n127#1:213\n128#1:215\n142#1:220\n154#1:226\n158#1:233\n159#1:238\n161#1:241\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class CornerRadius {

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m2222constructorimpl(0);
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m2240getZerokKHJgLs() {
            return CornerRadius.Zero;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m2239getZerokKHJgLs$annotations() {
        }
    }

    private /* synthetic */ CornerRadius(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m2219boximpl(long j11) {
        return new CornerRadius(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2220component1impl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2221component2impl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m2223copyOHQCggk(long j11, float f11, float f12) {
        return m2222constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m2224copyOHQCggk$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (4294967295L & j11));
        }
        return m2223copyOHQCggk(j11, f11, f12);
    }

    @Stable
    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m2225divBz7bX_o(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f11;
        return m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2226equalsimpl(long j11, Object obj) {
        return (obj instanceof CornerRadius) && j11 == ((CornerRadius) obj).m2238unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2227equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m2228getXimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m2229getYimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2230hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: isCircular-impl, reason: not valid java name */
    public static final boolean m2231isCircularimpl(long j11) {
        return (j11 >>> 32) == (j11 & 4294967295L);
    }

    @Stable
    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m2232isZeroimpl(long j11) {
        long j12 = j11 & 9223372034707292159L;
        return (((~j12) & (j12 - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    @Stable
    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m2233minusvF7bmM(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m2234plusvF7bmM(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j12 & 4294967295L));
        return m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m2235timesBz7bX_o(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return m2222constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2236toStringimpl(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i11), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i11), 1) + j2.O + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i12), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m2237unaryMinuskKHJgLs(long j11) {
        return m2222constructorimpl(j11 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m2226equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m2230hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m2236toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2238unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2222constructorimpl(long j11) {
        return j11;
    }
}
