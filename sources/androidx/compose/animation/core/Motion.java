package androidx.compose.animation.core;

import kotlin.jvm.internal.u0;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,152:1\n60#2:153\n70#2:155\n22#3:154\n22#3:156\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n32#1:153\n35#1:155\n32#1:154\n35#1:156\n*E\n"})
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m154boximpl(long j11) {
        return new Motion(j11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m156equalsimpl(long j11, Object obj) {
        return (obj instanceof Motion) && j11 == ((Motion) obj).m162unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m157equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m158getValueimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m159getVelocityimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m160hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m161toStringimpl(long j11) {
        return "Motion(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m156equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m160hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m161toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m162unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m155constructorimpl(long j11) {
        return j11;
    }
}
