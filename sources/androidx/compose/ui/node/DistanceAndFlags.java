package androidx.compose.ui.node;

import kotlin.jvm.internal.u0;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,410:1\n60#2:411\n22#3:412\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n*L\n373#1:411\n373#1:412\n*E\n"})
/* loaded from: classes2.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m3994boximpl(long j11) {
        return new DistanceAndFlags(j11);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m3995compareTo9YPOF3E(long j11, long j12) {
        boolean m4002isInLayerimpl = m4002isInLayerimpl(j11);
        if (m4002isInLayerimpl != m4002isInLayerimpl(j12)) {
            return m4002isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m3999getDistanceimpl(j11), m3999getDistanceimpl(j12)) >= 0.0f && m4001isInExpandedBoundsimpl(j11) != m4001isInExpandedBoundsimpl(j12)) ? m4001isInExpandedBoundsimpl(j11) ? -1 : 1 : (int) Math.signum(m3999getDistanceimpl(j11) - m3999getDistanceimpl(j12));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3997equalsimpl(long j11, Object obj) {
        return (obj instanceof DistanceAndFlags) && j11 == ((DistanceAndFlags) obj).m4004unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3998equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m3999getDistanceimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4000hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m4001isInExpandedBoundsimpl(long j11) {
        return (j11 & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m4002isInLayerimpl(long j11) {
        return (j11 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4003toStringimpl(long j11) {
        return "DistanceAndFlags(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m3997equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m4000hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4003toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4004unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3996constructorimpl(long j11) {
        return j11;
    }
}
