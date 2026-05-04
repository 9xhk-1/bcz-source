package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.u0;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1475:1\n1132#1:1479\n1129#1:1481\n80#2:1476\n85#2:1477\n90#2:1478\n90#2:1480\n85#2:1482\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n1135#1:1479\n1135#1:1481\n1126#1:1476\n1129#1:1477\n1132#1:1478\n1135#1:1480\n1135#1:1482\n*E\n"})
/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m953boximpl(long j11) {
        return new SpanRange(j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m955constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m956equalsimpl(long j11, Object obj) {
        return (obj instanceof SpanRange) && j11 == ((SpanRange) obj).m963unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m957equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m958getEndimpl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m959getSizeimpl(long j11) {
        return ((int) (4294967295L & j11)) - ((int) (j11 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m960getStartimpl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m961hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m962toStringimpl(long j11) {
        return "SpanRange(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m956equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m961hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m962toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m963unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m954constructorimpl(int i11, int i12) {
        return m955constructorimpl(((i12 + i11) & 4294967295L) | (i11 << 32));
    }
}
