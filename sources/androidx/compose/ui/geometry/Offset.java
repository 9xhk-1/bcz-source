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
@u0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,285:1\n65#1:290\n69#1:293\n65#1:343\n69#1:346\n60#2:286\n70#2:288\n60#2:291\n70#2:294\n53#2,3:296\n60#2:299\n70#2:301\n60#2:302\n70#2:304\n60#2:306\n70#2:308\n60#2:310\n70#2:312\n53#2,3:314\n60#2:317\n70#2:319\n53#2,3:321\n60#2:324\n70#2:326\n53#2,3:327\n60#2:330\n70#2:332\n53#2,3:333\n60#2:336\n70#2:338\n53#2,3:339\n60#2:344\n70#2:347\n22#3:287\n22#3:289\n22#3:292\n22#3:295\n22#3:300\n22#3:303\n22#3:305\n22#3:307\n22#3:309\n22#3:311\n22#3:313\n22#3:318\n22#3:320\n22#3:325\n22#3:331\n22#3:337\n22#3:345\n273#4:342\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n71#1:290\n73#1:293\n227#1:343\n227#1:346\n65#1:286\n69#1:288\n71#1:291\n73#1:294\n77#1:296,3\n76#1:299\n76#1:301\n123#1:302\n124#1:304\n135#1:306\n136#1:308\n164#1:310\n165#1:312\n163#1:314,3\n180#1:317\n181#1:319\n179#1:321,3\n195#1:324\n195#1:326\n195#1:327,3\n208#1:330\n208#1:332\n208#1:333,3\n221#1:336\n221#1:338\n221#1:339,3\n227#1:344\n227#1:347\n65#1:287\n69#1:289\n71#1:292\n73#1:295\n76#1:300\n123#1:303\n124#1:305\n135#1:307\n136#1:309\n164#1:311\n165#1:313\n180#1:318\n181#1:320\n195#1:325\n208#1:331\n221#1:337\n227#1:345\n226#1:342\n*E\n"})
@Immutable
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m2260constructorimpl(0);
    private static final long Infinite = m2260constructorimpl(InlineClassHelperKt.DualFloatInfinityBase);
    private static final long Unspecified = m2260constructorimpl(InlineClassHelperKt.UnspecifiedPackedFloats);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m2282getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m2283getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m2284getZeroF1C5BW0() {
            return Offset.Zero;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2279getInfiniteF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2280getUnspecifiedF1C5BW0$annotations() {
        }

        @Stable
        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m2281getZeroF1C5BW0$annotations() {
        }
    }

    private /* synthetic */ Offset(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m2257boximpl(long j11) {
        return new Offset(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2258component1impl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2259component2impl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m2261copydBAh8RU(long j11, float f11, float f12) {
        return m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m2262copydBAh8RU$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (4294967295L & j11));
        }
        return m2261copydBAh8RU(j11, f11, f12);
    }

    @Stable
    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m2263divtuRUvjQ(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f11;
        return m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2264equalsimpl(long j11, Object obj) {
        return (obj instanceof Offset) && j11 == ((Offset) obj).m2278unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2265equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    @Stable
    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m2266getDistanceimpl(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2));
    }

    @Stable
    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m2267getDistanceSquaredimpl(long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2);
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m2268getXimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m2269getYimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2270hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m2271isValidimpl(long j11) {
        return (((j11 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0;
    }

    @Stable
    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m2272minusMKHz9U(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m2273plusMKHz9U(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j12 & 4294967295L));
        return m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m2274remtuRUvjQ(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) % f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) % f11;
        return m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m2275timestuRUvjQ(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2276toStringimpl(long j11) {
        if ((9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j11 >> 32)), 1) + j2.O + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j11 & 4294967295L)), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m2277unaryMinusF1C5BW0(long j11) {
        return m2260constructorimpl(j11 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m2264equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m2270hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m2276toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2278unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2260constructorimpl(long j11) {
        return j11;
    }
}
