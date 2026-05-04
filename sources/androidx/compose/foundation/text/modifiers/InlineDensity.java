package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nInlineDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,51:1\n53#2,3:52\n60#2:55\n70#2:57\n22#3:56\n22#3:58\n*S KotlinDebug\n*F\n+ 1 InlineDensity.kt\nandroidx/compose/foundation/text/modifiers/InlineDensity\n*L\n33#1:52,3\n38#1:55\n41#1:57\n38#1:56\n41#1:58\n*E\n"})
/* loaded from: classes.dex */
public final class InlineDensity {

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m1385constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m1395getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InlineDensity(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m1384boximpl(long j11) {
        return new InlineDensity(j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m1386constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1388equalsimpl(long j11, Object obj) {
        return (obj instanceof InlineDensity) && j11 == ((InlineDensity) obj).m1394unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1389equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m1390getDensityimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m1391getFontScaleimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1392hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1393toStringimpl(long j11) {
        return "InlineDensity(density=" + m1390getDensityimpl(j11) + ", fontScale=" + m1391getFontScaleimpl(j11) + ')';
    }

    public boolean equals(Object obj) {
        return m1388equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1392hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m1393toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1394unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1387constructorimpl(@k Density density) {
        return m1385constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1385constructorimpl(float f11, float f12) {
        return m1386constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }
}
