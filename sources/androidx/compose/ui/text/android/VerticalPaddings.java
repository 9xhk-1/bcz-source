package androidx.compose.ui.text.android;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@u0({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1127:1\n28#2:1128\n33#2:1129\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n965#1:1128\n968#1:1129\n*E\n"})
/* loaded from: classes2.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m4606boximpl(long j11) {
        return new VerticalPaddings(j11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4608equalsimpl(long j11, Object obj) {
        return (obj instanceof VerticalPaddings) && j11 == ((VerticalPaddings) obj).m4614unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4609equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m4610getBottomPaddingimpl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m4611getTopPaddingimpl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4612hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4613toStringimpl(long j11) {
        return "VerticalPaddings(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m4608equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4612hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4613toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4614unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4607constructorimpl(long j11) {
        return j11;
    }
}
