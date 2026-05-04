package androidx.collection;

import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.g;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,84:1\n51#1:92\n55#1:94\n22#2,3:85\n22#3:88\n22#3:89\n22#3:90\n22#3:91\n22#3:93\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n82#1:92\n82#1:94\n47#1:85,3\n51#1:88\n55#1:89\n67#1:90\n80#1:91\n82#1:93\n*E\n"})
/* loaded from: classes.dex */
public final class FloatFloatPair {

    @g
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m2boximpl(long j11) {
        return new FloatFloatPair(j11);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m3component1impl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4component2impl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7equalsimpl(long j11, Object obj) {
        return (obj instanceof FloatFloatPair) && j11 == ((FloatFloatPair) obj).m13unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m9getFirstimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m10getSecondimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12toStringimpl(long j11) {
        return '(' + Float.intBitsToFloat((int) (j11 >> 32)) + j2.O + Float.intBitsToFloat((int) (j11 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m7equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m11hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m12toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m13unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5constructorimpl(float f11, float f12) {
        return m6constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }
}
