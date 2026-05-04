package androidx.collection;

import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.g;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,82:1\n29#2:83\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n46#1:83\n*E\n"})
/* loaded from: classes.dex */
public final class IntIntPair {

    @g
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m14boximpl(long j11) {
        return new IntIntPair(j11);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m15component1impl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m16component2impl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m19equalsimpl(long j11, Object obj) {
        return (obj instanceof IntIntPair) && j11 == ((IntIntPair) obj).m25unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m21getFirstimpl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m22getSecondimpl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24toStringimpl(long j11) {
        return '(' + m21getFirstimpl(j11) + j2.O + m22getSecondimpl(j11) + ')';
    }

    public boolean equals(Object obj) {
        return m19equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m23hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m24toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m25unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m17constructorimpl(int i11, int i12) {
        return m18constructorimpl((i12 & 4294967295L) | (i11 << 32));
    }
}
