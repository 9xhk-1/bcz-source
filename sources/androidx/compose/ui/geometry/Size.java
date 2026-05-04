package androidx.compose.ui.geometry;

import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,199:1\n57#1:204\n61#1:207\n57#1:235\n61#1:238\n60#2:200\n70#2:202\n60#2:205\n70#2:208\n53#2,3:210\n60#2:213\n70#2:215\n60#2:216\n70#2:218\n53#2,3:219\n60#2:222\n70#2:224\n53#2,3:225\n65#2:228\n75#2:230\n65#2:231\n75#2:233\n60#2:236\n70#2:239\n22#3:201\n22#3:203\n22#3:206\n22#3:209\n22#3:214\n22#3:217\n22#3:223\n22#3:229\n22#3:232\n22#3:237\n148#4:234\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n63#1:204\n65#1:207\n137#1:235\n137#1:238\n57#1:200\n61#1:202\n63#1:205\n65#1:208\n69#1:210,3\n68#1:213\n68#1:215\n113#1:216\n113#1:218\n113#1:219,3\n123#1:222\n123#1:224\n123#1:225,3\n128#1:228\n128#1:230\n133#1:231\n133#1:233\n137#1:236\n137#1:239\n57#1:201\n61#1:203\n63#1:206\n65#1:209\n68#1:214\n113#1:217\n123#1:223\n128#1:229\n133#1:232\n137#1:237\n136#1:234\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m2328constructorimpl(0);
    private static final long Unspecified = m2328constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m2345getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m2346getZeroNHjbRc() {
            return Size.Zero;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2343getUnspecifiedNHjbRc$annotations() {
        }

        @Stable
        /* renamed from: getZero-NH-jbRc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2344getZeroNHjbRc$annotations() {
        }
    }

    private /* synthetic */ Size(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m2325boximpl(long j11) {
        return new Size(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2326component1impl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2327component2impl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m2329copyxjbvk4A(long j11, float f11, float f12) {
        return m2328constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m2330copyxjbvk4A$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (4294967295L & j11));
        }
        return m2329copyxjbvk4A(j11, f11, f12);
    }

    @Stable
    /* renamed from: div-7Ah8Wj8, reason: not valid java name */
    public static final long m2331div7Ah8Wj8(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f11;
        return m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2332equalsimpl(long j11, Object obj) {
        return (obj instanceof Size) && j11 == ((Size) obj).m2342unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2333equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m2334getHeightimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m2335getMaxDimensionimpl(long j11) {
        return Math.max(Float.intBitsToFloat((int) ((j11 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j11 & SieveCacheKt.NodeLinkMask)));
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m2336getMinDimensionimpl(long j11) {
        return Math.min(Float.intBitsToFloat((int) ((j11 >> 32) & SieveCacheKt.NodeLinkMask)), Float.intBitsToFloat((int) (j11 & SieveCacheKt.NodeLinkMask)));
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m2337getWidthimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2338hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m2339isEmptyimpl(long j11) {
        long j12 = (~((((-9223372034707292160L) & j11) >>> 31) * (-1))) & j11;
        return (((j12 & 4294967295L) & (j12 >>> 32)) == 0) | (j11 == InlineClassHelperKt.UnspecifiedPackedFloats);
    }

    @Stable
    /* renamed from: times-7Ah8Wj8, reason: not valid java name */
    public static final long m2340times7Ah8Wj8(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2341toStringimpl(long j11) {
        if (j11 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Size.Unspecified";
        }
        return "Size(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j11 >> 32)), 1) + j2.O + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j11 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return m2332equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m2338hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m2341toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2342unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMaxDimension$annotations() {
    }

    @Stable
    public static /* synthetic */ void getMinDimension$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2328constructorimpl(long j11) {
        return j11;
    }
}
