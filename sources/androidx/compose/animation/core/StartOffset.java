package androidx.compose.animation.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.v;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j11) {
        this.value = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m165boximpl(long j11) {
        return new StartOffset(j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m167constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m168constructorimpl$default(int i11, int i12, int i13, v vVar) {
        if ((i13 & 2) != 0) {
            i12 = StartOffsetType.Companion.m183getDelayEo1U57Q();
        }
        return m166constructorimpl(i11, i12);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m169equalsimpl(long j11, Object obj) {
        return (obj instanceof StartOffset) && j11 == ((StartOffset) obj).m175unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m170equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m171getOffsetMillisimpl(long j11) {
        return Math.abs((int) j11);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m172getOffsetTypeEo1U57Q(long j11) {
        boolean z11 = j11 > 0;
        if (z11) {
            return StartOffsetType.Companion.m184getFastForwardEo1U57Q();
        }
        if (z11) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.Companion.m183getDelayEo1U57Q();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m173hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m174toStringimpl(long j11) {
        return "StartOffset(value=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m169equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m173hashCodeimpl(this.value);
    }

    public String toString() {
        return m174toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m175unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m166constructorimpl(int i11, int i12) {
        return m167constructorimpl(i11 * i12);
    }
}
