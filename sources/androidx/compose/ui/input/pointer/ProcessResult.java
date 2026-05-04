package androidx.compose.ui.input.pointer;

import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m3814boximpl(int i11) {
        return new ProcessResult(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3816equalsimpl(int i11, Object obj) {
        return (obj instanceof ProcessResult) && i11 == ((ProcessResult) obj).m3822unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3817equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m3818getAnyMovementConsumedimpl(int i11) {
        return (i11 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m3819getDispatchedToAPointerInputModifierimpl(int i11) {
        return (i11 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3820hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3821toStringimpl(int i11) {
        return "ProcessResult(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m3816equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3820hashCodeimpl(this.value);
    }

    public String toString() {
        return m3821toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3822unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3815constructorimpl(int i11) {
        return i11;
    }
}
