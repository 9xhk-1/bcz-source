package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@h
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m847boximpl(long j11) {
        return new GridItemSpan(j11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m849equalsimpl(long j11, Object obj) {
        return (obj instanceof GridItemSpan) && j11 == ((GridItemSpan) obj).m854unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m850equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m851getCurrentLineSpanimpl(long j11) {
        return (int) j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m852hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m853toStringimpl(long j11) {
        return "GridItemSpan(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m849equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m852hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m853toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m854unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m848constructorimpl(long j11) {
        return j11;
    }
}
