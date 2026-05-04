package androidx.compose.ui.input.pointer;

import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class PointerId {
    private final long value;

    private /* synthetic */ PointerId(long j11) {
        this.value = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m3711boximpl(long j11) {
        return new PointerId(j11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3713equalsimpl(long j11, Object obj) {
        return (obj instanceof PointerId) && j11 == ((PointerId) obj).m3717unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3714equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3715hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3716toStringimpl(long j11) {
        return "PointerId(value=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m3713equalsimpl(this.value, obj);
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3715hashCodeimpl(this.value);
    }

    public String toString() {
        return m3716toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3717unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3712constructorimpl(long j11) {
        return j11;
    }
}
