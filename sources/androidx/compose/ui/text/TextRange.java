package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n85#2:124\n90#2:125\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n53#1:124\n56#1:125\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class TextRange {

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m4564getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m4547boximpl(long j11) {
        return new TextRange(j11);
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m4549contains5zctL8(long j11, long j12) {
        return (m4557getMinimpl(j11) <= m4557getMinimpl(j12)) & (m4556getMaximpl(j12) <= m4556getMaximpl(j11));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m4550containsimpl(long j11, int i11) {
        return i11 < m4556getMaximpl(j11) && m4557getMinimpl(j11) <= i11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4551equalsimpl(long j11, Object obj) {
        return (obj instanceof TextRange) && j11 == ((TextRange) obj).m4563unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4552equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m4553getCollapsedimpl(long j11) {
        return m4559getStartimpl(j11) == m4554getEndimpl(j11);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m4554getEndimpl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m4555getLengthimpl(long j11) {
        return m4556getMaximpl(j11) - m4557getMinimpl(j11);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m4556getMaximpl(long j11) {
        return Math.max(m4559getStartimpl(j11), m4554getEndimpl(j11));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m4557getMinimpl(long j11) {
        return Math.min(m4559getStartimpl(j11), m4554getEndimpl(j11));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m4558getReversedimpl(long j11) {
        return m4559getStartimpl(j11) > m4554getEndimpl(j11);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m4559getStartimpl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4560hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m4561intersects5zctL8(long j11, long j12) {
        return (m4557getMinimpl(j11) < m4556getMaximpl(j12)) & (m4557getMinimpl(j12) < m4556getMaximpl(j11));
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4562toStringimpl(long j11) {
        return "TextRange(" + m4559getStartimpl(j11) + j2.O + m4554getEndimpl(j11) + ')';
    }

    public boolean equals(Object obj) {
        return m4551equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4560hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m4562toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4563unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4548constructorimpl(long j11) {
        return j11;
    }
}
